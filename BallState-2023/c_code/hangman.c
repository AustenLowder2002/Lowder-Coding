#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int main(){
   char foodItems[5][20] = {"cheese", "pizza", "hamburg", "funkypie", "apples"};
    srand(time(NULL));
    int randomNum = rand() % 5;
    char word[20];
    char guessWord[20];
    int guesses;

    strcpy(word, foodItems[randomNum]);

    printf("Please input your first guess!: ");
    scanf("%s", guessWord);

    guesses = 5;
    while(guesses != 1){
        if(strcmp(guessWord, word) == 0){
        printf("Congratz you guessed the word it was: %s", word);
        exit(0);
        }else{
            guesses--;
            printf("You have %d quesses enter another word: ", guesses );
            scanf("%s", guessWord);
        }
    }

    printf("You failed noob, the right word was: %s", word);

    return 0;
}