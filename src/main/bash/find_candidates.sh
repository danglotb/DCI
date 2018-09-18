#!/usr/bin/env bash

project=${1}
owner=${2}
goal=${3}
log=result/september-2018/${project}/test_selection.log

echo ${log}

cmd="java -cp target/experiments-0.1-SNAPSHOT-jar-with-dependencies.jar icst.experiments.commits.ProjectJSONBuilder --path-to-repository dataset/${project} --owner ${owner} --project ${project} --output dataset/september-2018/ --size-goal ${goal} 2&>1 | tee -a ${log}"
echo ${cmd}
echo ${cmd} >> ${log}
eval ${cmd}