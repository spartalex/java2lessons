package lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ALotOfExceptions {
    public static void main(String[] args) {
        try {
            test();
            int a = 1 / 0;
            String[] strings = {"sad"};
            String element = strings[1];
            InputStream inputStream = new FileInputStream("sdfsdf");
        } catch (StackOverflowError | ArithmeticException | FileNotFoundException exception) {
            System.out.println("Какая-то ошибка!");
        //}
        //catch (ArithmeticException e) {
        //    e.getMessage();
        //    System.out.println("Мы попытались поделить на ноль");
        //} catch (FileNotFoundException e) {
        //    System.out.println("Файл не найден");
        } finally {
            System.out.println("Текст из блока finally!");
        }
        System.out.println("Я жив!");
    }

    public static void test() {
        test();
    }
}
