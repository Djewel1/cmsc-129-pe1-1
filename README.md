
# PROGRAM SPECIFICATION

The program should be able to read a file that contains line(s) of input code, process each
input code, and then output the required information. The program should have a user
interface (UI) that contains the appropriate UI elements for displaying the content of each
input file, for displaying the output, and for displaying program message. The UI should also
contain buttons that will allow the program user to interact with the program.

INPUT. There will be two inputs to the program, a DFA table and a set of strings to be
validated. Each DFA is composed of a set (alphabet) of two unique input symbols only. The
DFA states are labelled using uppercase letters (A, B, C, ..., Z). There should only be one
start state.

Each input to the program will be in a form of a file. The details of the input files are as
follows:
    • A file (.in extension) that contains several input strings placed on separate lines, with each line representing a string.
    • A file (.dfa extension) that contains the transition table for a DFA. The DFA file will be a CSV-style file with the first line specifying the symbols for the alphabet and each succeeding line containing only four elements (in order):
        o Type → start ( - ) or final ( + ) or blank (neither start nor final)
        o State → source state label
        o Destination state for the first input symbol
        o Destination state for the second input symbol
