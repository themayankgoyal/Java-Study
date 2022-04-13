import java.util.Scanner;

public class Patterns{
//floyd's Triangle
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Rows");
        int m=sc.nextInt();
        //System.out.println("Please Enter Columns");
        //int n=sc.nextInt();
        int counter = 0;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                counter++;
                System.out.print(counter + " ");
            }
            System.out.println("");
        }
    }
}

