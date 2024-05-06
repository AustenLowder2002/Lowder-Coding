% Exercise 13: Define evenSize Predicate

evenSize([]).                % Base case: An empty list has even size.
evenSize([_,_|T]) :- evenSize(T).  % Recursive case: Skip two elements and check the rest.

% Exercise 14: Define prefix Predicate

prefix([], _).            % Base case: An empty list is a prefix of any list.
prefix([X|Xs], [X|Ys]) :- prefix(Xs, Ys). % Recursive case: Match head and check the rest.

% Exercise 15: Define isMember Predicate

isMember(X, [X|_]).         % Base case: X is the head of the list.
isMember(X, [_|Ys]) :- isMember(X, Ys). % Recursive case: Check the rest of the list.

% Exercise 16: Define isUnion Predicate

% Base case: If X is empty
isUnion([], Y, Y).

% Base case: If Y is empty
isUnion(X, [], X).

% Recursive case: If X is not empty and Y is not empty,
isUnion([X|Xs], Y, [X|Zs]) :- isUnion(Xs, Y, Zs).

% Recursive case: If X is not empty and Y is not empty,
isUnion(X, [Y|Ys], [Y|Zs]) :- isUnion(X, Ys, Zs).
