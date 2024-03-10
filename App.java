import java.util.Scanner;
public class SimpleExpenseTracker {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] expenses = new double[100];
        int count = 0;

        while (true) {
            System.out.println("Expense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expense Summary");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Expense Amount:");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();  // Consume the newline character

                    expenses[count] = amount;
                    count++;

                    System.out.println("Expense added successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No expenses to display.");
                    } else {
                        double totalExpenses = 0;
                        System.out.println("\nExpense Summary:");
                        System.out.println("---------------------");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Expense: " + (i + 1) +  expenses[i]);
                            totalExpenses += expenses[i];
                        }
                        System.out.println("---------------------");
                        System.out.println("Total Expenses:" + totalExpenses + "\n");
                    }
                    break;

                case 3:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.\n");
            }
        }
    }
}


