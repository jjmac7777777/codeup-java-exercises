package practice;

public class Mallard extends Duck implements Quackable {

    int flySpeed;

    public Mallard(String name, int age, int flySpeed) {
        super(name, age);
        this.flySpeed = flySpeed;

    }
    public void quack() {
        System.out.println("quack");

    }

    public int getFlySpeed() {
        return flySpeed;

    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }
}
