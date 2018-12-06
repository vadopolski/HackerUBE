package day6.task2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 6, 8};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(getOneArr(arr1, arr2)));
    }

    public static int[] getOneArr(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < newArr.length; k++){
            if(j < arr2.length){
                System.out.println("test");
                newArr[k] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
            } else {
                newArr[k] = arr1[i++];
            }
            System.out.println(k);
        }
        return newArr;
    }
}