package lesson3;

import java.util.List;

public class MultipleGenBox<T, U> {
    private T obj1;
    private U obj2;

    public MultipleGenBox(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public U getObj2() {
        return obj2;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }

    public static void main(String[] args) {
        MultipleGenBox<Integer, String> multipleGenBox = new MultipleGenBox<>(14500000, "Население России");
        System.out.println(multipleGenBox.getObj2() + multipleGenBox.getObj1());
    }
}
