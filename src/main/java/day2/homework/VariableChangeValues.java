package day2.homework;

public class VariableChangeValues {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println(a);
        System.out.println(b);

        b = a + b - (a = b);

        System.out.println(a);
        System.out.println(b);
    }
}
