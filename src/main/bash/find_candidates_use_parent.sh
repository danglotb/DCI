#!/usr/bin/env bash

project=${1}
owner=${2}
goal=${3}
mkdir -p september-2018/result/${project}_parent/
log=september-2018/result/${project}_parent/test_selection.log

echo ${log}

cmd="java -cp target/experiments-0.1-SNAPSHOT-jar-with-dependencies.jar icst.experiments.commits.ProjectJSONBuilder --path-to-repository september-2018/dataset/${project} --owner ${owner} --project ${project} --output september-2018/dataset/ --size-goal ${goal} --use-parent 2>&1 | tee -a ${log}"
echo ${cmd}
echo ${cmd} >> ${log}
eval ${cmd}