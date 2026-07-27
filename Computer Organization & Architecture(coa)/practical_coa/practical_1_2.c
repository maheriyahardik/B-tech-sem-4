#include <stdio.h>

int main() {
    int decimal, binary = 0, rem, base = 1;

    printf("Enter a decimal number: ");
    scanf("%d", &decimal);

    while (decimal > 0) {
        rem = decimal % 2;
        binary = binary + rem * base;
        decimal = decimal / 2;
        base = base * 10;
    }

    printf("Binary number = %d", binary);

    return 0;
}
