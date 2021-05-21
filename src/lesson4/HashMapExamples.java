package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<String, List<String>> countriesMap = new HashMap<>();
        countriesMap.put("Russia", new ArrayList<>(Arrays.asList("Moskow", "Kazan")));
        countriesMap.put("USA", new ArrayList<>(Arrays.asList("New York", "Washington")));
        countriesMap.put("Kazakhstan", new ArrayList<>(Arrays.asList("Astana", "Karaganda")));
        System.out.println(countriesMap);

        //for (String key: countriesMap.keySet()) {
        //    System.out.println(countriesMap.get(key));
        //    countriesMap.remove(key);
        //}

        //Collection<List<String>> towns = countriesMap.values();

        Iterator<Map.Entry<String, List<String>>> entryIterator = countriesMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, List<String>> entry = entryIterator.next();
            String country = entry.getKey();
            List<String> cities = entry.getValue();
            System.out.println(country);
            System.out.println(cities);
        }
    }
}
