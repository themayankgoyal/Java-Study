import java.util.*;
public class GreatestCommonDivisor {
    public static void gcd(int a, int b){
        int c = 0;
        for(int i = 1; i<=a && i<=b; i++){
            if(a%i == 0 && b%i == 0){
                c=i;
            }
        }
        System.out.println(c);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a, b);
    }
}
