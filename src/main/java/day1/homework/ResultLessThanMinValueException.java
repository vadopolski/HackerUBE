package day1.homework;

public class ResultLessThanMinValueException extends RuntimeException{
    public ResultLessThanMinValueException(int finalResult) {
        super("The result is less than min int value (" + Integer.MIN_VALUE + ") and modified to 0 plus difference = " + finalResult);
    }
}
