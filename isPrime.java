import java.util.*;
public class isPrime {
    public static boolean isPrime2(int n){
        boolean flag = true;
        for(int i = 2; i<n; i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if(isPrime2(n)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        } 
    }
}
