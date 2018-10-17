package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        //System.out.println(isPrime(3));

        List<Integer> values = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8);
        Stream<Integer> integerStream = values.stream()
                .filter(Sample::isGreaterThan3)
                .filter(Sample::isEven).filter(Sample::isPrime)
                .map(e -> e * 2);
        System.out.println(
                integerStream.collect(Collectors.toList())
        );
    }

    private static boolean isGreaterThan3(int num) {
        System.out.println("isGreaterThan " + num);
        return num > 3;
    }

    private static boolean isEven(int num) {
        System.out.println("isEven " + num);
        return num % 2 == 0;
    }

    private static boolean isPrime(int num) {
        return num > 1 &&
                IntStream.range(2, num)
                        .noneMatch(index -> num % index == 0);
    }


}
