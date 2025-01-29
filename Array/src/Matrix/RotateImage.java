package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int length = matrix.length;
        int temp;
        for(int i = 0; i < length; i++){
            for(int j = i; j < length; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int i = 0;
        int j = length - 1;
        while(i < j && i < length){
            for(int k = 0; k < length; k++){
                temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
            }
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of rows for a square matrix: ");
        int n = scn.nextInt();;

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.println("Enter the value for " + i+ " " + j);
                matrix[i][j] = scn.nextInt();
            }
        }

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
