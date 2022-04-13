import java.util.Scanner;

public class PowerOfTwoBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if(n != 1 && n != 0 && (n & (n-1))==0){
            System.out.println("Number is Power of Two");
        }else{
            System.out.println("Number is not Power of Two");
        }
    }
    
}
