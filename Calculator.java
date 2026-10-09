import java.util.Scanner;

/**
 * A simple interactive calculator that supports basic arithmetic operations.
 *
 * @author Deependra
 */
public class Calculator {

    /**
     * Main method: Entry point of the application.
     * Displays the menu and processes user input.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();

            System.out.print("Choose an operation (1-6): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 6) {
                running = false;
                System.out.println("Thank you for using the calculator!");
                continue;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice! Please select an option between 1 and 6.");
                continue;
            }

            System.out.print("Enter the first number: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next();
                continue;
            }

            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next();
                continue;
            }

            int num2 = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;

                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;

                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + divide(num1, num2));
                    }
                    break;

                case 5:
                    if (num2 == 0) {
                        System.out.println("Error: Modulo by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + modulo(num1, num2));
                    }
                    break;

                default:
                    System.out.println("Invalid operation.");
            }

            System.out.println();
        }

        scanner.close();
    }

    /**
     * Displays the available calculator operations.
     */
    public static void displayMenu() {
        System.out.println("========== CALCULATOR ==========");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Exit");
        System.out.println("================================");
    }

    /**
     * Adds two integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the sum of the two integers
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the difference between the two integers
     */
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the product of the two integers
     */
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divides the first integer by the second using integer division.
     *
     * @param num1 the dividend
     * @param num2 the divisor
     * @return the integer quotient
     * @throws ArithmeticException if the divisor is zero
     */
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return num1 / num2;
    }

    /**
     * Calculates the remainder after dividing the first integer by the second.
     *
     * @param num1 the dividend
     * @param num2 the divisor
     * @return the remainder
     * @throws ArithmeticException if the divisor is zero
     */
    public static int modulo(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed.");
        }

        return num1 % num2;
    }
}