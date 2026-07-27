//Enter number of items: 3
//Enter values of items:
//60 100 120
//Enter weights of items:
//10 20 30
//Enter capacity of knapsack: 50

#include <stdio.h>

// Utility function to  get maximum of two integers
int max(int a, int b) {
    return (a > b) ? a : b;
}

// Knapsack function using Dynamic Programming
int knapSack(int W, int wt[], int val[], int n) {
    int K[n + 1][W + 1];

    // Build table K[][] in bottom-up manner
    for (int i = 0; i <= n; i++) {
        for (int w = 0; w <= W; w++) {
            if (i == 0 || w == 0)
                K[i][w] = 0;
            else if (wt[i - 1] <= w)
                K[i][w] = max(
                    val[i - 1] + K[i - 1][w - wt[i - 1]],
                    K[i - 1][w]
                );
            else
                K[i][w] = K[i - 1][w];
        }
    }

    return K[n][W];
}

int main() {
    int n, W;

    printf("Enter number of items: ");
    scanf("%d", &n);

    int val[n], wt[n];

    printf("Enter values of items:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &val[i]);
    }

    printf("Enter weights of items:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &wt[i]);
    }

    printf("Enter capacity of knapsack: ");
    scanf("%d", &W);

    printf("Maximum value in Knapsack = %d\n",
           knapSack(W, wt, val, n));

    return 0;
}

