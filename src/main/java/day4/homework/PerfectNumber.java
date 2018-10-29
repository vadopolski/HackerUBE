package day4.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PerfectNumber {
    
    
    
    
    public static List<Long> getArrayWithCandidateFromPrimes(int maxPrimeNumber) {
        List<Long> result = new ArrayList<>();
        
        for (int number = 1; number < maxPrimeNumber; number++){
            
            for (int check = 2; check < number; ++check) {
                if (number % check == 0) {
                    break;
                }
                result.add((long)(Math.pow(2, number - 1) * (Math.pow(2, number) - 1)));
                break;
            }
        }
        
        return result;
    }
    
    public static boolean isPerfect(long number) {
        long devider = number / 2 + 1;
        Set<Long> deviders = new HashSet<>();
        
        do {
            devider--;
            if (number % devider == 0)
                deviders.add(devider);
            
        }
        while (devider > 1L);
        
        long sum = deviders.stream().mapToLong(i -> i.longValue()).sum();
        
        if (sum == number) {
            return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        for(Long testNumber : getArrayWithCandidateFromPrimes(20)){
            if (isPerfect(testNumber)){
                System.out.println(testNumber);
            }
        }
    }
}