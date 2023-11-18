#include <stdio.h>


void hexToBinary(char hexDigit) {
    int decimal, binary[4] = {0};

    // Convert hex to decimal
    if (hexDigit >= '0' && hexDigit <= '9') {
        decimal = hexDigit - '0';
    } else if ((hexDigit >= 'A' && hexDigit <= 'F') || (hexDigit >= 'a' && hexDigit <= 'f')) {
        decimal = (hexDigit & 0xDF) - 'A' + 10; 
    } else {
        
        printf("Invalid input Please enter a valid hex digit:\n");
        return;
    }

    
    for (int i = 3; i >= 0; i--) {
        binary[i] = decimal % 2;
        decimal /= 2;
    }

    
    printf("Binary: ");
    for (int i = 0; i < 4; i++) {
        printf("%d", binary[i]);
    }
    printf("\n");
}

int main() {
    char hexDigit;

    while (1) {
       
        printf("Enter a hex digit (or X to exit): ");
        scanf(" %c", &hexDigit);

        
        if (hexDigit == 'X' || hexDigit == 'x') {
            printf("Exiting program\n");
            exit(0);
        }

        
        hexToBinary(hexDigit);
    }

    return 0;
}
