(* Team Members: Austen Lowder, Dennis Beaver
   Date: 4/11/2024
   Purpose: Determine if a string is a palindrome *)

(* Helper function to reverse a list *)
fun my_reverse [] = []
  | my_reverse (x::xs) = (my_reverse xs) @ [x];

(* Helper function to check if a character is alphabetic *)
fun isAlpha c =
    let
        val code = Char.ord c
    in
        (code >= 65 andalso code <= 90) orelse (code >= 97 andalso code <= 122)
    end;

(* Helper function to check if a character is uppercase *)
fun isUpper c =
    let
        val code = Char.ord c
    in
        code >= 65 andalso code <= 90
    end;

(* Helper function to convert a character to lowercase *)
fun toLower c =
    if isUpper c then
        Char.chr (Char.ord c + 32)
    else
        c;

(* Helper function to remove non-alphabetic characters from a list *)
fun removeNonAlphabetic [] = []
  | removeNonAlphabetic (x::xs) =
      if isAlpha x then
        x :: removeNonAlphabetic xs
      else
        removeNonAlphabetic xs;

(* Helper function to convert uppercase letters to lowercase *)
fun changeToLowercase [] = []
  | changeToLowercase (x::xs) =
      toLower x :: changeToLowercase xs;

(* Helper function to get the last item of a list *)
fun getLast [] = raise Empty
  | getLast [x] = x
  | getLast (_::xs) = getLast xs;

(* Helper function to remove the last item of a list *)
fun removeLast [] = []
  | removeLast [_] = []
  | removeLast (x::xs) = x :: removeLast xs;

(* Main function to check if a string is a palindrome *)
fun is_palindrome str =
  let
    (* Remove non-alphabetic characters and convert to lowercase *)
    val clean_str = changeToLowercase (removeNonAlphabetic (explode str));
    
    (* Recursive function to check if a list is a palindrome *)
    fun is_palindrome_list [] = true
      | is_palindrome_list [x] = true
      | is_palindrome_list lst =
          if hd lst = getLast lst then
            is_palindrome_list (removeLast (tl lst))
          else
            false;
  in
    is_palindrome_list clean_str
  end;

(* Tests *)
val _ = print (Bool.toString (is_palindrome "A man, a plan, a canal - Panama!"));  (* Should return true *)
val _ = print (Bool.toString (is_palindrome "ML is the best language!"));           (* Should return false *)
