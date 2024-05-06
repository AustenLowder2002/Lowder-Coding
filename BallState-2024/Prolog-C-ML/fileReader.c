#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LINE_LENGTH 1000

void processFile(const char *filename);

int main() {
    char filename[MAX_LINE_LENGTH];

    printf("Enter the filename: ");
    if (fgets(filename, sizeof(filename), stdin) == NULL) {
        fprintf(stderr, "Error reading filename.\n");
        exit(EXIT_FAILURE);
    }

    filename[strcspn(filename, "\n")] = '\0';

    FILE *file = fopen(filename, "r");
    
    processFile(filename);

    
    fclose(file);

    return 0;
}

void processFile(const char *filename) {
    char line[MAX_LINE_LENGTH];
    
    FILE *file = fopen(filename, "r");

    while (fgets(line, sizeof(line), file) != NULL) {
        
        for (size_t i = 0; i < strlen(line); i++) {
            if (line[i] == '{' || line[i] == '}' || line[i] == '(' || line[i] == ')') {
                printf("%c", line[i]);
            }
        }
    }

    printf("\n"); 

    
    fclose(file);
}