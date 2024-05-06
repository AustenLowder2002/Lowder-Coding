(*
   Author: Austen Lowder
   Date: 2024-02-01
   Program Name: Lab03
   Purpose: Introduction to SML programming and basic functions in SML
*)

(* A variable named phi representing the golden ratio *)
val phi: real = 2.23607;

(* A variable named remainder using mod to calculate the remainder after 123456789 is divided by 42 *)
val remainder: int = 123456789 mod 42;

(* A variable named mytuple of type int * real * string *)
val mytuple: int * real * string = (42, 3.14, "Hello");

(* A variable named mylist of type string list containing 5 strings *)
val mylist: string list = ["apple", "banana", "cherry", "date", "elderberry"];

(*A variable named newlist with two strings added to the front and two to the end of mylist *)
val newlist: string list = ["pineapple", "strawberry"] @ mylist @ ["mango", "pear"];

(* A variable named intlist of type int list containing a few numbers *)
val intlist: int list = [1, 2, 3, 4, 5];

(*A variable named newintlist with one item added to the front using the cons operator :: *)
val newintlist: int list = 0 :: intlist;


