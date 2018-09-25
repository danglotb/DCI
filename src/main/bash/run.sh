#!/usr/bin/env bash

project=${1}
owner=${2}
goal=${3}

./find_candidates.sh ${project} ${owner} ${goal}
python python src/main/python/september-2018/run-pre-selected.py ${project} 0 ${goal} onClusty