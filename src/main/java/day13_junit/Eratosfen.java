package day13_junit;

import java.util.stream.LongStream;

public class Eratosfen {
    public static boolean isPrime(long testNumber) {
        return testNumber > 1 && LongStream
                .rangeClosed(2, (long)Math.sqrt(testNumber))
                .noneMatch(n -> testNumber % n == 0);
    }

    public static void main(String[] args) {
        LongStream.rangeClosed(2, Integer.MAX_VALUE)
                .filter(l -> isPrime(l))
                .forEach(System.out::println);


    }
}
