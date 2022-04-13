import java.util.*;
public class SpiralMatrix {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows = sc.nextInt();
        System.out.println("Enter Columns");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter Elements of Matrix");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Entered Matrix is");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        int rowstart = 0;
        int rowend = rows-1;
        int colstart = 0;
        int colend = cols-1;

        System.out.println("Spiral order od matrix is given below");

        while(rowstart<=rowend && colstart<=colend){
            //1
            for(int i = colstart; i<=colend; i++){
                System.out.print(matrix[rowstart][i] + " ");
            }
            rowstart++;
            //2
            for(int i = rowstart; i<=rowend; i++){
                System.out.print(matrix[i][colend] + " ");
            }
            colend--;
            //3
            for(int i = colend; i>=colstart; i--){
                System.out.print(matrix[rowend][i] + " ");
            }
            rowend--;
            //4
            for(int i = rowend; i>=rowstart; i--){
                System.out.print(matrix[i][colstart] + " ");
            }
            colstart++;
        }
    }
}
