(*
Author: Austen Lowder
Date: 02/23/2024
Program description: This program is an implementation of the quicksort algorithim where you use a pivot to 
                     split an array/list in half and in half again until you eventually sort it and merge it all back togeher*)
fun split([], pivot) = ([], [])
  | split(x::xs, pivot) =
    let
      val (less, greater) = split(xs, pivot)
    in
      if x < pivot then (x::less, greater)
      else (less, x::greater)
    end;

fun quicksort([]) = []
  | quicksort(x::xs) =
    let
      val (less, greater) = split(xs, x)
    in
      quicksort(less) @ [x] @ quicksort(greater)
    end; 