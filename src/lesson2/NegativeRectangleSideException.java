package lesson2;

public class NegativeRectangleSideException extends ArithmeticException {
    public NegativeRectangleSideException() {
        super("Одна из сторон отрицательная или нулевая");
    }
}
