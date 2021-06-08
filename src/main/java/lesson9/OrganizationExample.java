package lesson9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrganizationExample {
    public static void main(String[] args) {
        List<Organization> organizations = Arrays.asList(
                new Organization(1, "Yandex",
                        Arrays.asList(
                                new Person("Oleg", 24, Person.Position.ENGEENEER, 100),
                                new Person("Alena", 30, Person.Position.DIRECTOR, 300),
                                new Person("Anton", 31, Person.Position.MANAGER, 200),
                                new Person("Gleb", 35, Person.Position.ENGEENEER, 100))),
                new Organization(2, "Mail",
                        Arrays.asList(
                                new Person("Oleg1", 24, Person.Position.ENGEENEER, 100),
                                new Person("Alena1", 30, Person.Position.DIRECTOR, 300))),
                new Organization(3, "Sber",
                        Arrays.asList(
                                new Person("Oleg2", 24, Person.Position.ENGEENEER, 100),
                                new Person("Alena", 30, Person.Position.DIRECTOR, 300),
                                new Person("Anton2", 31, Person.Position.MANAGER, 200),
                                new Person("Gleb2", 35, Person.Position.ENGEENEER, 100)))
        );

        //Вернуть имена всех сотрудников, в компании которых > 2 человек

        System.out.println(organizations.stream()
                .filter(o -> o.getPersonList().size() > 2)
                .map(o -> o.getPersonList())
                .flatMap(p -> p.stream())
                .distinct()
                .map(p -> p.getName())
                .collect(Collectors.toSet()));

        //Создать map, где ключ-название должности, а значение - список людей на этой должности
        System.out.println(organizations.stream()
                .map(o -> o.getPersonList())
                .flatMap(people -> people.stream())
                .collect(Collectors.groupingBy(f -> f.getPosition())));

        //Создать map, где ключ-название должности, а значение - средняя зарплата людей на этой должности
        System.out.println(organizations.stream()
                .map(o -> o.getPersonList())
                .flatMap(people -> people.stream())
                .collect(Collectors.groupingBy(f -> f.getPosition(), Collectors.averagingDouble(f -> f.getSalary()))));
    }
}
