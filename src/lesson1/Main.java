package lesson1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 11, "черный", true);
        cat1.setAge(-1);
        System.out.println(cat1.toString());

        Cat cat2 = new Cat("Мурзик", 11, "белый", true);
        System.out.println("Коты равны?" + cat1.equals(cat2));

        Animal animal = new Cat("Рыжик", 13, "серый", true);
        animal.voice();

        Wolf wolf = new Wolf("Волк", 10, "серый");
        if (animal instanceof Wolf) {
            ((Wolf) animal).isWild();
        }

        //Создать массив бассейнов, по которым проплывут животные. Вычислить время заплыва для каждого.

        Pool[] pools = {new Pool(10), new Pool(14), new Pool(40)};

        Turtle turtle = new Turtle("Черепаха", 12, "зеленый");
        turtle.setSwimmingSpeed(1);
        wolf.setSwimmingSpeed(12);
        cat1.setSwimmingSpeed(5);

        double catTime = 0;
        double turtleTime = 0;
        double wolfTime = 0;
        for (Pool pool: pools) {
            catTime = catTime + cat1.swim(pool.getLength());
            wolfTime = wolfTime + wolf.swim(pool.getLength());
            turtleTime = turtleTime + turtle.swim(pool.getLength());
        }

        CanSwim[] canSwims = {cat1, wolf, turtle};

        for (Pool pool: pools) {
            for (CanSwim swimmer: canSwims) {
                swimmer.swim(pool.getLength());
            }
        }

        System.out.println("Время черепахи:" + turtleTime);
        System.out.println("Время кота:" + catTime);
        System.out.println("Время волка:" + wolfTime);

    }
}
