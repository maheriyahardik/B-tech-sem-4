#include <stdio.h>

// Function to implement Fractional Knapsack
void knapsack(int n, float weight[], float profit[], float capacity)
{
    float x[20], totalProfit = 0.0;
    int i;

    // Initialize solution vector
    for (i = 0; i < n; i++)
        x[i] = 0.0;

    for (i = 0; i < n; i++)
    {
        if (weight[i] <= capacity)
        {
            x[i] = 1.0;
            totalProfit += profit[i];
            capacity -= weight[i];
        }
        else
        {
            x[i] = capacity / weight[i];
            totalProfit += x[i] * profit[i];
            break;
        }
    }

    printf("\nThe result vector is:\n");
    for (i = 0; i < n; i++)
        printf("%.6f ", x[i]);

    printf("\nMaximum profit is: %.6f\n", totalProfit);
}

int main()
{
    float weight[20], profit[20], capacity, ratio[20], temp;
    int num, i, j;

    printf("Enter the no. of objects: ");
    scanf("%d", &num);

    printf("Enter the weights and profits of each object:\n");
    for (i = 0; i < num; i++)
        scanf("%f %f", &weight[i], &profit[i]);

    printf("Enter the capacity of knapsack: ");
    scanf("%f", &capacity);

    // Calculate profit/weight ratio
    for (i = 0; i < num; i++)
        ratio[i] = profit[i] / weight[i];

    // Sort objects by decreasing ratio (Greedy)
    for (i = 0; i < num; i++)
    {
        for (j = i + 1; j < num; j++)
        {
            if (ratio[i] < ratio[j])
            {
                temp = ratio[i];
                ratio[i] = ratio[j];
                ratio[j] = temp;

                temp = weight[i];
                weight[i] = weight[j];
                weight[j] = temp;

                temp = profit[i];
                profit[i] = profit[j];
                profit[j] = temp;
            }
        }
    }

    knapsack(num, weight, profit, capacity);

    return 0;
}
