import java.util.Scanner;
public class ZeroOneTrinagle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int m = sc.nextInt();
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=i; j++){
                if(((i+j)%2)==1)
                System.out.print("0" + " ");
                else
                System.out.print("1" + " ");
            }
            System.out.println("");
        }
    }
    
}
