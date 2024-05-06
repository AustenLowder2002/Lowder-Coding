% Define the transformation rules
transform(you, are, not, i, am).
transform(i, am, not, you, are).
transform(he, is, not, he, is).
transform(she, is, not, she, is).
transform(it, is, not, it, is).
transform(you, are, i, am, not).
transform(i, am, you, are, not).
transform(he, is, he, is, not).
transform(she, is, she, is, not).
transform(it, is, it, is, not).

% Define the predicate to handle the transformation
argue(Input, Output) :-
    transform(Input, Output).

% Example usage:
% ?- argue([you, are, not], Output).
% Output = [i, am]
% ?- argue([i, am, not], Output).
% Output = [you, are]
% ?- argue([he, is, not], Output).
% Output = [he, is]
