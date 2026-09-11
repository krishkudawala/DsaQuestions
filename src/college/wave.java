package college;

public class wave {
        public static void printWaveForm(int[][] matrix) {
                int rows = matrix.length;
                int cols = matrix[0].length;

                for (int col = 0; col < cols; col++) {
                    if (col % 2 == 0) {
                        // Print from bottom to top for even-indexed columns
                        for (int row = rows - 1; row >= 0; row--) {
                            System.out.print(matrix[row][col] + " ");
                        }
                    } else {
                        // Print from top to bottom for odd-indexed columns
                        for (int row = 0; row < rows; row++) {
                            System.out.print(matrix[row][col] + " ");
                        }
                    }
                }
            }

            public static void main(String[] args) {
                int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

                System.out.println("Wave form output:");
                printWaveForm(matrix);
            }
        }
