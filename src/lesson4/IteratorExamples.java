package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for (Integer integer: integers) {
            System.out.println(integer);
            //integers.remove(integer);
        }

        Iterator<Integer> integerIterator = integers.iterator();
        while (integerIterator.hasNext()) {
            Integer element = integerIterator.next();
            if (element == 5) {
                integerIterator.remove();
            }
        }
        System.out.println(integers);
    }
}
