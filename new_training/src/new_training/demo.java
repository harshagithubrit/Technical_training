package new_training;
import java.util.*;

public class demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  // Read the input size
        int[][] arr = new int[n][n];  // Create a 2D array of size n x n
        
        // Fill the 2D array based on the custom rule
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {  // Loop through the elements of row i
                if (i == 0 && j == 0) {
                    arr[i][j] = 1;  // Base case: First element of first row is 1
                } else if (j == 0) {
                    arr[i][j] = arr[i-1][i-1];  // The first element of the row is same as the first element of the previous row
                } else {
                    arr[i][j] = arr[i][j-1] + arr[i-1][j-1];  // The sum of the previous element and the element diagonally above
                }
            }
        }
        
        // Print the last element in the last row (just for verification or other purposes)
        System.out.println(arr[n-1][n-1]);  // This prints the last element of the last row
        
        // Optionally, print the entire triangle for visualization
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();  // Move to the next line for each row
//        }
        
        input.close();
    }
}

