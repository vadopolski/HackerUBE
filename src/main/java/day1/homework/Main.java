package day1.homework;

public class Main {
    
    public static void main(String[] args) {
        System.out.println(Addition.add(1,1));
        
        System.out.println(Addition.add(2147483647, 1));
    
        System.out.println(Addition.add(Integer.MIN_VALUE, -1));
    }
}
