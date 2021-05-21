package lesson4.garage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> garage = new ArrayList<>();
        Car car1 = new Car("Renault", 150);
        car1.value = 100;
        Car car2 = new Car("Lada", 40);
        car2.value = 120;
        Car car3 = new Car("BMW", 200);
        car3.value = 10;

        garage.add(car1);
        garage.add(car2);
        garage.add(car3);

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3));

        Collections.sort(garage);
        System.out.println("Автомобили в гараже без компаратора: " + garage);
        Collections.sort(cars, new CarComparatorByValue());
        System.out.println("Автомобили в гараже с компаратором: " + cars);
    }
}
