package lesson1;

public class Wolf extends Animal implements CanSwim {
    private boolean isWild;
    private int swimmingSpeed;

    @Override
    public void voice() {
        System.out.println("Волк воет");
    }

    public Wolf(String name, int age, String color) {
        super(name, age, color);
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public double swim(int length) {
        System.out.println("Я волк я плыву");
        return length / swimmingSpeed;
    }
}
