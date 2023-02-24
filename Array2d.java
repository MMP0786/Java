import java.util.*;

public class Array2d {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give the no of rows");
        int rows = sc.nextInt();
        System.out.println("Give the no of cols");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.println(" Give the rows no : " + (i + 1));
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Search ele Provid");
        int search = sc.nextInt();
        System.out.println("print matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == search)
                    System.out.print("It present at index row" + " " + i + " and cols " + " " + j);
            }
            System.out.println();
        }

    }
}