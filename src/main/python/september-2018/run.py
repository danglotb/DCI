# coding=utf-8
import os
import toolbox
import sys


def run(project):
    path_to_project_json = toolbox.prefix_current_dataset + project + ".json"
    project_json = toolbox.get_json_file(path_to_project_json)
    path_to_project_root = toolbox.prefix_dataset + project
    commits = project_json["commits"]

    # for each commits.
    for commit in commits[1:2]:
        toolbox.set_output_log_path(toolbox.prefix_result + project + "/commits_" + str(commits.index(commit)) + ".log")
        #  1) set up both version of the program
        cmd = [
            "java",
            "-cp",
            toolbox.get_absolute_path(toolbox.path_to_jar),
            toolbox.full_qualified_name_repositories_setter,
            "--path-to-repository", path_to_project_root,
            "--project", project,
            "--folder-with-json", toolbox.prefix_current_dataset,
            "--commit-index", str(commits.index(commit)),
        ]
        toolbox.print_and_call(cmd)

        path_to_concerned_module = toolbox.get_absolute_path(
            toolbox.prefix_dataset + project + "/" + commit["concernedModule"])
        path_to_concerned_module_parent = toolbox.get_absolute_path(
            toolbox.prefix_dataset + project + toolbox.suffix_parent + "/" + commit["concernedModule"])

        create_diff(commit["parent"], path_to_concerned_module)

        path_to_test_that_executes_the_changes = toolbox.get_path_to_csv_file(project, str(commits.index(commit)))

        # must build all the project, i.e. installing the version

        # if the list does not exists, then compute it
        if not os.path.isdir(path_to_test_that_executes_the_changes):
            return_code = get_list_of_tests_that_execute_changes(commit["concernedModule"],
                                                                 path_to_concerned_module,
                                                                 path_to_concerned_module_parent)
            print return_code
            if return_code != 0:
                cmd = ["mvn", "clean", "install", "-DskipTests"]
                toolbox.print_and_call(cmd, cwd=path_to_project_root)
            get_list_of_tests_that_execute_changes(commit["concernedModule"],
                                                   path_to_concerned_module,
                                                   path_to_concerned_module_parent)

        '''mvn clean eu.stamp-project:diff-test-selection:0.3:list -DpathToDiff="patch.diff" -DpathToOtherVersion="../tavern_pr"  eu.stamp-project:dspot-maven:1.1.1-SNAPSHOT:amplify-unit-tests -Dpath-to-test-list-csv="testsThatExecuteTheChange.csv" -Dverbose=True -Dtest-criterion=ChangeDetectorSelector -Dpath-to-second-version=../tavern_pr -Diteration=5 -Damplifiers=TestDataMutator
        '''


def get_list_of_tests_that_execute_changes(concerned_module, path_to_concerned_module, path_to_concerned_module_parent):
    cmd = [
        "mvn", "clean",
        "eu.stamp-project:diff-test-selection:0.4:list",
        "-DpathToDiff=patch.diff",
        "-DpathToOtherVersion=" + path_to_concerned_module_parent,
        "-Dmodule=" + concerned_module
    ]
    return_code = toolbox.print_and_call(cmd, cwd=path_to_concerned_module)
    return return_code

def create_diff(commit_id, cwd):
    toolbox.delete_if_exists(
        cwd + "/patch.diff"
    )
    cmd = [
        "git", "diff",
        commit_id,
        ">", "patch.diff"
    ]
    toolbox.print_and_call_in_a_file_no_redirection(cmd, cwd=cwd)


if __name__ == '__main__':
    if len(sys.argv) < 2 or "all" == sys.argv[1]:
        projects = ["xwiki-commons"]
        for project in projects:
            run(project)
    else:
        run(sys.argv[1])
