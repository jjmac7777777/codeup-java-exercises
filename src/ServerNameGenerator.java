import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"hilarious", "boring", "glib", "persevering", "odd", "even",
            "gargantuan", "outmoded", "clean", "clinical"};
    public static String[] nouns = {"Hermano", "Trevor Mullet", "Wizard of OZ", "Book of Eli", "Oscar De La Hoya",
            "Don 'John' Juan", "Mark Twain", "Dorian Gray", "Rye Bread", "Son of Sam"};


    public static void main(String[] args) {
        System.out.println("SERVER NAME:");
        System.out.println(getServer(adjectives) + "-" + getServer(nouns));
    }

    public static String getServer(String[] choices) {
        Random random = new Random();
        int randomNumber = random.nextInt(choices.length);
        return choices[randomNumber];
    }

}