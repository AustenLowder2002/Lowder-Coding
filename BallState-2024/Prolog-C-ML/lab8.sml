(*Author: Austen Lowder
  Date: 2/28/2023
  Program description: gain more understanding of lists and their uses along with messing with strings in order! *)
(*Exercise 1 multpairs*)
fun multpairs list = map (fn (a,b) => a*b) list;

(*Excercise 2 myimplode*)
let myimplode : char list -> string =
  fun char_list -> List.fold_right (fun c acc -> String.make 1 c ^ acc) char_list ""
;;