package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student John = new Student("John");
        John.addGrade(63);
        John.addGrade(70);
        John.addGrade(67);
        John.addGrade(100);

        Student Donald = new Student("Donald");
        Donald.addGrade(90);
        Donald.addGrade(90);
        Donald.addGrade(90);
        Donald.addGrade(90);

        Student Joe = new Student("Joe");
        Joe.addGrade(55);
        Joe.addGrade(66);
        Joe.addGrade(77);
        Joe.addGrade(88);

        Student Odo = new Student("Odo");
        Odo.addGrade(99);
        Odo.addGrade(44);
        Odo.addGrade(79);
        Odo.addGrade(79);

        students.put("jjmac7777777", John);
        students.putIfAbsent("Donald4444", Donald);
        students.putIfAbsent("Joe55555", Joe);
        students.putIfAbsent("Odo666666", Odo);

        commandLineInterface(students);

//        System.out.println(students.keySet());
    }



    public static void commandLineInterface(HashMap<String, Student> students){
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");

        do {

            for (String key : students.keySet()) {
                System.out.print("|" + key + "| ");
                System.out.println("\n");
            }

            System.out.println("What student would you like to see more information on?\n");

            String userKey = input.getString();

            if (students.containsKey(userKey)) {

                Student currentStudent = students.get(userKey);

                System.out.println("Name: " + currentStudent.getName() + "GitHub Username: " + userKey);
                System.out.println("Current Average: " + currentStudent.getGradeAverage());

            } else {
                System.out.println("Sorry, there's no student with the GitHub username: " + userKey);
            }

            System.out.println("Would you like to see another student?");
        } while (input.yesNo("Would you like to create another circle?"));

        System.out.println("Good bye \\m/");

    }

}