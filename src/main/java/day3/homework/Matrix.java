package day3.homework;

public class Matrix {
    public static int[][] fillBorder(int i, int j, int size, int count, int[][] matrix) {
        while (j < size && matrix[i][j] == 0)
            matrix[i][j++] = count++;
        i++;
        j--;
        while (i < size && matrix[i][j] == 0)
            matrix[i++][j] = count++;
        i--;
        j--;
        while (j >= 0 && matrix[i][j] == 0)
            matrix[i][j--] = count++;
        j++;
        i--;
        while (j < size && matrix[i][j] == 0)
            matrix[i--][j] = count++;
        if (size > 1)
            fillBorder(i + 1, j + 1, size - 1, count, matrix);
        return matrix;
    }
    
    public static int[][] fillSpiralMatrix(int startNumber, int size) {
        int[][] matrix = fillBorder(0, 0, size, startNumber, new int[size][size]);
        if (size % 2 == 1)
            matrix[size / 2][size / 2] = matrix[size / 2][size / 2 - 1] + 1;
        return matrix;
    }
    
    public static void main(String[] args) {
        int[][] spiralMatrix = fillSpiralMatrix(100, 5);
        for (int[] inner : spiralMatrix) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}