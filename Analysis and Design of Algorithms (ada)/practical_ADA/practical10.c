#include <stdio.h>
#include <math.h>

int board[20], count = 0;

// Function to check if a queen can be placed
int place(int row, int column) {
    for (int i = 1; i < row; i++) {
        // Check same column or diagonal
        if (board[i] == column ||
            abs(board[i] - column) == abs(i - row))
            return 0;
    }
    return 1;
}

// Function to print solution
void printSolution(int n) {
    printf("\nSolution %d:\n", ++count);
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (board[i] == j)
                printf(" Q ");
            else
                printf(" . ");
        }
        printf("\n");
    }
}

// Backtracking function
void queen(int row, int n) {
    for (int column = 1; column <= n; column++) {
        if (place(row, column)) {
            board[row] = column;

            if (row == n)
                printSolution(n);
            else
                queen(row + 1, n);
        }
    }
}

int main() {
    int n;

    printf("N QUEEN PROBLEM USING BACKTRACKING\n");
    printf("Enter number of queens: ");
    scanf("%d", &n);

    if (n < 1 || n > 20) {
        printf("Invalid input\n");
        return 0;
    }

    queen(1, n);

    if (count == 0)
        printf("\nNo solutions found\n");
    else
        printf("\nTotal solutions = %d\n", count);

    return 0;
}
