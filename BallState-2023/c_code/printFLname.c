#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
   char nameFirst[100];
   char nameLast[100]; 
   
   
   printf("Enter your first name: ");
   fgets(nameFirst, sizeof(nameFirst), stdin);
   printf("Enter your last name: ");
   fgets(nameLast, sizeof(nameLast), stdin);

   printf("Frist name: %s", nameFirst);
   printf("Last name: %s", nameLast);
}