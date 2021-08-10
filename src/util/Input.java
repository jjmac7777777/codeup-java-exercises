//package util;
//
//import java.util.Scanner;
//
//public class Input {
//
//    private Scanner scanner;
//
//    public Input() {
//        scanner = new Scanner(System.in);
//
//    }
//
//    public String getString() {
//        System.out.println("Enter: ");
//        String userInput = scanner.nextLine();
//        return userInput;
//    }
//    public String getString(String prompt) {
//        System.out.println(prompt);
//        String userInput = scanner.nextLine();
//        return userInput;
//    }
//    public boolean yesNo() {
//        System.out.println("y/n");
//        String userInput = scanner.next();
//        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean yesNo(String prompt) {
//        System.out.println(prompt);
//        String userInput = scanner.next();
//        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public int getInt(int min, int max) {
//        System.out.println("Enter number between " + min + " and " + max);
//        int input = scanner.nextInt();
//        if (input < min) {
//            System.out.println("Your number needs to be higher than " + min);
//            getInt(min, max);
//        } else if (input > max) {
//            System.out.println("Your number needs to be lower than " + max);
//            getInt(min, max);
//        } else {
//            System.out.println("Your number is " + input);
//
//        }
//        return input;
//    }
//
//    public int getInt(int min, int max, String prompt) {
//        System.out.println(prompt);
//        int input = scanner.nextInt();
//        if (input < min) {
//            System.out.println("Your number needs to be higher than " + min);
//            getInt(min, max);
//        } else if (input > max) {
//            System.out.println("Your number needs to be lower than " + max);
//            getInt(min, max);
//        } else {
//            System.out.println("Your number is " + input);
//
//        }
//        return input;
//
//    }
//
//
//    public int getInt() {
//        System.out.println("Enter a number: ");
//        int userInput = scanner.nextInt();
//        return userInput;
//
//    }
//
//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        int userInput = scanner.nextInt();
//        return userInput;
//
//    }
//
//    public double getDouble(double min, double max) {
//        System.out.println("Enter number between " + min + " and " + max);
//        double input = scanner.nextDouble();
//        if (input < min) {
//            System.out.println("Your number needs to be higher than " + min);
//            getDouble(min, max);
//        } else if (input > max) {
//            System.out.println("Your number needs to be lower than " + max);
//            getDouble(min, max);
//        } else {
//            System.out.println("Your number is " + input);
//
//        }
//        return input;
//    }
//
//    public double getDouble(double min, double max, String prompt) {
//        System.out.println(prompt);
//        double input = scanner.nextDouble();
//        if (input < min) {
//            System.out.println("Your number needs to be higher than " + min);
//            getDouble(min, max);
//        } else if (input > max) {
//            System.out.println("Your number needs to be lower than " + max);
//            getDouble(min, max);
//        } else {
//            System.out.println("Your number is " + input);
//
//        }
//        return input;
//    }
//
//    public double getDouble() {
//        System.out.println("Enter a decimal: ");
//        double userInput = scanner.nextDouble();
//        return userInput;
//
//
//    }
//
//    public double getDouble(String prompt) {
//        System.out.println(prompt);
//        double userInput = scanner.nextDouble();
//        return userInput;
//
//
//    }
//
//
//}