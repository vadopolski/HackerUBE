package day13;

public class Main {

    public static int sum(Integer a, Integer b) {
        if (a == null) return b;
        if (b == null) return a;
        return a + b;
    }

    public static double div(double a, double b) {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }


    public static int[] sort(int[] input) {
        int isChanged;

        if (input == null) return null;
        if (input.length == 0) return input;

        do {
            isChanged = 0;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int tmp = input[i + 1];
                    input[i + 1] = input[i];
                    input[i] = tmp;
                    isChanged++;
                }
            }
        } while (isChanged > 0);

        return input;
    }

    public static void main(String[] args) {

    }

}
