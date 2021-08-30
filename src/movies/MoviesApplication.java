package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {


        boolean streaming = true;

        while (streaming) {
            System.out.println(returnMenuDisplay());
            int reply = promptAndReturnUserChoice();
            streaming = executeUserChoice(reply);

        }

    }

    private static boolean executeUserChoice(int choice) {
        boolean continueStreaming = true;

        switch(choice) {
            case 0:
                System.out.println("Good bye!");
                continueStreaming = false;
                break;
            case 1:
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s -- %s\n", movie.getName(),    movie.getCategory());
                }
                break;
            case 2:
                System.out.println();
                viewMoviesByCategory("animated");
                System.out.println();
                break;
            case 3:
                System.out.println();
                viewMoviesByCategory("drama");
                System.out.println();
                break;
            case 4:
                System.out.println();
                viewMoviesByCategory("horror");
                System.out.println();
                break;
            case 5:
                System.out.println();
                viewMoviesByCategory("scifi");
                System.out.println();
                break;

        }

        return continueStreaming;
    }

    private static void viewMoviesByCategory(String category) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }
    }

    private static int promptAndReturnUserChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int userResponse = input.getInt(0, 5);
        return userResponse;
    }

    private static String returnMenuDisplay() {
        String menu = "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";

        return menu;
    }

}