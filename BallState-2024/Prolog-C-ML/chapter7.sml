(* Author: Austen Lowder
   Date: 02/23/2024
   Program Description: a serious of programs/functions to better explain arguments *)

(* adds three intergers and gets sum*)
fun sum3tuple (a, b, c) = a + b + c;

(* sums the list of the three input paramenters *)
fun sum3list [a, b, c] = a + b + c
  | sum3list _ = raise Fail "Input list must have exactly 3 elements";

(* it takes 5 integers and evaluates the last elemnt in the list *)
fun pick5th [_, _, _, _, x] = x
  | pick5th _ = raise Fail "Input list must have exactly 5 elements";

(* uses a cons to extract the first element and then doubles it *)
fun double_first (x::_) = 2 * x
  | double_first [] = raise Fail "Input list must not be empty";

(* finds all integers in the list that are less than e *)
fun less (e, L) = List.filter (fn x => x < e) L;

(* repeats if true if the list has two equal elements next to each other. *)
fun repeats [] = false
  | repeats (x::y::xs) = (x = y) orelse repeats (y::xs)
  | repeats _ = false;