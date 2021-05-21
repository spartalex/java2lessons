package lesson4;

import java.util.Comparator;

public class CatByNameLengthComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
