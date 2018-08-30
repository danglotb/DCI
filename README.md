# ICST-2019
[![Build Status](https://travis-ci.com/danglotb/icst-2019.svg?token=DB3rRjU52uk4b4n5cZmc&branch=master)](https://travis-ci.com/danglotb/icst-2019)

## Selection of projects

We first conduct a pilot experiment with `xwiki-commons`.

## Selection of commits

We select the commit that modifies java source code, _i.e._ the list of java file of the source folder `src/main/java` returned by a `git diff` between the current revision (the commit considered) and its parent commit is not empty.

We take a maximum 1000 different commits per project.

## Selection of test to be amplified

We amplify test classes and test methods that executes the changes introduced by the considered commit.