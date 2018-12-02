package day6.t4reverseint;

import java.util.Arrays;

public class Main {

    static int p[] = {1, 3, 5, 7, 9};


    public static void main(String[] args) {
        System.out.println(Arrays.toString(p));
        reverse(0, p.length - 1);
        System.out.println(Arrays.toString(p));
    }

    public static void reverse(int i, int j){
        p[j] = p[i] + p[j] - (p[i] = p[j]);
        if(i < p.length/2 && j > 0) reverse(++i, --j);
    }
}
