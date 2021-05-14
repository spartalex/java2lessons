package lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
            InputStream inputStream = new FileInputStream("adsfdsf");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        System.out.println("Наша программа жива!");
    }
}
