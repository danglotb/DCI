import sys
import toolbox
import os


def build_table(projects):
    gray = False
    for project in projects:
        project_json = toolbox.get_json_file(toolbox.get_absolute_path(toolbox.prefix_current_dataset + project))
        nb_commit = project_json["numberCommits"]  # DATA 1
        commits = project_json["commits"]
        nb_test_to_be_amplified = 0  # DATA 2
        nb_success = [0, 0]  # DATA 3
        nb_test_amplified = [0, 0]  # DATA 4
        time = [0, 0]
        for commit_json in commits:
            path_to_commit_folder = toolbox.get_absolute_path(
                toolbox.prefix_result + project + '/' + toolbox.get_output_folder_for_commit(commit_json, commits)
            ) + '/'
            nb_test_to_be_amplified = nb_test_to_be_amplified + get_nb_test_to_be_amplified(path_to_commit_folder)
            modes = ["assert_amplification", "input_amplification"]
            for mode in modes:
                path_to_mode_result = path_to_commit_folder + '/' + mode + '/'
                if os.path.isdir(path_to_mode_result):
                    if is_success(path_to_mode_result):
                        nb_success[modes.index(mode)] = nb_success[modes.index(mode)] + 1
                    nb_test_amplified[modes.index(mode)] = nb_test_amplified[modes.index(mode)] + get_nb_test_amplified(
                        path_to_mode_result)
                    if not commit_json['concernedModule'] == "":
                        time[modes.index(mode)] = get_time(path_to_mode_result,
                                                           commit_json['concernedModule'].split('/')[-2])
                    else:
                        time[modes.index(mode)] = get_time(path_to_mode_result, project + toolbox.suffix_parent)

        percentage_success_aampl = compute_percentage(nb_commit, nb_success[0])
        percentage_success_iampl = compute_percentage(nb_commit, nb_success[1])

        time[0] = convert_time(time[0])
        time[1] = convert_time(time[1])

        line = '{}\t&\t{}\t&\t{}\t&\t{}\t&\t{}\t&\t{}\t&\t{}\t&\t{}\t&\t{}\t&\t{}\t&\t{}\\\\'.format(
            '\\textsc{' + project + '}',
            nb_commit,
            nb_test_to_be_amplified,
            nb_test_amplified[0],
            nb_success[0],
            percentage_success_aampl,
            time[0],
            nb_test_amplified[1],
            nb_success[1],
            percentage_success_iampl,
            time[1]
        )
        print '\\rowcolor[HTML]{EFEFEF}\n' if gray else "", line
        gray = not gray


def compute_percentage(total, actual):
    return float(actual) / float(total) * 100.0


def convert_time(time):
    return time / 60


def is_success(path_to_mode_result):
    for root, dirs, files in os.walk(path_to_mode_result):
        for file in files:
            if file.endswith('.java'):
                # print path_to_mode_result
                return True
    return False


def get_nb_test_amplified(path_to_mode_result):
    nb_test_amplified = 0
    for file in os.listdir(path_to_mode_result):
        if file.endswith('_change_detector.json'):
            file_json = toolbox.get_json_file(path_to_mode_result + "/" + file)
            nb_test_amplified = nb_test_amplified + len(file_json['testCases'])
    return nb_test_amplified


def get_time(path_to_mode_result, project):
    time = 0
    if os.path.isfile(path_to_mode_result + project + '.json'):
        project_json_result = toolbox.get_json_file(path_to_mode_result + project)
        for classes_json in project_json_result['classTimes']:
            time = time + classes_json['timeInMs']
    return time


def get_nb_test_to_be_amplified(path_to_commit_folder):
    nb_test_to_be_amplified = 0
    with open(
            path_to_commit_folder + toolbox.name_of_csv_with_list_of_test_that_execute_the_changes + ".csv") as csv_file:
        for line in csv_file:
            nb_test_to_be_amplified = nb_test_to_be_amplified + len(line.split(';')[1:])
    return nb_test_to_be_amplified


if __name__ == '__main__':
    build_table(projects=toolbox.projects)
