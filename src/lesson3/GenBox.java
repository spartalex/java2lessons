package lesson3;


public class GenBox<T> {
    private T object;
    //private static T test;

    public GenBox() {
    }

    public GenBox(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    //public static T test() {
    //
    //}

    public void test1() {
        //T obj = new T();
        //T[] testArray = new T[1];
    }

    @Override
    public String toString() {
        return "GenBox{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {
        GenBox<Integer> integerGenBox = new GenBox<>(10);
        GenBox<Double> doubleGenBox = new GenBox<>(10.0);
        GenBox<Integer> integerGenBox1 = new GenBox<>(20);

        System.out.println(integerGenBox.getObject() + integerGenBox1.getObject());
    }
}
