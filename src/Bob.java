import java.sql.SQLOutput;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        boolean pressOn = true;

        while (pressOn){
            bobAnswers();
            pressOn = bobAnswers();
        }
    }

    private static boolean bobAnswers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Say something to Bob?");
        String userResponse = scanner.nextLine().trim();

        if (userResponse.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userResponse.endsWith("!")){
            System.out.println("EZ Dude...er, Dad");
        } else if (userResponse.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Uhhhhhhhhh!!!.");
        }

        System.out.println("Would you like to say something else to Bob?");
        String response = scanner.next();
        return response.equalsIgnoreCase("y");
    }
}





