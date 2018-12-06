package day6.t5outputequations;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 1};
        int[] arr1 = {2, 0, 0, 0};

        System.out.println(equationsOut(arr));
    }


    public static StringBuilder equationsOut(int[] arr) {
        StringBuilder result = new StringBuilder();
        int k = 0;
        while (k < arr.length) {
            if (k != 0 && arr[k] != 0) {
                result.append(" + ");
            }

            if (arr[k] != 0) {
                result.append(arr[k]);
            }

            if (arr[k] != 1) {
                for (int m = 0; m < arr[k]; m++) {
                    result.append("x");
                }
            }
            k++;
        }
        if (result.length() == 0) result.append("0");

        return result;
    }
}
