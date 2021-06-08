package lesson9;

import lesson9.lambda.Animal;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesExamples {
    public static void main(String[] args) {
        Predicate<Animal> animalPredicate = new Predicate<Animal>() {
            @Override
            public boolean test(Animal animal) {
                return false;
            }
        };

        Function<String, Integer> strToInt = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
    }
}
