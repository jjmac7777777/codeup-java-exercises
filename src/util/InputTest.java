package util;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println(input.getString());
        System.out.println(input.yesNo("Would you like to create another circle?"));
        System.out.println(input.getInt(4, 12));;
        System.out.println(input.getDouble(7.2, 11.3));
        System.out.println(input.getString());
        System.out.println(input.yesNo("Would you like to create another circle?"));
        System.out.println(input.getInt(1, 10));
        System.out.println(input.getDouble(5.5, 10.5));

    }
}
