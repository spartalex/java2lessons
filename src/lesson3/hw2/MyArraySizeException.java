package lesson3.hw2;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(int i) {
        super("Проблема в строке" + i);
    }
}
