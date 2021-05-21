package lesson4.garage;

public class Car extends Vehicle {
    public int value;

    public Car(String model, int power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
