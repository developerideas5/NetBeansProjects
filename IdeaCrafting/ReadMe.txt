
IdeaBits 
========
(0.3)

Requirements
------------
In general the program should be simple, with as little code as possible.  The
server should store as little information as possible.  All user data should be
kept with the user, i.e., it is the users responsibility to keep track of their 
data.  The project should be open source.

Use Cases
---------
The user should be able to do the following use cases:
- enter new ideas, called ideaBits, and save them under the '_new' keyword
- classify existing ideas, giving each idea one or more keywords
- list ideas related to a keyword
- list all keywords
- list all ideas
- save all ideas and keywords locally
- load all ideas and keywords from a locally stored file

File Format
-----------
All data can be stored in a file called 'IdeaBits.txt'.  The file format is of 
the following form:
- first comes a keyword in one line, followed by \r\n
- then comes one ideaBit for that keyword, followed by \r\n\r\n
- an empty line denotes the separation to the next keyword
- there can be several keywords/ideaBit pairs for the same keyword
In the new version, in the beginning can be a navigation section.
