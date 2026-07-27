#include <stdio.h>

int main() {
    int A, B;

    /* AND Gate */
    printf("AND Gate Truth Table\n");
    printf("A B | A AND B\n");
    for (A = 0; A <= 1; A++) {
        for (B = 0; B <= 1; B++) {
            printf("%d %d |   %d\n", A, B, A && B);
        }
    }

    /* OR Gate */
    printf("\nOR Gate Truth Table\n");
    printf("A B | A OR B\n");
    for (A = 0; A <= 1; A++) {
        for (B = 0; B <= 1; B++) {
            printf("%d %d |  %d\n", A, B, A || B);
        }
    }

    /* NOT Gate */
    printf("\nNOT Gate Truth Table\n");
    printf("A | NOT A\n");
    for (A = 0; A <= 1; A++) {
        printf("%d |   %d\n", A, !A);
    }

    return 0;
}