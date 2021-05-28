package lesson5;

import com.sun.xml.internal.xsom.impl.scd.Step;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        File file = new File("student");

        Student student = new Student(1, "Олег", "test@test.test");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(student);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Student student1 = (Student) objectInputStream.readObject();
            String l = "adf";
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
