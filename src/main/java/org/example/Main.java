package org.example;

public class Main {

    // Method to calculate factorial
    public static int factorial(int num) {
        if (num < 0) {
            return -1;  // return -1 for invalid input
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate square root
    public static double sqrt(double num) {
        if (num < 0) {
            return -1;
        }
        return Math.sqrt(num);
    }

    // Method to calculate natural logarithm
    public static double log(double num) {
        if (num <= 0) {
            return -1;
        }
        return Math.log(num);
    }

    // Method to calculate power of a number
    public static double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("-------- Welcome to Calculator Program - SPE--- ---------");
        System.out.println("-------- Please Enter the Operation: ------------");
        System.out.println("1 -> Factorial    ");
        System.out.println("2 -> Square Root");
        System.out.println("3 -> Natural Logarithm");
        System.out.println("4 -> Power Function");
        System.out.println("5 -> Exit the Calculator");

        System.out.println(" ----X---------X------X--");

        if (sc.hasNextInt()) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter integer whose factorial you want to calculate: ");
                    if (sc.hasNextInt()) {
                        int num = sc.nextInt();
                        int factorialResult = factorial(num);
                        if (factorialResult == -1) {
                            System.out.println("Please Enter a valid non-negative Integer Input");
                        } else {
                            System.out.println("Factorial of " + num + " is: " + factorialResult);
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                    }
                    break;

                case 2:
                    System.out.print("Enter number whose square root you want to calculate: ");
                    if (sc.hasNextDouble()) {
                        double sqrtNum = sc.nextDouble();
                        double sqrtResult = sqrt(sqrtNum);
                        if (sqrtResult == -1) {
                            System.out.println("Please Enter valid Input >= 0");
                        } else {
                            System.out.println("Square root of " + sqrtNum + " is: " + sqrtResult);
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a number for natural log: ");
                    if (sc.hasNextDouble()) {
                        double logNum = sc.nextDouble();
                        double logResult = log(logNum);
                        if (logResult == -1) {
                            System.out.println("Please Enter a valid number greater than 0");
                        } else {
                            System.out.println("Natural log of " + logNum + " is: " + logResult);
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the base (x) and the exponent (b) for power function (x^b): ");
                    if (sc.hasNextDouble()) {
                        double base = sc.nextDouble();
                        if (sc.hasNextDouble()) {
                            double exponent = sc.nextDouble();
                            double powerResult = pow(base, exponent);
                            System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult);
                        } else {
                            System.out.println("Invalid input. Please enter a valid exponent.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid base.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the calculator");
                    break;

                default:
                    System.out.println("Invalid operation choice. Please try again.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid operation choice.");
        }

        sc.close();
    }
}
