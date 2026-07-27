#include <stdio.h>

int main()
{
    int A = 0;      // Accumulator
    int Q, M;       // Q = Dividend, M = Divisor
    int n;          // Number of bits
    int i;

    printf("Enter Dividend (Q): ");
    scanf("%d", &Q);

    printf("Enter Divisor (M): ");
    scanf("%d", &M);

    printf("Enter number of bits (n): ");
    scanf("%d", &n);

    printf("\nInitial Values:\n");
    printf("A = %d, Q = %d, M = %d\n", A, Q, M);

    for (i = 0; i < n; i++)
    {
        // Left shift AQ
        A = (A << 1) | ((Q >> (n - 1)) & 1);
        Q = (Q << 1) & ((1 << n) - 1);

        // Perform operation
        if (A >= 0)
            A = A - M;
        else
            A = A + M;

        // Set Q0 bit
        if (A >= 0)
            Q = Q | 1; 

        printf("Step %d: A = %d, Q = %d\n", i + 1, A, Q);
    }

    // Final restore if A is negative
    if (A < 0)
        A = A + M;

    printf("\nFinal Result:\n");
    printf("Quotient  = %d\n", Q);
    printf("Remainder = %d\n", A);

    return 0;
}
