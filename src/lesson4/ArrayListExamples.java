package lesson4;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println(integers.isEmpty());
        integers.add(99);

        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        arrayList.add(10);
        System.out.println(arrayList);
        arrayList.add(1, 101);
        arrayList.set(1, 202);
        System.out.println(arrayList);
        arrayList.addAll(integers);
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.remove(new Integer(202));
        System.out.println(arrayList);

        System.out.println(arrayList.contains(new Integer(19)));

    }
}
