#include <stdio.h>

int main() {
    int choice;
    int decimal, binary, remainder, base = 1, decimalValue = 0;

        printf("Enter binary number: ");
        scanf("%d", &binary);

        base = 1;
        decimalValue = 0;

        while (binary > 0) {
            remainder = binary % 10;
            decimalValue = decimalValue + remainder * base;
            binary = binary / 10;
            base = base * 2;
        }

        printf("Decimal number = %d", decimalValue);
    }
   

    return 0;
}