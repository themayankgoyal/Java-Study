import java.util.*;
public class PrintTable {
    public static void table(int n){
        for(int i = 1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + i*n);
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        table(n);
    }
}
