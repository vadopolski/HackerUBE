package day1.homework;

public class ResultMoreThanMaxValueException extends RuntimeException {
    public ResultMoreThanMaxValueException(int finalResult) {
        super("The result is more than max int value (" + Integer.MAX_VALUE +
                ") and modified to 0 plus difference = " + finalResult);
    }
}
