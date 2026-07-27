#include <stdio.h>
#include <string.h>

#define MAX 100

int max(int a, int b) {
    return (a > b) ? a : b;
}

// Function to print LCS
void printLCS(char X[], char Y[], int m, int n, int L[MAX][MAX]) {
    int index = L[m][n];
    char lcs[index + 1];
    lcs[index] = '\0';

    int i = m, j = n;

    while (i > 0 && j > 0) {
        if (X[i - 1] == Y[j - 1]) {
            lcs[index - 1] = X[i - 1];
            i--;
            j--;
            index--;
        }
        else if (L[i - 1][j] > L[i][j - 1])
            i--;
        else
            j--;
    }

    printf("The Longest Common Subsequence is %s\n", lcs);
}

int main() {
    char X[MAX], Y[MAX];
    int m, n;
    int L[MAX][MAX];

    printf("Enter 1st sequence: ");
    scanf("%s", X);

    printf("Enter 2nd sequence: ");
    scanf("%s", Y);

    m = strlen(X);
    n = strlen(Y);

    // Build LCS DP table
    for (int i = 0; i <= m; i++) {
        for (int j = 0; j <= n; j++) {
            if (i == 0 || j == 0)
                L[i][j] = 0;
            else if (X[i - 1] == Y[j - 1])
                L[i][j] = 1 + L[i - 1][j - 1];
            else
                L[i][j] = max(L[i - 1][j], L[i][j - 1]);
        }
    }

    printLCS(X, Y, m, n, L);

    return 0;
}
