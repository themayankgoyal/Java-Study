import java.util.*;

public class CheckEven {
    public static boolean isEven(int n){
        boolean flag = true;
        if(n%2==0){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
    
}
