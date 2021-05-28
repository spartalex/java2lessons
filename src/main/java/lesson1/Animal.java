package lesson1;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String color;

    public abstract void voice();

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
