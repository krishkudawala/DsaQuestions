package college;
import java.util.Random;
public class GameOfLife {
    private int rows, cols;
    private int[][] grid;
    public GameOfLife(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new int[rows][cols];
        initializeRandom();
    }
    // Initialize with random 0/1
    private void initializeRandom() {
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = rand.nextInt(2);
            }
        }
    }
    // Count live neighbors
    private int countNeighbors(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue; // skip self
                int r = x + i, c = y + j;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    count += grid[r][c];
                }
            }
        }
        return count;
    }
    // Compute next generation
    public void nextGeneration() {
        int[][] newGrid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int neighbors = countNeighbors(i, j);
                if (grid[i][j] == 1) {
                    newGrid[i][j] = (neighbors == 2 || neighbors == 3) ? 1 : 0;
                } else {
                    newGrid[i][j] = (neighbors == 3) ? 1 : 0;
                }
            }
        }
        grid = newGrid;
    }
    // Print grid
    public void printGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] == 1 ? " " : " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) throws InterruptedException {
        GameOfLife game = new GameOfLife(20, 40);
        for (int gen = 0; gen < 50; gen++) {
            System.out.println("Generation: " + gen);
            game.printGrid();
            game.nextGeneration();
            Thread.sleep(300); // pause for effect
        }
    }
}
