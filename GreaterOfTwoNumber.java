import java.util.*;
public class GreaterOfTwoNumber {
    public static int greaterOfTwo(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(greaterOfTwo(a,b));
    }
}
