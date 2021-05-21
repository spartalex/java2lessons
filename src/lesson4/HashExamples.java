package lesson4;

import java.util.HashMap;

public class HashExamples {
    public static void main(String[] args) {
        System.out.println("test".hashCode());
        System.out.println("test1".hashCode());

        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(12, "test");
        integerStringHashMap.put(12, "test1");
        integerStringHashMap.put(14, "test2");
        System.out.println(integerStringHashMap);
    }
}
