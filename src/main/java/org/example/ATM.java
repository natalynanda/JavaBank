package org.example;

import java.util.Scanner;

public class ATM {
    private ScannerCalculator calculator = new ScannerCalculator();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to JavaBank ATM ");
            System.out.println("Please enter your choice: ");
            System.out.println("1. Make a transaction");
            System.out.println("2. Use calculator");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to make transaction");
                    break;
                case 2:
                    calculator.start();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
