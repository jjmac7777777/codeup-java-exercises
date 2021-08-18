//CONSOLE IO EXERCISES

import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
//#1 COPY CODE INTO MAIN METHOD
        double pi = 3.14159;
        System.out.println(pi);

        System.out.println("The value of pi is approximately 3.14");

        //EXPLORE THE SCANNER CLASS

//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter Integer:");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);

//ENTERING A NON-INTEGER:
//#1
//        Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//        at java.base/java.util.Scanner.next(Scanner.java:1594)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//        at ConsoleExercises.main(ConsoleExercises.java:14)
//
//        Process finished with exit code 1

//#2
// Prompt a user to enter 3 words, and store each of them in a separate variable.
// Then, display them back in the console, each on a newline.

//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter four words:\n one \n two \n three \n four \n");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);

        //Enter three words:
        //one
        //two
        //three

        //What happens if you enter less than 3 words?
        //Enter two words:
        //one
        //two

        //What happens if you enter more than 3 words?
        //Enter four words:
        //one
        //two
        //three
        //four

//#3 Explore the Scanner Class

//Prompt a user to enter a sentence, then store that sentence in a String
//variable using the next method. Then, display that sentence back to the user.

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a sentence: What's the weather like today?");
        String userInput = scanner.nextLine();
        System.out.println(userInput);


//#4    Area of Codeup Classrooms

        System.out.println("Can you tell me the dimensions of Codeup Classrooms?");

        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Give us a width: ");


        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Give us a length: ");


        double area = length * width;
        double perimeter = (width * 2) + (length * 2);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

}