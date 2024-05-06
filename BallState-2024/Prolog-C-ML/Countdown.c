#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#define inintalNum 5 //Dr. Fonteles use this number -> 100000000000 the other was for testing only jk!)

int main() {
    printf("This program will self-destruct in %d seconds.\n", inintalNum);

    
    for (int i = inintalNum; i >= 0; i--) {
        printf("%d\n", i);
        sleep(1); 
    }

    printf("Self-destruct sequence initiated. Boom, Bang, BONG!\n");
    exit(0);

    return 0;

}