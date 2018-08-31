import json
import sys
import toolbox


def install(project):
    toolbox.set_output_log_path(toolbox.get_absolute_path(toolbox.prefix_result + project + "_install.log"))

    with open(toolbox.prefix_current_dataset + project + '.json') as data_file:
        data = json.load(data_file)

    toolbox.print_and_call(
        ["git", "clone",
         toolbox.prefix_url_github + data["owner"] + "/" + data["name"], toolbox.prefix_dataset + project]
    )

    toolbox.print_and_call(
        ["git", "clone",
         toolbox.prefix_url_github + data["owner"] + "/" + data["name"], toolbox.prefix_dataset + project + toolbox.suffix_parent]
    )

if __name__ == '__main__':

    if len(sys.argv) < 2 or "all" == sys.argv[1]:
        projects = ["xwiki-commons"]
        for project in projects:
            install(project)
    else:
        install(sys.argv[1])
