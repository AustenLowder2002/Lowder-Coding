#include <stdio.h>
#include <stdlib.h>
int main(){
    int n, num1;
    printf("Enter the number you want to be the max random number: ");
    scanf("%d", &num1);
    printf("Enter how many numbers you want to print: ");
    scanf("%d",&n);
    for (int i = 1; i <= n; i++){
    int randomNum = rand() % num1 + 1;
    printf("Random num %d is %d: ",i, randomNum);
    }
    return 0;
}