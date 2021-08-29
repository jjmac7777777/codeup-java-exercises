import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);//Needs to.String method below...
        System.out.println(Arrays.toString(numbers));

        String[] beatles = {"John", "Paul", "Ringo"};
        System.out.println(beatles.length); // 3

        Person person1 = new Person("John");
        Person person2 = new Person("Paul");
        Person person3 = new Person("Ringo");

        Person[] persons = {person1, person2, person3};
        //for each current person of data type Person in the persons array
        for (Person currentPerson: persons) {
            System.out.println(currentPerson.getName());

        }

        System.out.println("this is our addMethod");
        addPerson(person2, persons);
    }
        public static Person[] addPerson(Person person, Person[] personsArray) {
        Person [] copyArray = Arrays.copyOf(personsArray, personsArray.length+1);
        copyArray[copyArray.length-1] = person;
            System.out.println(Arrays.toString(copyArray));
        return copyArray;

        }
}
