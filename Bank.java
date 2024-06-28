import java.util.*;

class BankAccount {
    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerID;

    public BankAccount(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
            System.out.println("\n\tAmount Deposited Successfully!");
            System.out.println("___________________________________________");
        }
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            previousTransaction = -amount;
            System.out.println("\n\tAmount Withdrawn Successfully!");
            System.out.println("___________________________________________");
        } else {
            System.out.println("\n\tWithdraw Failed! Insufficient Balance");
            System.out.println("___________________________________________");
        }
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited = " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn = " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("==========================");
        System.out.println("  Welcome " + customerName);
        System.out.println("  Your ID: " + customerID);
        System.out.println("==========================\n");

        System.out.println("\tSelect an Option\n");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Previous Transaction");
        System.out.println("0. Exit");

        do {
            System.out.print("\nEnter Option number: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    System.out.println("========================================");
                    System.out.println("Balance = " + balance);
                    System.out.println("========================================");
                    break;
                case 2:
                    System.out.println("\n========================================");
                    System.out.println("  Please Enter the Amount to Deposit");
                    System.out.println("========================================");
                    System.out.print("Amount: ");
                    int depositAmount = sc.nextInt();
                    deposit(depositAmount);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n========================================");
                    System.out.println("  Please Enter the Amount to Withdraw");
                    System.out.println("========================================");
                    System.out.print("Amount: ");
                    int withdrawAmount = sc.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("========================================");
                    getPreviousTransaction();
                    System.out.println("========================================");
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option! Please Try Again");
                    break;
            }
        } while (option != 0);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ███╗   ███╗██╗   ██╗    ██████╗  █████╗ ███╗   ██╗██╗  ██╗ ");
        System.out.println(" ████╗ ████║╚██╗ ██╔╝    ██╔══██╗██╔══██╗████╗  ██║██║ ██╔╝ ");
        System.out.println(" ██╔████╔██║ ╚████╔╝     ██████╔╝███████║██╔██╗ ██║█████╔╝  ");
        System.out.println(" ██║╚██╔╝██║  ╚██╔╝      ██╔══██╗██╔══██║██║╚██╗██║██╔═██╗  ");
        System.out.println(" ██║ ╚═╝ ██║   ██║       ██████╔╝██║  ██║██║ ╚████║██║  ██╗ ");
        System.out.println(" ╚═╝     ╚═╝   ╚═╝       ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝ ");

        System.out.println("\t\tMade by USAMA ALI\n");

        System.out.println("\tOPEN YOUR BANK ACCOUNT\n");
        System.out.print("Enter your Name: ");
        String newName = sc.nextLine();
        System.out.println();

        System.out.print("Enter your ID: ");
        String newID = sc.nextLine();
        System.out.println();

        BankAccount bankAccount = new BankAccount(newName, newID);
        bankAccount.showMenu();
    }
}
