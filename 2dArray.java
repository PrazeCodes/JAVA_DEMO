import java.util.*;

public class 2dArray {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] matrix = new int [rows][cols];
        // input 
        //outer loop for rows 
        for (int i=0 ; i<rows ; i++) {
            // inner loop for column
            for(int j = 0 ; j<cols ; j++) {
                    matrix[i][j] = sc.nextInt[i][j]; 
            }
        }

        //output
        for (int i=0 ; i<rows ; i++) {
            // inner loop for column
            for(int j = 0 ; j<cols ; j++) {
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // find indices of a given number
        System.out.println("give the input of the number you want to find index of:") 
        int x = sc.nextInt();
        for (int i=0 ; i<rows ; i++) {
            // inner loop for column
            for(int j = 0 ; j<cols ; j++) {
                if(matrix[i][j] == x) {
                    System.out.println("the indices are : " i + " " + j)
                }
            }
        }
    }
}
