package lesson2;

import jdk.internal.util.xml.impl.Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CalculateSquare {
    public static void main(String[] args) {
        //try {
        //    calculateSquare(-1, 5);
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}
        //System.out.println("Я  жив!");

        calculateSquare(-1, 3);


    }

    public static int calculateSquare(int a, int b) throws NegativeRectangleSideException {
        if (a <= 0 || b <= 0) {
            throw new NegativeRectangleSideException();
        } else {
            return a * b;
        }
    }
}
