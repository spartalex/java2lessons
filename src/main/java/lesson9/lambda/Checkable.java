package lesson9.lambda;

@FunctionalInterface
public interface Checkable {
    boolean test(Animal animal);

    default void test1() {
        System.out.println("sdfdsf");
    }

    @Override
    String toString();

    //void test2();
}
