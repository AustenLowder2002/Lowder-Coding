#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(){
    int randomNum = (rand() % 6) + 1;
    char rollAgain[100];
    int continues;
    printf("You Rolled: %d ", randomNum);
    
    printf("Would you like to roll again?: ");
    scanf("%s", rollAgain);
    continues = 1;
    while(continues = 1){
        if(strcmp(rollAgain, "y") == 0){
        int randomNum = (rand() % 6) + 1;
        printf("You Rolled: %d ", randomNum);
        printf("Would you like to roll again?: ");
        scanf("%s", rollAgain);
        }else{
            printf("Thank you for playing ");
            printf("And remember 99%% of gamblers quit before their big win.");
            continues = 0;
            exit(0);
        }
    }

    return 0;
}