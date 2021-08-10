package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Rectangle box1 = new Rectangle(5,4);
        System.out.println("Box1 Perimeter:" + box1.getPerimeter());
        System.out.println("Box1 Area:" + box1.getArea());

        Square box2 = new Square (5);


        System.out.println("Box2 Perimeter:" + box2.getPerimeter());
        System.out.println("Box2 Area:" + box2.getArea());

    }

}

//    Answer the following questions:
//
//        Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?

//java: shapes.Rectangle is not abstract and does not override abstract method getPerimeter() in shapes.Measurable...
//...public abstract class Quadrilateral extends Shape implements Measurable

//        What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//An @Override action would have to occur

