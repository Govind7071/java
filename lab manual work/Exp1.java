// import java.util.Scanner;

// public class Exp1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int r = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int c = sc.nextInt();

//         int[][] A = new int[r][c];
//         int[][] B = new int[r][c];
//         int[][] sum = new int[r][c];

//         System.out.println("Enter elements of first matrix:");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 A[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Enter elements of second matrix:");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 B[i][j] = sc.nextInt();
//             }
//         }

//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 sum[i][j] = A[i][j] + B[i][j];
//             }
//         }

//         System.out.println("Sum of matrices:");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 System.out.print(sum[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }
import java.util.*;

public class Exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] sum = new int[r][c];

        // Input matrix A
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        // Input matrix B
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        // Addition
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = a[i][j] + b[i][j];

        // Output result
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
    }
}