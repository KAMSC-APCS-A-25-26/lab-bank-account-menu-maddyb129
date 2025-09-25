import java.util.Scanner;
import java.text.DecimalFormat;

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
            switch(choice)
            {
                case 1:
                    System.out.print("Enter amount to add:  ");
                    double amount = sc.nextDouble();
                    if(amount >= 1)
                    {
                        balance = balance + amount;
                        DecimalFormat roundedBalance = new DecimalFormat ("0.00");
                        System.out.print("New balance: " + "$" + roundedBalance.format(balance));
                    }
                    else
                    {
                        System.out.print("ERROR");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw:  ");
                    double withdraw = sc.nextDouble();
                    if(withdraw >= 0 && withdraw <= balance)
                    {
                        balance -=withdraw;
                        DecimalFormat roundedBalance = new DecimalFormat ("0.00");
                        System.out.print("New balance:" + "$" + roundedBalance.format(balance));
                    }
                    else
                    {
                        System.out.print("ERROR");
                    }
                    break;
                case 3:
                    DecimalFormat roundedBalance = new DecimalFormat ("0.00");
                    System.out.print(roundedBalance.format(balance));
                    break;
                case 4:
                    System.out.print("Goodbye!");
                    running = false;
            }
        }
    }
}