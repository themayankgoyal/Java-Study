import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        if(n==1){
            return;
        }
        System.out.print(b + " ");
        for(int i = 1; i<=n-2; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        fibonacci(n);
    }
    
}
