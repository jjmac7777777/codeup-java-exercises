
import java.util.Random;
import java.util.Scanner;

public class HighLow {


        public static void main(String[] args) {

            int guess, answer, count = 0;
            String restart;

            Random generator = new Random();
            Scanner scan = new Scanner(System.in);

            System.out.print("What number do you guess (enter 0 to quit)? ");
            guess = scan.nextInt();

            answer = generator.nextInt(100) + 1; // randomly generates a number between 1-100

            do
            {
                count++;

                if (guess == 0) // if user enters 0 to quit game, this message is displayed
                {
                    System.out.println("\nQuitting game");
                    System.out.println("\nWould you like to play again?");
                    restart = scan.next();
                    if (restart.equalsIgnoreCase("Y"))
                    {
                        System.out.print("Enter a number to start playing");
                        guess = scan.nextInt();
                    }
                    else
                        break;
                }
                if (guess == answer)
                {
                    System.out.println("That's correct! You made " + count + " guesses.");
                    System.out.println("Would you like to play again?");
                    restart = scan.next();
                    if (restart.equalsIgnoreCase("Y"))
                    {
                        System.out.print("Enter a number to start playing");
                        guess = scan.nextInt();
                    }
                    else
                        break;
                }
                if (guess < answer)
                {
                    System.out.print("Your guess is too low, try again.");
                    guess = scan.nextInt();
                }
                if (guess > answer)
                {
                    System.out.print("Your guess is too high, try again.");
                    guess = scan.nextInt();
                }

            }
            while (guess != 0);

            System.out.print("Thanks for playing!");
        }
    }

























