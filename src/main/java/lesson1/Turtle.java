package lesson1;

public class Turtle extends Animal implements CanSwim {
    private int swimmingSpeed;

    @Override
    public void voice() {
        System.out.println("Черепаха издает звук");
    }

    public Turtle(String name, int age, String color) {
        super(name, age, color);
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public double swim(int length) {
        System.out.println("Я черепаха я плыву");
        return length / swimmingSpeed;
    }
}
