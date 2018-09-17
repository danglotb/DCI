# ICST-2019
[![Build Status](https://travis-ci.com/danglotb/icst-2019.svg?token=DB3rRjU52uk4b4n5cZmc&branch=master)](https://travis-ci.com/danglotb/icst-2019)

## Selection of projects

We first conduct a pilot experiment with `xwiki-commons`.

## Selection of commits

We select the commit that modifies java source code, _i.e._ the list of java file of the source folder `src/main/java` returned by a `git diff` between the current revision (the commit considered) and its parent commit is not empty.

We take a maximum 1000 different commits per project.

## Selection of test to be amplified

We amplify test classes and test methods that executes the changes introduced by the considered commit.

## Unsupported kinds of Commits:

Here, we list the kind of commits that are not supported by the process. You can find an example in parenthesis with the following syntax: (project#)

1. Changes in documentation, annotation etc ([xwiki-commons#6d0808f](https://github.com/xwiki/xwiki-commons/commit/6d0808f16ca2f6f8a4df41db0c9c914256ee3885))
2. No existing tests execute the changes ([xwiki-commons#bdc33d7](https://github.com/xwiki/xwiki-commons/commit/bdc33d7e07d86dc6600988bd71721068a76e9673))
3. Majority of changes is new contents ([xwiki-commons#c745c10](https://github.com/xwiki/xwiki-commons/commit/c745c10dbbde003a71c743bdb96d00a73f586fe3))
4. The targeted module is only tests ([xwiki-commons#b0dc5bc](https://github.com/xwiki/xwiki-commons/commit/b0dc5bc4db7e0efde64bb5359a1d1772f8e555e7#diff-c565d83ac939ac10f696da2bfa7b7cda))