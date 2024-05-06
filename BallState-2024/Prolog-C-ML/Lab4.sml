(*
Austen Lowder
02/08/2024
Program details: Write multiple functions to help better understand lists and what you can do with them.
*)
(* 1. Write a function named sort2 *)
fun sort2 (x, y) =
  if x < y then [x, y] else [y, x];

(* 2. Write a function named cycle1 *)
fun cycle1 lst =
  case lst of
    [] => []
  | hd :: tl => tl @ [hd];

(* 3. Write a function named delete_second *)
fun delete_second lst =
  case lst of
    [] => []
  | hd :: _ :: tl => hd :: tl
  | _ => lst; 

(* 4. Write a function sort3*)
fun sort3 (x, y, z) =
  if x <= y then
    if y <= z then [x, y, z]
    else if x <= z then [x, z, y]
    else [z, x, y]
  else if x <= z then [y, x, z]
  else if y <= z then [y, z, x]
  else [z, y, x];
