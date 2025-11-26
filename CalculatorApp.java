import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            if (choice.equals("3")) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            if (choice.equals("1")) {
                System.out.println("Result: " + add(num1, num2));
            } else if (choice.equals("2")) {
                System.out.println("Result: " + subtract(num1, num2));
            } else {
                System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
}
