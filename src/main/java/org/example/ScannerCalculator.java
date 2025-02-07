package org.example;

import org.example.utils.Calculator;

import java.util.Scanner;

public class ScannerCalculator {
    private Scanner scanner = new Scanner(System.in);
    private Calculator calculator = new Calculator();

    public void start() {
        System.out.println("Enter an integer: ");
        double number = scanner.nextDouble();
        System.out.println("Enter an integer: ");
        int number2 = scanner.nextInt();
        System.out.println("Choose an option (+, -, *, /) ");
        String option = scanner.next();
        double result = switch (option) {
            case "+" -> calculator.add(number, number2);
            case "-" -> calculator.subtract(number, number2);
            case "*" -> calculator.multiply(number, number2);
            case "/" -> {
                if (number2 == 0) {
                    System.out.println("You cannot divide by zero");
                }
                yield calculator.divide(number, number2);
            }
            default -> throw new IllegalArgumentException("Invalid option");
        };

        System.out.println("The result is: " + result);
    }
}
