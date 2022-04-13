import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String args[]){
        //Taking Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number of Rows");
        int m = sc.nextInt();
        int counter = 0;
        //outer loop
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=i; j++){
                counter++;
                System.out.print(counter + " ");
            }
            System.out.println();
        }
    }
    
}
