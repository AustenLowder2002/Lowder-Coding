%Author: Austen Lowder
%Date: 4/08/2024
%lab11.pl
% few facts and rules

firstPair([H,H|_]).

de13([X,Y,_,Z|Rest], [X,Y|Rest]).

dupList([], []).
dupList([H|T], [H,H|Rest]) :- dupList(T, Rest).

isMember(X, [X|_]).
isMember(X, [_|T]) :- isMember(X, T).
