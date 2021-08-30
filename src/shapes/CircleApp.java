package shapes;

import util.Input;

public class CircleApp {

    private static int counter;

    public static void main(String[] args) {
        System.out.println(circleCounter(1));
        Input input = new Input();

        System.out.println(input.getDouble());

        double userRadius = input.getDouble();

        Circle circle = new Circle(userRadius);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());


        while(input.yesNo("Would you like to create another circle?")) {
            userRadius = input.getDouble();
            circle = new Circle(userRadius);
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
            counter++;

        }


        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println(input.yesNo("yes or No"));
    }
        public static int circleCounter(int counter) {
            Input input = new Input();

            //System.out.println(input.getDouble());

            double userRadius = input.getDouble();

            Circle circle = new Circle(userRadius);
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());


            while(input.yesNo("Would you like to create another circle?")) {
                userRadius = input.getDouble();
                circle = new Circle(userRadius);
                System.out.println("Area: " + circle.getArea());
                System.out.println("Circumference: " + circle.getCircumference());
                counter++;

            }
        return counter;
        }

}
