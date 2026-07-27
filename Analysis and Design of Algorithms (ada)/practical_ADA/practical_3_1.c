//impliment hte following sorting algorithm
//quick sort
#include <stdio.h>

// Function to implement Quick Sort
void quickSort(int number[], int first, int last)
{
    int i, j, pivot, temp;

    if (first < last)
    {
        pivot = first;
        i = first;
        j = last;

        while (i < j)
        {
            while (number[i] <= number[pivot] && i < last)
                i++;

            while (number[j] > number[pivot])
                j--;

            if (i < j)
            {
                temp = number[i];
                number[i] = number[j];
                number[j] = temp;
            }
        }

        temp = number[pivot];
        number[pivot] = number[j];
        number[j] = temp;

        quickSort(number, first, j - 1);
        quickSort(number, j + 1, last);
    }
}

// Main function
int main()
{
    int i, count, number[25];

    printf("How many elements are you going to enter ?: ");
    scanf("%d", &count);

    printf("Enter %d elements:\n", count);
    for (i = 0; i < count; i++)
        scanf("%d", &number[i]);

    quickSort(number, 0, count - 1);

    printf("Order of Sorted elements: ");
    for (i = 0; i < count; i++)
        printf("%d ", number[i]);

    return 0;
}
