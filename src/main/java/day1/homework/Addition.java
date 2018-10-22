package day1.homework;

public interface Addition {
    static int add(int a, int b) {
        long result = (long) a + b;

        int finalResult = 0;

        if (result > Integer.MAX_VALUE) {
            finalResult = (int) (result - Integer.MAX_VALUE);
            System.out.println("The result is more than max int value (" + Integer.MAX_VALUE  + ") and modified to 0 plus difference = " + finalResult);
        } else if (result < Integer.MIN_VALUE){
            finalResult = (int)(result - Integer.MIN_VALUE);
            System.out.println("The result is less than min int value (" + Integer.MIN_VALUE + ") and modified to 0 plus difference = " + finalResult);
        } else {
            finalResult = (int)result;
        }

        return finalResult;
    }
}