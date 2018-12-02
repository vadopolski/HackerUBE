package day6;

import java.util.Arrays;

public class Main {


    public static MyList<Integer> list = new MyList<>();

    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);


        //        System.out.println(Arrays.toString(list.toArray()));

    }

}
