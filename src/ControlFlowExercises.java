import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//#1    LOOP BASICS

//        int i = 5;
//
//        while (i <= 15) {
//
//            System.out.println(i);
//            i++;
//        }


        //b.	Do While
        //•	Create a do-while loop that will count by 2's starting with 0 and ending at 100.
        // Follow each number with a new line.
        //•	Alter your loop to count backwards by 5's from 100 to -10.
        //•	Create a do-while loop that starts at 2, and displays the number squared on each line
        // while the number is less than 1,000,000. Output should equal:
        //c.	 2
        //d.	 4
        //e.	 16
        //f.	 256
        //g.	 65536
        //h.	For
        //•	Refactor the previous two exercises to use a for loop instead.
        //

//        int counter = 0;
//
//        do {
//            System.out.println(counter);
//            counter = counter + 2;
//        } while (counter <= 100);


//        int reverseCounter = 100;
//
//        do {
//            System.out.println(reverseCounter);
//            reverseCounter = reverseCounter - 5;
//
//        } while (reverseCounter >= -10);
//
//        for (int rvsCount = 100; rvsCount >= -10; rvsCount -= 5) {
//            System.out.println(rvsCount);
//        }


//        long Cntr = 2L;
//
//        do {
//            System.out.println(Cntr);
//            Cntr = Cntr * Cntr;
//        } while (Cntr < 1000000L);


//        long I = 2L;
//
//        for (long longI = 2L; longI < 1000000L; longI = longI * longI) {
//            System.out.println(longI);
//        }

//#2    FIZZBUZZ

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Number: ");
//        int number = sc.nextInt();
//
//        if (number % 5 == 0 && number % 3 == 0) {
//            System.out.println("Fizzbuzz");
//            if (number % 5 == 0) {
//                System.out.println("Buzz");
//                if (number % 3 == 0)
//                    System.out.println("Fizz");
//                else
//                    System.out.println(number);
//
//            }

//#3    DISPLAY TABLE OF POWERS

//        Scanner scanner = new Scanner(System.in);
//
//        boolean userChooses = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int numI = 1; numI <= userInt; numI++) {
//                System.out.printf("%-6d", numI);
//                System.out.print(" | ");
//                System.out.printf("%-7d", numI * numI);
//                System.out.print(" | ");
//                System.out.print(numI * numI * numI);
//                System.out.println();
//            }
//            System.out.println("Would you like to enter another number (y/n)?");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                userChooses = false;
//            }
//
//        } while (userChooses);

//#4    CONVERT NUMBER GRADES TO LETTER GRADES

        boolean yourGrade = true;

        do {
            System.out.println("Please enter a numerical grade from Zero to 100");

            Scanner sc = new Scanner(System.in);
            int userGrade = sc.nextInt();

            if (userGrade >= 90) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 70) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Do you want to enter a new grade? (Y/N)?");

            String userResponse = sc.next();


            if (!userResponse.equalsIgnoreCase("Y")) {
                yourGrade = false;
            }


        } while (yourGrade);


    }

    }
