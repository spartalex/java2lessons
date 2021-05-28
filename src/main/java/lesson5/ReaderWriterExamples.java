package lesson5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class ReaderWriterExamples {
    public static void main(String[] args) {
        try (OutputStream outputStream1 = new FileOutputStream("hello.txt")) {
            outputStream1.write("Привет мир!".getBytes());
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStreamReader in = new InputStreamReader(new FileInputStream("hello.txt"), StandardCharsets.UTF_8)) {
            int charCode;
            while ((charCode = in.read()) != -1) {
                System.out.println((char) charCode);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("hello1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //reader.readLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Student> studentArrayList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(Arrays.asList(line.split(";")));
                studentArrayList.add(new Student(Integer.parseInt(line.split(";")[0]),
                        line.split(";")[1], line.split(";")[2]));
                System.out.println(line);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(studentArrayList);

        try (PrintWriter printWriter = new PrintWriter("new_students.txt")) {
            for (Student student: studentArrayList) {
                printWriter.println(student);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
