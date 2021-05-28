package lesson2;

public class UncheckedExceptions {
    public static void main(String[] args) {
        String[] arr = {"str1", "str3", "str2"};
        //String strTest = arr[3];

        int c = 0;
        int b = 1;

        if (c != 0) {
            int a = b / c;
        } else {
            System.out.println("Мы не смогли произвести расчет!");
        }
        try {
            int a = b / c;
        } catch (Exception e) {
            System.out.println("Деление на ноль");
        }
        System.out.println("Я жив");
    }
}
