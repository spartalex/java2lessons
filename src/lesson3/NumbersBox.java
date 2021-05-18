package lesson3;

public class NumbersBox<T extends Number> {
    private T[] array;

    public NumbersBox(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void test(int b, int... a) {

    }

    public double avg() {
        double sum = 0.0;
        for (T num : array) {
            sum = sum + num.doubleValue();
        }
        return sum / array.length;
    }

    public static <U extends Number> U getFirstNumber(NumbersBox<U> box) {
        return box.getArray()[0];
    }

    public boolean isSameAvg(NumbersBox<?> box) {
        return avg() == box.avg();
    }

    public static void main(String[] args) {
        NumbersBox<Integer> integerNumbersBox = new NumbersBox<>(1, 4, 6, 6, 7);
        System.out.println(integerNumbersBox.avg());
        NumbersBox<Integer> integerNumbersBox1 = new NumbersBox<>(1, 4, 6, 6, 7);
        System.out.println(integerNumbersBox.isSameAvg(integerNumbersBox1));

        System.out.println(getFirstNumber(integerNumbersBox));

        NumbersBox<Double> doubleNumbersBox = new NumbersBox<>(1.2, 4.0, 6.0);
        System.out.println(integerNumbersBox.isSameAvg(doubleNumbersBox));
    }
}
