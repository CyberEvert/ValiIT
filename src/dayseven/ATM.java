package dayseven;

import java.util.Scanner;

public class ATM {
    private static AtmAccounts atmUsers = new AtmAccounts();
    private static User currentUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!authenticateUser(scanner)) {
            System.out.println("Authentication failed. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    changePin(scanner);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static boolean authenticateUser(Scanner scanner) {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();
            currentUser = atmUsers.validateUser(pin);
            if (currentUser != null) {
                System.out.println("Welcome, " + currentUser.getName() + "!");
                return true;
            }
            attempts++;
            System.out.println("Invalid PIN. Please try again." + attempts + " of 3.");
        }
        System.out.println("Invalid PIN.");
        return false;
    }

    private static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f\n", currentUser.getBalance());
    }

    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            currentUser.setBalance(currentUser.getBalance() + amount);
            System.out.printf("You have successfully deposited $%.2f. New balance: $%.2f\n", amount, currentUser.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= currentUser.getBalance()) {
            currentUser.setBalance(currentUser.getBalance() - amount);
            System.out.printf("You have successfully withdrawn $%.2f. Remaining balance: $%.2f\n", amount, currentUser.getBalance());
        } else if (amount > currentUser.getBalance()) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    private static void changePin(Scanner scanner) {
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter your current PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == currentUser.getPin()) {
                System.out.print("Enter your new PIN: ");
                int newPin = scanner.nextInt();

                System.out.print("Re-enter new PIN: ");
                int confirmedPin = scanner.nextInt();

                if(newPin == confirmedPin) {
                    currentUser.setPin(newPin);
                    System.out.println("PIN successfully changed.");
                    return;
                } else {
                    System.out.println("Invalid PIN.");
                    currentUser = null;
                    return;
                }
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempt " + attempts + " of 3.");
            }
        }
        System.out.println("GULAG IS WAITING YOU.");
        currentUser = null;
        System.exit(0);
    }
}