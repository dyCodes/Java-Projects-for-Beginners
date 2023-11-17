import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter 2nd number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        // Output result
        System.out.println("Result: " + result);
    }
}
