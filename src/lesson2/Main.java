package lesson2;

public class Main {
    public static void main(String[] args) {
        int a = 1 / 0;
        test();
    }

    public static void test(){
        test();
        System.out.println("Код после вызова самого себя");
    }

    public static void test1() {
        test2();
    }

    public static void test2() {
        int a = 1 / 0;
    }
}
