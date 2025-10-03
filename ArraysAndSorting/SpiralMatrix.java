package ArraysAndSorting;

public class SpiralMatrix {
    public static void spiral(int[][] mat) {
        int startRow = 0;
        int endRow = mat.length - 1;
        int startCol = 0;
        int endCol = mat.length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; ++j) {
                System.out.print(mat[startRow][j] + " ");
            }
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(mat[j][endCol] + " ");
            }
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(mat[endRow][j] + " ");
            }
            for (int j = endRow - 1; j > startRow; j--) {
                System.out.print(mat[j][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        spiral(matrix);
    }
}
