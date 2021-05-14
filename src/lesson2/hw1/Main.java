package lesson2.hw1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CanJump[] jumpers = {new Cat(10, 10), new Human(12, 12)};
        CanRun[] runners = {new Cat(10, 10), new Human(12, 12)};

        Competitable[] competitors = {new Cat(10, 10), new Human(12, 12)};

        Overcomeable[] obstacles = {new Wall(10), new Road(100)};

        for (Overcomeable overcomeable : obstacles) {
            for (Competitable competitable : competitors) {
                overcomeable.overcome(competitable);
            }
        }

    }
}
