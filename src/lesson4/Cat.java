package lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 1);
        Cat cat2 = new Cat("Мурзик", 1);

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat1.equals(cat2));

        HashSet<Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2));
        System.out.println(cats);

        HashSet<Integer> integersHashSet = new HashSet<>(Arrays.asList(0, 1, 5, 2, 11, 3, 9, 2, 5));
        LinkedHashSet<Integer> integersLinkedHashSet = new LinkedHashSet<>(Arrays.asList(0, 1, 5, 2, 11, 3, 9, 2, 5));
        System.out.println(integersHashSet);
        System.out.println(integersLinkedHashSet);

        TreeSet<Cat> catTreeSet = new TreeSet<>(Arrays.asList(cat1, cat2, new Cat("sdf", 234),
                new Cat("sdf1", 0)));
        System.out.println(catTreeSet);

        TreeSet<Cat> catTreeSet1 = new TreeSet<>(new CatByNameLengthComparator());
        catTreeSet1.add(new Cat("sadfsdf", 324));
        catTreeSet1.add(new Cat("sadf", 324));
        catTreeSet1.add(new Cat("sadfsdffff", 321));
        System.out.println(catTreeSet1);

    }

    @Override
    public int compareTo(Cat o) {
        return age - o.getAge();
    }
}
