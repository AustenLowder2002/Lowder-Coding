#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
    char foodItems[5][20] = {"cheese", "pizza", "hamburg", "funky pie", "apples"};
    srand(time(NULL));
    int randomNum = rand() % 5;
    printf("Favorite food is: %s", foodItems[randomNum]);
    return 0;
}