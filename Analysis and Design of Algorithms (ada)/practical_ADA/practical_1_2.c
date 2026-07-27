//remnidar of the number without using modulo operator
#include <stdio.h>

int main()
{
    int a, b, rem;

    printf("\nEnter first number :: ");
    scanf("%d", &a);

    printf("\nEnter second number :: ");
    scanf("%d", &b);

    rem = a - (a / b) * b;

    printf("\nRemainder of [ %d ] & [ %d ] is = %d\n", a, b, rem);

    return 0;
}
