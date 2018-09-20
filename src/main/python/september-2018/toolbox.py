from subprocess import PIPE, Popen
import subprocess
import json
import os
import shutil

# env
maven_home = ""
java_home = ""

# paths
prefix_dataset = "september-2018/dataset/"
prefix_current_dataset = "september-2018/dataset/"
output_log_path = ""

prefix_url_github = "https://github.com/"
prefix_result = "september-2018/result/"

path_to_jar = "target/experiments-0.1-SNAPSHOT-jar-with-dependencies.jar"
full_qualified_name_repositories_setter = "icst.experiments.repositories.RepositoriesSetter"

suffix_parent = "_parent"

name_of_csv_with_list_of_test_that_execute_the_changes = "testsThatExecuteTheChanges"

# input: commit from json array, and the array itself
def get_output_folder_for_commit(commit, commits):
    return "commit_" + str(commits.index(commit)) + "_" + str(commit["sha"]).substring(0, 7)

def get_path_to_csv_file(project, commit, commits):
    return get_absolute_path(
        prefix_result + project + "/" + get_output_folder_for_commit(commit, commits)
    )

def delete_if_exists(path):
    if os.path.isdir(path):
        shutil.rmtree(path)

def create(path):
    if not os.path.isdir(path):
        os.makedirs(path)

def set_output_log_path(path):
    global output_log_path
    delete_if_exists(path)
    output_log_path = path


def get_absolute_path(path_file):
    return os.path.abspath(path_file)


def get_json_file(file_path):
    if not file_path.endswith(".json"):
        file_path = file_path + ".json"
    with open(file_path) as data_file:
        return json.load(data_file)


def print_and_call_no_redirection(cmd, cwd=None):
    if not cwd is None:
        print cwd
    print " ".join(cmd)
    subprocess.call(cmd, cwd=cwd)


def print_and_call_in_a_file_no_redirection(cmd, cwd=None):
    with open(path_to_script_to_run, "w") as f:
        cmd_to_execute = " ".join(cmd)
        print cmd_to_execute
        f.write(cmd_to_execute)
        f.close()
    subprocess.call(path_to_script_to_run, cwd=cwd, shell=True)


def print_and_call(cmd, cwd=None):
    if not cwd is None:
        print cwd
    print " ".join(cmd) + " | " + " ".join(["tee", "-a", output_log_path])
    p1 = Popen(cmd, stdout=PIPE, cwd=cwd)
    p2 = Popen(["tee", "-a", output_log_path], stdin=p1.stdout, stdout=PIPE, stderr=PIPE, cwd=cwd)
    print p2.communicate()[0]
    return p2.returncode


path_to_script_to_run = get_absolute_path("src/main/bash/script.sh")


def print_and_call_in_a_file(cmd, cwd=None):
    with open(output_log_path, "a") as myfile:
        myfile.write(cmd)
    print cmd
    with open(path_to_script_to_run, "w") as f:
        f.write(cmd + " " + " ".join(["2>&1", "|", "tee", "-a", output_log_path]))
        f.close()
    subprocess.call(path_to_script_to_run, cwd=cwd, shell=True)


def load_properties(filepath, sep='=', comment_char='#'):
    """
    Read the file passed as parameter as a properties file.
    """
    props = {}
    with open(prefix_resources + filepath + suffix_properties, "rt") as f:
        for line in f:
            l = line.strip()
            if l and not l.startswith(comment_char):
                key_value = l.split(sep)
                key = key_value[0].strip()
                value = sep.join(key_value[1:]).strip().strip('"')
                props[key] = value
    return props


def init(argv):
    global maven_home
    global java_home
    if "onClusty" in argv:
        maven_home = "/home/spirals/danglot/apache-maven-3.5.4/bin/"
        java_home = "/home/spirals/danglot/jdk1.8.0_121/bin/"
    else:
        maven_home = ""
