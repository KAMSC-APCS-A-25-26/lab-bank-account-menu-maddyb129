import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        // TODO: Implement the bank account menu
        // 1. Create a double variable for balance
        // 2. Create a while loop for the menu
        // 3. Display the menu options
        // 4. Use Scanner to read user input
        // 5. Use switch statement to handle menu choices
        // 6. Implement add money, withdraw money, check balance, and exit functionality

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        double balance = 0.0;
        while (running)
        {
            System.out.println("\n");
            System.out.println("----Bank Account Menu----");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:  ");
            int choice = sc.nextInt();
            double amount = sc.nextDouble();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter amount to add: ");
                    if(amount >= 1)
                    {
                        balance = balance + amount;
                        System.out.print("Added " + "$" + balance);
                    }
                    else
                    {
                        System.out.print("ERROR");
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:  ");

                    if(amount >= 1 && amount >= balance)
                    {
                        balance = balance - amount;
                        System.out.print("Withdrew " + "$" + balance);
                    }
                    else
                    {
                        System.out.print("ERROR");
                    }
                    break;
                case 3:
                    System.out.print(balance);
                    break;
                case 4:
                    System.out.print("Goodbye!");
                    running = false;
                    break;
            }
        }
    }
}