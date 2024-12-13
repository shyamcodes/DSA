import java.util.*;

//Problem : Search for key in sorted matrix

public class _04searchInSorted {
  public static boolean staircaseSearch(int matrix[][], int key) {
    int row = 0, col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == key) {
        System.out.println("Found at (" + row + "," + col + ")");
        return true;
      }
      // go left
      else if (key < matrix[row][col]) {
        col--;
      }
      // go down
      else {
        row++;
      }

    }
    System.out.println(" KEY NOT Found");
    return false;
  }

  public static void main(String args[]) {
    int matrix[][] = { { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 27, 29, 37, 48 },
        { 32, 33, 39, 50 } };
    int key = 33;
    staircaseSearch(matrix, key);
  }
}
