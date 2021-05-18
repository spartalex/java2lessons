package lesson3.hw2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        super("Проблема в элементе " + i + "," + j);
    }
}
