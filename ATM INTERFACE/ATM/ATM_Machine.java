import java.util.Scanner;

public class ATM_Machine {
    private int balance;

    public ATM_Machine(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your money: " + amount);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Your money has been successfully deposited: " + amount);
        } else {
            System.out.println("Invalid Amount for Deposit");
        }
    }

    public int checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        int initialBalance = sc.nextInt();

        ATM_Machine atm = new ATM_Machine(initialBalance);

        while (true) {
            System.out.println("\nATM Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn: ");
                    int withdrawAmount = sc.nextInt();
                    atm.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter money to be deposited: ");
                    int depositAmount = sc.nextInt();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    int currentBalance = atm.checkBalance();
                    System.out.println("Balance: " + currentBalance);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
