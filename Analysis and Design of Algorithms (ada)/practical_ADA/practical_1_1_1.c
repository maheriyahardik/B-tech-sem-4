#include <stdio.h>

int main()
{
    int n, sum;

    // Input value of n
    printf("Enter the value of n: ");
    scanf("%d", &n);

    // Initialize sum
    sum = 0;

    // Use formula to get the sum from 1 to n
    sum = n * (n + 1) / 2;

    // Print sum
    printf("Sum = %d\n", sum);

    return 0;
}
