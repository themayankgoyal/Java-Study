import java.util.*;
public class NumberPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
                }
            //for(int k = 1; k<=2*i; k++){
            //    if(k%2==1){
            //        System.out.print(i + " ");
            //   }else{
            //        System.out.print(" ");
            //    }
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
