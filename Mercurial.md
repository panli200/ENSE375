# Mercurial

## Overview
Software engineers work on a big project with multiple modules and millions of lines of code. Basic time and project management implies them dividing up their roles and each engineer and developer would handle some pieces of code, while the others would handle the rest. Given perfect design principles, the developers would write the code, after which comes the stage of combining the code, or code integration. These stages are repeated over and over every release.
Imagine having the seventh release published and up for users to use, but suddenly a bug pops up which has not been there one release ago. This bug is cumulatively formed after a piece of data runs through 3 different functions. Clearly those three functions had part of the changes in the seventh release.
Such bugs require developers to go back a single step to use the old code. At the end of the day it was old but working.

The early stages of version control softwares were ruled by some limitations and constraints. One of these problems was about the VCS being "Centralized Version Control Systems''. A single remote server would handle the 'final' commits of the developers. This fully depends on remote connectivity instead of local network, which makes the commits slower than they should be.

For solving these problems, in 2005 Git and Mercurial were first developed and introduced the new idea of "Distributed Version Control Systems''. Which basically breaks down commits into two stages, initial commit which is locally done, and the final commit to the main branch to be fully visible by other users of the VCS. This way latency is reduced, and commit errors are better mitigated.

Mercurial is mainly developed in Python with some small code developed in C.

## Which part of VCS is Mercurial?
As VCS revisions of code should be allocated in some structure, making it more intuitive and visible which branches have merged, identifying parents, etc, a universally adopted solution is in place. DAG or "Directed Acyclic Graph" is a graph that visualizes the relationship of all reviews done to the code. The classification in the graph depends on three distinguishable types.

* Root: Not preceded by any other parents or "reviews".
* Merge: Has more than one parent.
* Head: Had no children.

Note that it is possible to have multiple heads in the representation.


## Data Structures

Recognizing the limits of the software at its extreme capacity defines the mechanism that will be used to build the software "Data Structures". At the start when the creators of Mercurial first designed the VCS, they noted some limiting factors.
* Speed of CPU.
* Capacity: disk and memory
* Bandwidth: memory, LAN, disk, and WAN
* Disk seek rate

Obviously the algorithm should ensure the input and output mechanism has high performance while keeping the CPU operating normally. Storing the same file revisions over and over again instead of referring to the original old revision is a waste of memory and storing time. Annotations as well should be handled to show the history of updating a file.


For storing the revisions efficiently given the constraints above, the solution was using revlogs "Revision logs". The revlog is made up of two main files, an index, and a data file.
The index file is a fixed-length record with ordered contents, marking up some position and information about the location of this revision in the map. Indexing is remarkably efficient as the disk could fetch the index which could lead to all files instead of fetching all files needed for the review. The logs are required to be handled in all operating systems. As the Mercurial is a distributed version control system, a local repository could be cloned on the computer.Thus, it must be ensured the names are strictly ruled to make it valid for all users.

There are three revlogs, looping through them forms the cycle used in the Mercurial's software.
* Changelog
* Manifest log
* File log

The changelog marks the changes needed, and creates manifest logs that are going to manipulate the file data. As mentioned previously, the indexing is used as the data reference. Thus the logs are fetched using their indexes instead of the actual data. When another change is to happen on the data, another changelog will be issued.

Finally the working directory is where the changes and final revisions are checked out. Mercurial has the functionality of checking the status "the current progress state of the file".

## Branches and Tags
Part of the parallel development is made possible by the branching mechanism. The developers work separately on the code, each developer's work is developed in a branch which then will be committed to the main branch to be published. An important step of creating branches is the naming, unfortunately Mercurial is less effective in naming than Git. Git uses branch names as reference to the original branch. Mercurial used to have no naming schemes, yet this changed now. Mercurial is working on improving the naming furthermore to make it better for the user experience.

Tags should be determined and marked as of their precedence. Tags are treated as all files in the repository for three main reasons.
* Tags must be changeable as mistakes happen.
* Tags should be part of the changeset history.
* It should be possible to tag a changeset retroactively.


## Hooks
Part of the VCS event is being able to interact with the outside world, such as sending a notification or visualizing data, Mercurial divides these hooks as pre-command, post-command, controlling, and miscellaneous hooks. The difference in controlling hooks is that they are run right before something happens, and may not allow that event to progress further.



