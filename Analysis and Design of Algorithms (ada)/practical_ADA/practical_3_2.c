//Merge Sort
#include <stdio.h>

// Function to merge two subarrays
void merge(int list[], int low, int mid, int high)
{
    int i, j, k;
    int temp[50];

    i = low;
    j = mid + 1;
    k = low;

    while (i <= mid && j <= high)
    {
        if (list[i] <= list[j])
            temp[k++] = list[i++];
        else
            temp[k++] = list[j++];
    }

    while (i <= mid)
        temp[k++] = list[i++];

    while (j <= high)
        temp[k++] = list[j++];

    for (i = low; i <= high; i++)
        list[i] = temp[i];
}

// Function to implement Merge Sort
void mergeSort(int list[], int low, int high)
{
    int mid;

    if (low < high)
    {
        mid = (low + high) / 2;
        mergeSort(list, low, mid);
        mergeSort(list, mid + 1, high);
        merge(list, low, mid, high);
    }
}

// Main function
int main()
{
    int list[50], size, i;

    printf("Enter total number of elements: ");
    scanf("%d", &size);

    printf("Enter the elements:\n");
    for (i = 0; i < size; i++)
        scanf("%d", &list[i]);

    mergeSort(list, 0, size - 1);

    printf("After merge sort:\n");
    for (i = 0; i < size; i++)
        printf("%d ", list[i]);

    return 0;
}
