package lesson1;

import java.util.Objects;

public class Cat extends Animal implements CanSwim {
    private boolean isWild;
    private int swimmingSpeed;

    public Cat(String name, int age, String color, boolean isWild) {
        super(name, age, color);
        this.isWild = isWild;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Вы пытаетесь ввести некорректное значение!");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public void voice() {
        System.out.println("Кот говорит мяу");
    }

    public double swim(int length) {
        System.out.println("Я кот я плыву");
        return length / swimmingSpeed;
    }
}
