package day12.homework;

import java.util.stream.IntStream;

public class FindAllFunctional {
    
    private static int getNumberSquareFromAbc(int input, int position) {
        return (int)Math.pow(Integer.valueOf(((Character)String.valueOf(input).charAt(position)).toString()), 2);
    }
    
    public static void main(String[] args) {
        IntStream ints = IntStream.rangeClosed(100, 999);
        ints
            .filter(e -> (e - getNumberSquareFromAbc(e, 0)
                            - getNumberSquareFromAbc(e, 1)
                            - getNumberSquareFromAbc(e, 2)) % 11 == 0)
            .forEach(System.out::println);
        
    }
}
