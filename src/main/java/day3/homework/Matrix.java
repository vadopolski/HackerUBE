package day3.homework;

public class Matrix {

    static int count2 = 100;
    static int matrixSize = 20;
    static int [][] matrix32 = new int[matrixSize][matrixSize];

    public static void fillBorder(int i, int j, int size){
        while (j < size && matrix32[i][j] == 0){
            matrix32[i][j] = count2++;
            j++;
        }

        i++;
        j--;
        while (i < size && matrix32[i][j] == 0) {
            matrix32[i][j] = count2++;
            i++;
        }

        i--;
        j--;
        while (j >= 0 && matrix32[i][j] == 0){
            matrix32[i][j] = count2++;
            j--;
        }

        j++;
        i--;
        while (j < size && matrix32[i][j] == 0){
            matrix32[i][j] = count2++;
            i--;
        }

        if (size > 1) {
            fillBorder(i + 1, j + 1, size - 1);
        }
    }

    public static void main(String[] args) {
        int j = 0;
        int i = 0;

        fillBorder(i, j, matrix32.length);

        if (matrix32.length % 2 == 1) {
            int n = matrix32.length / 2;
            matrix32[n][n] = count2;
        }

        for (int[] inner : matrix32) {
            for (int num : inner)System.out.print(num + " ");
            System.out.println();
        }
    }

}