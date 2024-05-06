(*
Austen Lowder
02/03/2024
program description: getting used to functions in sml
*)

(*returns cube of value*)
fun cube(x: int): int =
    x * x * x;

(*returns fourth element of a list*)

fun fourth(lst: 'a list): 'a =
    hd(tl(tl(tl lst)));

(*find smallest int*)

fun min3(a: int, b: int, c: int): int =
    if a <= b andalso a <= c then a
    else if b <= a andalso b <= c then b
    else c;

(*converts tuple with three elements into one*)

fun red3(tuple: 'a * 'b * 'c): 'a * 'c =
    let
        val (first, _, third) = tuple
    in
        (first, third)
    end;