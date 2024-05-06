(* Author: Austen Lowder
   Date: 02/16/2024
   Program Discription: This program is to show off recursive functions that SML can do.
   *)
fun sqsum (n: int): int =
    if n < 0 then
        raise Fail "Input must be a non-negative integer"
    else
        if n = 0 then
            0
        else
            n * n + sqsum (n - 1);

(* cycle function *)
fun cycle (lst: 'a list, n: int): 'a list =
    if n < 0 then
        raise Fail "Rotation count must be non-negative"
    else
        let
            fun rotate(0, xs, rotated) = rotated @ xs
              | rotate(k, x::xs, rotated) = rotate(k - 1, xs, rotated @ [x])
              | rotate(_, [], _) = raise Fail "List too short for rotation count"
        in
            rotate(n, lst, [])
        end;

(* power function *)
fun pow (base: real, exponent: int): real =
    if exponent = 0 then
        1.0
    else if exponent > 0 then
        base * pow(base, exponent - 1)
    else
        1.0 / (base * pow(base, ~exponent - 1));

