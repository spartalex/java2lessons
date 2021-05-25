package lesson5;

import java.io.File;
import java.io.IOException;

public class FileExamples {
    public static void main(String[] args) throws IOException {
        File file = new File("1.txt");
        System.out.println(file.exists());

        File file1 = new File("2.txt");
        file1.createNewFile();
        file1.isAbsolute();
        //file1.deleteOnExit();

        System.out.println(file1.length());

        File filePath = new File("1");
        filePath.isDirectory();
        filePath.mkdir();
        System.out.println("Размер директории 1: " + filePath.length());

        for (File fileTemp: filePath.listFiles()) {
            System.out.println("Имя файла: " + fileTemp.getName() + " , размер файла: " + fileTemp.length());
        }

        File filePath2 = new File("5/4/5/6");
        filePath2.mkdirs();
    }
}
