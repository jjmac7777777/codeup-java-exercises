
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        //TODO: return the person's name
        return name;
    }

    public void setName(String name) {
        //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
        //TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Person Jack = new Person("Jack McCloskey");

        System.out.println(Jack.getName());
        Jack.sayHello();
        Jack.setName("John");
        System.out.println(Jack.getName());
        Jack.sayHello();



        Person person1 = new Person("Ulysses");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Athena");
        System.out.println(person1.getName());
        System.out.println(person1.getName());

    }
}

