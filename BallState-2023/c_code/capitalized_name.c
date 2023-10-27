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
    size_t length = strlen(nameLast);

    for(size_t i =0; i< length; i++){
        if(isalpha(nameLast[i])){
            nameLast[i] = toupper(nameLast[i]);
        }
    }


   
   
   
   printf("Your name: %s, %s", nameFirst, nameLast);
   
   
   return 0;
}