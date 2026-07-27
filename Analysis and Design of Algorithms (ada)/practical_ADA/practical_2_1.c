//insertion sort
#include <stdio.h>

int main()
{
    int i, j, count, temp, number[25];

    printf("How many numbers are you going to enter ?: ");
    scanf("%d", &count);

    printf("Enter %d elements:\n", count);
    for (i = 0; i < count; i++)
        scanf("%d", &number[i]);

    // Insertion Sort Logic
    for (i = 1; i < count; i++)
    {
        temp = number[i];
        j = i - 1;

        while (j >= 0 && temp < number[j])
        {
            number[j + 1] = number[j];
            j--;
        }
        number[j + 1] = temp;
    }

    // Output
    printf("Order of Sorted elements: ");
    for (i = 0; i < count; i++)
        printf("%d ", number[i]);

    return 0;
}
