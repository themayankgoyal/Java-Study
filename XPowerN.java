import java.util.Scanner;

import java.util.*;
public class XPowerN {
    public static int power(int x, int n){
        int value = x;
        for(int i = 2; i<=n; i++){
            value  = value*x;
        }
        return value;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = sc.nextInt();
        System.out.println("Enter Power");
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
}
