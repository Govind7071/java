import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Declare jagged array
        int[][] arr = new int[rows][];

        // Input elements for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();

            arr[i] = new int[cols]; // create variable size row

            System.out.println("Enter elements for row " + i + ":");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print jagged array
        System.out.println("\nJagged Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }

        sc.close();
    }
}