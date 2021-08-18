package practice;

public class Practice {

    public static double multiply (int x, int y) {
        return x * y;

    }
    public static double multiply (double x, double y) {
        return x * y;

    }

    public static void main(String[] args) {
        System.out.println (multiply(5.0, 7.0 ));
        Mallard mallard = new Mallard("harold", 3, 10);
        getMallardDetails(mallard);

    }
    public static void getMallardDetails(Mallard mallard) {
        System.out.println("The mallard " + mallard.getName() + " flies at a speed of " + mallard.getFlySpeed());

    }



}
