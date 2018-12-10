package day12.homework;

public class FindAllMagicNumber {
    
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    Integer abcInt = Integer.valueOf(String.valueOf(a) + String.valueOf(b) + String.valueOf(c));
                    int other = abcInt - a * a - b * b - c * c;
                    if (other % 11 == 0)
                        System.out.println("abc = " + abcInt);
                }
            }
        }
    }
}