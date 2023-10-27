#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
   char uInput[100];
   char reversedUInput[100]; 
   
   
   printf("Enter your message: ");
   fgets(uInput, sizeof(uInput), stdin);
    int length = strlen(uInput);

    for(int i =0; i < length; i++){
        reversedUInput[i] = uInput[length-i-1];
    }
    reversedUInput[length] = '\0';
    printf("Message reversed: %s ", reversedUInput);
    return 0;
}
