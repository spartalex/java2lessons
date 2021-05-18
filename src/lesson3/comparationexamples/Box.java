package lesson3.comparationexamples;

import java.util.Arrays;

public class Box implements Comparable<Box> {
    private int size;

    public Box(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Box[] boxes = {new Box(1), new Box(6), new Box(3)};
        Arrays.sort(boxes);
        System.out.println(Arrays.toString(boxes));
    }

    @Override
    public int compareTo(Box o) {
        return size - o.size;
    }
}
