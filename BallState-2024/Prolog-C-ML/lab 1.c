#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
// Authors: Dennis Beaver, Austen Lowder
//Date: 2/8/2024
//Program description: This program is a Parser program that looks for specific characters with File's content.
// Define the maximum length of a line
#define MAX_LINE_LENGTH 1000
// Define the maximum number of lines
#define MAX_LINES 1000

// Function to check if a character is a parenthesis-like character
bool isParenthesisLike(char c) {
    return c == '{' || c == '}' || c == '(' || c == ')' || c == '[' || c == ']';
}

// Function to detect comments denoted by //
void detectSingleLineComments(char* line) {
    char* commentStart = strstr(line, "//");
    if (commentStart != NULL) {
        *commentStart = '\0'; // Truncate the line at the start of the comment
    }
}

// Function to parse the file and check for syntax errors
void parseFile(FILE* file) {
    char line[MAX_LINE_LENGTH];
    char stack[MAX_LINES]; // Stack to track parenthesis-like characters
    int lineNum = 0;
    int stackIndex = 0;

    while (fgets(line, MAX_LINE_LENGTH, file) != NULL) {
        lineNum++;

        detectSingleLineComments(line);

        for (int i = 0; line[i] != '\0'; i++) {
            char c = line[i];

            if (isParenthesisLike(c)) {
                if (c == '{' || c == '(' || c == '[') {
                    if (stackIndex == MAX_LINES) {
                        printf("ERROR: Stack overflow at line %d\n", lineNum);
                        exit(EXIT_FAILURE);
                    }
                    stack[stackIndex++] = c;
                } else {
                    if (stackIndex == 0) {
                        printf("ERROR: Unexpected closing %c at line %d\n", c, lineNum);
                        exit(EXIT_FAILURE);
                    }

                    char opening = stack[--stackIndex];
                    if (!((opening == '{' && c == '}') || (opening == '(' && c == ')') || (opening == '[' && c == ']'))) {
                        printf("ERROR: Mismatched %c at line %d\n", c, lineNum);
                        exit(EXIT_FAILURE);
                    }
                }
            }
        }
    }

    if (stackIndex > 0) {
        printf("ERROR: Missing closing %c at EOF\n", stack[--stackIndex]);
        exit(EXIT_FAILURE);
    }

    printf("No syntax errors found.\n");
}

int main() {
    char filename[MAX_LINE_LENGTH];
    printf("Enter name of file to open: ");
    scanf("%s", filename);

    FILE* file = fopen(filename, "r");
    if (file == NULL) {
        perror("ERROR");
        return EXIT_FAILURE;
    }

    parseFile(file);

    fclose(file);

    return EXIT_SUCCESS;
}


