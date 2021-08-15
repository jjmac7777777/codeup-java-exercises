import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        // We'll start by defining a hash map
        HashMap<String, String> usernames = new HashMap<>();

// and putting some data into it
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        System.out.println(usernames);
// {Ryan=ryanorsinger, Zach=zgulde, Fernando=fmendozaro, Justin=jreich5}

// obtaining values from the hash map by key
        usernames.get("Ryan"); // "ryanorsinger"
        usernames.get("Phillip"); // null
        usernames.getOrDefault("Jason", "gocodeup"); // "gocodeup"

// checking if keys or values are present
        usernames.containsKey("Justin"); // true
        usernames.containsValue("fmendozaro"); // true

        usernames = new HashMap<>();
        usernames.put("Ryan", "ryanorsinger");

        System.out.println(usernames); // {Ryan=ryanorsinger}

        usernames.putIfAbsent("Zach", "zgulde");
        usernames.putIfAbsent("Zach", "coderdude24");
        System.out.println(usernames); // {Ryan=ryanorsinger, Zach=zgulde}

        usernames.remove("Zach");
        System.out.println(usernames); // {Ryan=ryanorsinger}

        usernames.replace("Ryan", "torvalds");
        System.out.println(usernames); // {Ryan=torvalds}

        usernames.clear();
        usernames.isEmpty(); // true
    }
}
