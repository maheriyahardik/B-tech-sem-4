

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Account {
    int accountNumber;
    char name[100];
    int age;
    char address[200];
    float balance;
};

void createAccount();
void displayAllAccounts();
void searchAccount();
void depositMoney();
void withdrawMoney();
void deleteAccount();

int main() {
    int choice;

    while (1) {
        printf("\n====================================\n");
        printf("      BANK MANAGEMENT SYSTEM\n");
        printf("====================================\n");
        printf("1. Create New Account\n");
        printf("2. Display All Accounts\n");
        printf("3. Search Account\n");
        printf("4. Deposit Money\n");
        printf("5. Withdraw Money\n");
        printf("6. Delete Account\n");
        printf("7. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                createAccount();
                break;
            case 2:
                displayAllAccounts();
                break;
            case 3:
                searchAccount();
                break;
            case 4:
                depositMoney();
                break;
            case 5:
                withdrawMoney();
                break;
            case 6:
                deleteAccount();
                break;
            case 7:
                printf("Thank you for using the system.\n");
                exit(0);
            default:
                printf("Invalid choice! Please try again.\n");
        }
    }

    return 0;
}

void createAccount() {
    FILE *fp;
    struct Account acc;

    fp = fopen("accounts.dat", "ab");

    if (fp == NULL) {
        printf("File could not be opened!\n");
        return;
    }

    printf("\nEnter Account Number: ");
    scanf("%d", &acc.accountNumber);

    printf("Enter Name: ");
    fgets(acc.name, sizeof(acc.name), stdin);
    acc.name[strcspn(acc.name, "\\n")] = 0;

    printf("Enter Age: ");
    scanf("%d", &acc.age);

    printf("Enter Address: ");
    getchar();
    fgets(acc.address, sizeof(acc.address), stdin);
    acc.address[strcspn(acc.address, "\\n")] = 0;

    printf("Enter Initial Balance: ");
    scanf("%f", &acc.balance);

    fwrite(&acc, sizeof(acc), 1, fp);
    fclose(fp);

    printf("Account created successfully!\n");
}

void displayAllAccounts() {
    FILE *fp;
    struct Account acc;

    fp = fopen("accounts.dat", "rb");

    if (fp == NULL) {
        printf("No records found!\n");
        return;
    }

    printf("\n=========== ACCOUNT LIST ===========\n");

    while (fread(&acc, sizeof(acc), 1, fp)) {
        printf("\nAccount Number : %d\n", acc.accountNumber);
        printf("Name           : %s\n", acc.name);
        printf("Age            : %d\n", acc.age);
        printf("Address        : %s\n", acc.address);
        printf("Balance        : %.2f\n", acc.balance);
    }

    fclose(fp);
}

void searchAccount() {
    FILE *fp;
    struct Account acc;
    int accNo, found = 0;

    fp = fopen("accounts.dat", "rb");

    if (fp == NULL) {
        printf("No records found!\n");
        return;
    }

    printf("Enter account number to search: ");
    scanf("%d", &accNo);

    while (fread(&acc, sizeof(acc), 1, fp)) {
        if (acc.accountNumber == accNo) {
            printf("\nAccount Found!\n");
            printf("Account Number : %d\n", acc.accountNumber);
            printf("Name           : %s\n", acc.name);
            printf("Age            : %d\n", acc.age);
            printf("Address        : %s\n", acc.address);
            printf("Balance        : %.2f\n", acc.balance);
            found = 1;
            break;
        }
    }

    if (!found)
        printf("Account not found!\n");

    fclose(fp);
}

void depositMoney() {
    FILE *fp;
    struct Account acc;
    int accNo, found = 0;
    float amount;

    fp = fopen("accounts.dat", "rb+");

    if (fp == NULL) {
        printf("No records found!\n");
        return;
    }

    printf("Enter account number: ");
    scanf("%d", &accNo);

    while (fread(&acc, sizeof(acc), 1, fp)) {
        if (acc.accountNumber == accNo) {
            printf("Enter amount to deposit: ");
            scanf("%f", &amount);

            acc.balance += amount;

            fseek(fp, -sizeof(acc), SEEK_CUR);
            fwrite(&acc, sizeof(acc), 1, fp);

            printf("Amount deposited successfully!\n");
            printf("Updated Balance: %.2f\n", acc.balance);

            found = 1;
            break;
        }
    }

    if (!found)
        printf("Account not found!\n");

    fclose(fp);
}

void withdrawMoney() {
    FILE *fp;
    struct Account acc;
    int accNo, found = 0;
    float amount;

    fp = fopen("accounts.dat", "rb+");

    if (fp == NULL) {
        printf("No records found!\n");
        return;
    }

    printf("Enter account number: ");
    scanf("%d", &accNo);

    while (fread(&acc, sizeof(acc), 1, fp)) {
        if (acc.accountNumber == accNo) {
            printf("Enter amount to withdraw: ");
            scanf("%f", &amount);

            if (amount > acc.balance) {
                printf("Insufficient balance!\n");
            } else {
                acc.balance -= amount;

                fseek(fp, -sizeof(acc), SEEK_CUR);
                fwrite(&acc, sizeof(acc), 1, fp);

                printf("Withdrawal successful!\n");
                printf("Remaining Balance: %.2f\n", acc.balance);
            }

            found = 1;
            break;
        }
    }

    if (!found)
        printf("Account not found!\n");

    fclose(fp);
}

void deleteAccount() {
    FILE *fp, *temp;
    struct Account acc;
    int accNo, found = 0;

    fp = fopen("accounts.dat", "rb");

    if (fp == NULL) {
        printf("No records found!\n");
        return;
    }

    temp = fopen("temp.dat", "wb");

    printf("Enter account number to delete: ");
    scanf("%d", &accNo);

    while (fread(&acc, sizeof(acc), 1, fp)) {
        if (acc.accountNumber == accNo) {
            found = 1;
            continue;
        }
        fwrite(&acc, sizeof(acc), 1, temp);
    }

    fclose(fp);
    fclose(temp);

    remove("accounts.dat");
    rename("temp.dat", "accounts.dat");

    if (found)
        printf("Account deleted successfully!\n");
    else
        printf("Account not found!\n");
}
