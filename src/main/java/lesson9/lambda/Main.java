package lesson9.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Рыба", false, false));
        animalList.add(new Animal("Кот", true, true));
        animalList.add(new Animal("Черепаха", false, true));

        printAnimals(animalList, new CheckIsJumper());

        printAnimals(animalList, new Checkable() {
            @Override
            public boolean test(Animal animal) {
                return animal.isCanRun();
            }
        });

        printAnimals(animalList, a -> a.isCanRun());
    }

    public static void printAnimals(List<Animal> animals, Checkable checkable) {
        for (Animal animal : animals) {
            if (checkable.test(animal)) {
                System.out.println(animal);
            }
        }
    }
}
