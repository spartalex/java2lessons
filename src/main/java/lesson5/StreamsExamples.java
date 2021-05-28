package lesson5;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StreamsExamples {
    public static void main(String[] args) {
        String tempString = "кот"; // -48: 256 - 48 = 208
        System.out.println(Arrays.toString(tempString.getBytes(StandardCharsets.US_ASCII)));
        System.out.println(Charset.defaultCharset());


        File file1 = new File("our_example.txt");
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(file1);
            outputStream.write("Кот".getBytes());
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (OutputStream outputStream1 = new FileOutputStream(file1)) {
            outputStream1.write("Кот2".getBytes());
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //long currentTime = System.currentTimeMillis();
        //try (OutputStream outputStream1 = new FileOutputStream("fivems1.txt")) {
        //    for (int i = 0; i < 5 * 1024 * 1024; i++) {
        //        outputStream1.write(65);
        //    }
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
        //System.out.println("Время на запись 5 мегабайт: " + (System.currentTimeMillis() - currentTime));

        long currentTime = System.currentTimeMillis();
        try (OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream("fivems1.txt"))) {
            for (int i = 0; i < 5 * 1024 * 1024; i++) {
                outputStream1.write(65);
            }
            outputStream1.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Время на запись 5 мегабайт c буферизацией: " + (System.currentTimeMillis() - currentTime));

        File file = new File("2.txt");
        try (InputStream inputStream = new FileInputStream("2.txt")) {
            for (int i = 0; i < file.length(); i++) {
                System.out.println(i + ":" + (char) inputStream.read());
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
