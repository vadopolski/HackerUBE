package day1.homework;

public interface Addition {
    static int add(int a, int b) {
        long result = (long) a + b;

        int finalResult = 0;

        if (result > Integer.MAX_VALUE) {
            finalResult = (int) (result - Integer.MAX_VALUE);
            throw new ResultMoreThanMaxValueException(finalResult);
        } else if (result < Integer.MIN_VALUE) {
            finalResult = (int) (result - Integer.MIN_VALUE);
            throw new ResultLessThanMinValueException(finalResult);
        } else {
            finalResult = (int) result;
        }

        return finalResult;
    }
}