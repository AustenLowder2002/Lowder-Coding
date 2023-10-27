#include <stdio.h>
#include <string.h>

int main() {
    char name[100];

    
    printf("Enter your name: ");
    fgets(name, sizeof(name),stdin);
    int name_Length = strlen(name) - 1;

    printf("The name of %s has %d characters" , name, name_Length);

    return 0;
}