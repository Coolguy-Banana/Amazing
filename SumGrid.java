// SumGrid.java
public class SumGrid {

    // Method to sum all elements in a 2D grid (array)
    public static double sumGrid(double[][] grid) {
        double total = 0;
        for (double[] row : grid) {
            for (double element : row) {
                total += element;
            }
        }
        return total;
    }

    // Main method to test the function
    public static void main(String[] args) {
        double[][] grid = {{1.1, 2.2}, {3.3, 4.4}};
        System.out.println("Sum of grid: " + sumGrid(grid)); // Output: 11.0
    }
}
