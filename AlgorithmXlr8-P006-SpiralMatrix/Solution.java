import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long[][] matrix = new long[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextLong();
            }
        }
        long[] result = new long[m * n];
        int index = 0;
        int startRow = 0;
        int startCol = 0;
        int endRow = m - 1;
        int endCol = n - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int col = startCol; col <= endCol; col++) {
                result[index++] = matrix[startRow][col];
            }
            startRow++;
            // Right column
            for (int row = startRow; row <= endRow; row++) {
                result[index++] = matrix[row][endCol];
            }
            endCol--;
            // Bottom row
            if (startRow <= endRow) {
                for (int col = endCol; col >= startCol; col--) {
                    result[index++] = matrix[endRow][col];
                }
                endRow--;
            }
            // Left column
            if (startCol <= endCol) {
                for (int row = endRow; row >= startRow; row--) {
                    result[index++] = matrix[row][startCol];
                }
                startCol++;
            }
        }
        for (long value : result) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}