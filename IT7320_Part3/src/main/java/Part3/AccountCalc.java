package Part3;

import java.util.Scanner;

public class AccountCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account(100.00);

        AccountCalc test = new AccountCalc();
        test.greet();
        double withdrawalAmount, depositAmount;
        System.out.print("\nPlease choose an option from above. ");
        char ans = input.next().charAt(0);

        while (ans != 'x') {
            if ((ans == 'B') || (ans == 'b')) {
                System.out.printf("\nCurrent Account balance: $%.2f\n", account1.getBalance());
            } else if ((ans == 'W') || (ans == 'w')) {
                System.out.format("\nYour current balance is: $%.2f\n", account1.getBalance());
                System.out.print("Enter withdrawal amount: $");
                withdrawalAmount = input.nextDouble();

                if (withdrawalAmount > account1.getBalance()) {
                    System.out.println("Insufficient funds.");
                    System.out.println("Please enter the correct amount.");
                } else {
                    System.out.format("\nSubtracting %.2f from your current balance\n", withdrawalAmount);
                    account1.debit(withdrawalAmount);
                    System.out.println("Successful transaction.");
                    System.out.printf("Your New balance: $%.2f\n", account1.getBalance());
                }
            } else if ((ans == 'D') || (ans == 'd')) {
                System.out.print("\nEnter amount to deposit: $");
                depositAmount = input.nextDouble();
                System.out.format("Adding %.2f to your balance\n", depositAmount);
                account1.credit(depositAmount);
                System.out.format("\nYour new balance: $%.2f\n", account1.getBalance());
            } else {
                System.out.println("Incorrect input. Please choose from the following options.");
                System.exit(0);
            }
            
            System.out.println("");
            test.greet();
            System.out.print("\nPlease enter your choice: ");
            ans = input.next().charAt(0);
        }
    }

    public void greet() {
        System.out.println("Banking System");
        System.out.print("\n[W] - Make a Withdrawal");
        System.out.print("\n[B] - Check Account Balance");
        System.out.print("\n[D] - Make a Deposit\n");
    }
}
