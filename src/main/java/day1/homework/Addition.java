package day1.homework;

public interface Addition {
    static int add(int a, int b) {
        long result = a + b;

        int finalResult = 0;

        if (result > Integer.MAX_VALUE) {
            finalResult = (int) (result - Integer.MAX_VALUE);
            System.out.println("The result is more than max int value and modified to 0 plus difference.");
        }

        if (result < Integer.MAX_VALUE){
            finalResult = (int)(result + Integer.MAX_VALUE);
            System.out.println("The result is less than min int value and modified to 0 plus difference.");
        }

        return finalResult;
    }
}