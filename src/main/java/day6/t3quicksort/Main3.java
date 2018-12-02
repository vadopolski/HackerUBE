package day6.t3quicksort;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
//        Integer [] arr = new int[];


    }

    public static Integer[] sort(Integer[] mas) {
        if(mas.length <=1) return mas;
        int a0 = mas[0];
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> more = new ArrayList<>();

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < a0) less.add(mas[i]);
            else more.add(mas[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(Arrays.asList(sort(less.toArray(new Integer[0]))));
        result.add(a0);
        result.addAll(Arrays.asList(sort(more.toArray(new Integer[0]))));
        return result.toArray(new Integer[0]);
    }
}
