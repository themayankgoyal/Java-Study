import java.util.*;
public class MatrixSearchElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows = sc.nextInt();
        System.out.println("Enter Columns");
        int cols = sc.nextInt();
        System.out.println("Enter Elements of Matrix");
        int Matrix[][] = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Entered Matrix is");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Element you want to search");
        int x = sc.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(Matrix[i][j]==x){
                    System.out.println("Element Found " + "(" + i + "," + j + ")");
                }
            }
        }
    }
}
