package day4.homework;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PerfectNumberNew {
    
    public static boolean isPrime(long testNumber) {
        return testNumber > 1 && LongStream
            .rangeClosed(2, (long)Math.sqrt(testNumber))
            .noneMatch(n -> testNumber % n == 0);
    }
    
    public static void main(String[] args) {
        IntStream.rangeClosed(2, 30)
            .filter(p -> isPrime(p) && isPrime((int)(Math.pow(2, p) - 1)))
            .mapToLong(p -> (long)(Math.pow(2, p) / 2 * (Math.pow(2, p) - 1)))
            .forEach(System.out::println);
        
        IntStream.rangeClosed(2, 30)
            .filter(PerfectNumber::isPrime)
            .mapToLong(p -> (long)Math.pow(2, p))
            .filter(pp -> isPrime(pp - 1))
            .map(pr -> (pr / 2 * (pr - 1)))
            .forEach(System.out::println);
    }
}
