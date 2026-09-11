package college;

public class sudoku {
        private static final int N = 9;

        public static void main(String[] args) {
            int[][] board = {
                    {5,3,0, 0,7,0, 0,0,0},
                    {6,0,0, 1,9,5, 0,0,0},
                    {0,9,8, 0,0,0, 0,6,0},

                    {8,0,0, 0,6,0, 0,0,3},
                    {4,0,0, 8,0,3, 0,0,1},
                    {7,0,0, 0,2,0, 0,0,6},

                    {0,6,0, 0,0,0, 2,8,0},
                    {0,0,0, 4,1,9, 0,0,5},
                    {0,0,0, 0,8,0, 0,7,9}
            };

            System.out.println("Input:");
            printBoard(board);

            if (solve(board)) {
                System.out.println("\nSolved:");
                printBoard(board);
            } else {
                System.out.println("No solution exists.");
            }
        }

        // Solve the puzzle using backtracking
        private static boolean solve(int[][] board) {
            int[] empty = findEmpty(board);
            if (empty == null) return true; // no empty cell → solved

            int row = empty[0], col = empty[1];

            for (int num = 1; num <= 9; num++) {
                if (isSafe(board, row, col, num)) {
                    board[row][col] = num;
                    if (solve(board)) return true;
                    board[row][col] = 0; // backtrack
                }
            }
            return false;
        }

        private static int[] findEmpty(int[][] board) {
            for (int r = 0; r < N; r++)
                for (int c = 0; c < N; c++)
                    if (board[r][c] == 0)
                        return new int[]{r, c};
            return null;
        }

        private static boolean isSafe(int[][] board, int row, int col, int num) {
            // row and column
            for (int i = 0; i < N; i++)
                if (board[row][i] == num || board[i][col] == num) return false;

            // 3x3 subgrid
            int sr = (row / 3) * 3, sc = (col / 3) * 3;
            for (int r = sr; r < sr + 3; r++)
                for (int c = sc; c < sc + 3; c++)
                    if (board[r][c] == num) return false;

            return true;
        }

        private static void printBoard(int[][] board) {
            for (int r = 0; r < N; r++) {
                if (r % 3 == 0 && r != 0) System.out.println("------+-------+------");
                for (int c = 0; c < N; c++) {
                    if (c % 3 == 0 && c != 0) System.out.print("| ");
                    System.out.print(board[r][c] == 0 ? ". " : board[r][c] + " ");
                }
                System.out.println();
            }
        }
    }


