import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n:    ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of matrix A: ");

        int matrix_A[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix_A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix B: ");

        int matrix_B[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix_B[i][j] = sc.nextInt();
            }
        }

        int matrix_C[][] = new int [n][n];
        display_matrix("Classical Multiplication", Classical_Matrix_Multiplication.matrixMultiply(matrix_A, matrix_B, n), n);
        display_matrix("Naive Divide and Conquer", Classical_Matrix_Multiplication.matrixMultiply(matrix_A, matrix_B, n),n);
        display_matrix("Strassen_Matrix", Strassen_Matrix.strassen_multiplication(matrix_A,matrix_B, matrix_C, n),n);

    }

    public static void display_matrix (String methods_name, int matrixC[][], int n){
        int i, j;
        System.out.println("\n Matrix C using " + methods_name + ":");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(matrixC[i][j] + " ");
            System.out.println();
        }
    }
}
