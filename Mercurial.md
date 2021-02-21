# Mercurial

## Overview
Software engineers develop large projects with numerous modules and millions of lines of code. Basic time and project management principles necessitate the division of roles and responsibilities. Each engineer and developer is expected to complete certain pieces of code, and others may be beyond the scope of their intricate knowledge. Given perfect design principles, the developers would write the code, and then integrate this new code with their existing code. These stages would be repeated numerous times for each release.
Suppose a situation occurs where a debilitating code issue arises during the seventh release, which was not present in any prior release. As well, suppose that this isue is cumulatively formed after a piece of data runs through three different functions. Evidently, these three functions were added in the interval of development between the sixth and seventh releases.
If such bugs cannot be overcome, then it is necessary for a development team to revert their code to the previous stable version. These situations are where the principles of revision control, or version control, are evident.

The early stages of version control softwares were defined by limitations and constraints. One of these problems was that such systems were centralized; that is, a single remote server would handle the 'final' commits of the developers. This mechanics was fully dependend on remote connectivity rather than a local network, which hindered the speed at which commits could be completed.

In the early 2000s, Git and Mercurial were first developed. These services introduced the new idea of distributed version control systems, which essentially separate commits into two stages: the initial commit, which is performed locally, and the final commit to the main branch, which is fully visible by other users of the VCS. With distributed version control, latency is reduced, and commit errors are better mitigated.

Mercurial is mainly developed in Python, with some small code developed in C.

## Which part of VCS is Mercurial?
As VCS revisions of code should be allocated in some structure, making it more intuitive and visible whenbranches have merged, a universally adopted solution is in place. The directed acyclic graph (DAG) is a graph that visualizes the relationship of all reviews done to the code. The classification in the graph depends on three distinguishable types.

* Root: Not preceded by any other parents or "reviews".
* Merge: Has more than one parent.
* Head: Has no children.

Note that it is possible to have multiple heads in the representation.


## Data Structures

Recognizing the limits of the software at its extreme capacity defines the mechanism that is used to build the software's data structures. When the creators of Mercurial first designed the VCS, they noted several limiting factors:
* Speed of CPU.
* Capacity: disk and memory
* Bandwidth: memory, LAN, disk, and WAN
* Disk seek rate

Obviously, the algorithm needed to ensure that the input and output mechanisms featured high performance but preserved normal operation of the CPU. As well, storing the same file revisions over and over again instead of referring to the original old revision wasted both time and memory. Additionally, annotations needed to display the history of updating a file.

For storing the revisions efficiently given the constraints above, the solution was to use revision logs, or revlogs. The revlog is made up of two main files: an index file, and a data file. The index file is a fixed-length record with ordered contents, marking up some position and information about the location of this revision in the map. Indexing is remarkably efficient, as the disk can fetch the index of any file, instead of fetching all files needed for the review. Next, the logs are required to be handled in all operating systems. As Mercurial is a distributed version control system, a local repository can be cloned on the computer. Thus, it must be ensured that the names are strictly ruled, and consequently valid for all users.

There are three revlogs, and looping through these revlogs forms the cycle used in Mercurial software.
* Changelog
* Manifest log
* File log

The changelog marks the changes needed, and creates manifest logs that  manipulate the file data. As mentioned previously, the indexing is used as the data reference. Thus, the logs are fetched using their indexes instead of the actual data. When another change is queried for specific data, another changelog is issued.

Finally, the working directory is where the changes and final revisions are examined. Mercurial has the functionality of checking the "current progress state" of the file.

## Branches and Tags
Parallel development is possible in Mercurial largely due to the branching mechanism. Developers work separately on the code in their own branches, which are then merged with the main branch in order to be published. An important step of creating branches is naming; unfortunately, Mercurial is less effective in naming than Git. Git uses branch names as references to the original branch. Previously, Mercurial featured no naming scheme, but their development team is attempting to improve the naming in order to enhance the user's experience.

Tags should be determined and marked based on their precedence. Tags are treated as all files in the repository for three main reasons:
* Tags must be changeable, as mistakes happen.
* Tags should be part of the changeset history.
* It should be possible to tag a changeset retroactively.


## Hooks
A key component of version control is interaction with the outside world, which may include sending a notification or visualizing data. Mercurial divides these hooks as pre-command, post-command, controlling, and miscellaneous hooks. The difference in controlling hooks is that they are run directly before an event occurs, and may prevent said event from progressing further.


