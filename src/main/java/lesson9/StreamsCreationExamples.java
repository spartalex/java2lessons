package lesson9;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsCreationExamples {
    public static void main(String[] args) {
        IntStream.range(1, 1)
                .forEach(p -> System.out.println(p));

        System.out.println(Stream.iterate(5, x -> x + 5)
                .limit(100)
                .collect(Collectors.toList()));
    }
}
