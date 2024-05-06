%Author: Austen Lowder
%Date: 3/30/2024
%lab10.pl
% CS Core required courses for a Computer Science degree

% Facts about required CS courses
required(cs120).
required(cs121).
required(cs124).
required(cs222).
required(cs224).
required(cs230).
required(cs239).
required(cs316).
required(cs495).
required(cs498).
required(math165). % MATH class (as of 2023) calculus?

% Facts about prerequisites for CS courses
hasPrereq(cs121, cs120).
hasPrereq(cs222, cs121).
hasPrereq(cs224, cs124).
hasPrereq(cs230, [cs121, cs124]).
hasPrereq(cs239, cs222).
hasPrereq(cs316, [cs224, cs230]).
hasPrereq(cs495, [cs222, COMM210]).
hasPrereq(cs498, cs495).
hasPrereq(math165, [MATH111,MATH112]).

% Query to find out which classes are required
% Example usage: required(WhichClassesAreRequired).
required(WhichClassesAreRequired) :-
    required(WhichClassesAreRequired).

% Query to find out prerequisites for a specific course
% Example usage: hasPrereq(cs316, WhichClasses).
hasPrereq(Course, Prerequisites) :-
    hasPrereq(Course, Prerequisites).

% Query to find out which classes have a specific course as a prerequisite
% Example usage: hasPrereq(WhichDependOnCS121, cs121).
hasPrereq(WhichDependOn, Prerequisite) :-
    hasPrereq(WhichDependOn, Prerequisite).
