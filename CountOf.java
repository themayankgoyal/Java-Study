import java.util.*;
public class CountOf {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to Continue, 0 to end");
        int a = sc.nextInt();
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        while(a==1){
            System.out.println("Enter your number");
            int n = sc.nextInt();
            if(n<0){
                negative++;
            }else if(n>0){
                positive++;
            }else{
                zeros++;
            }
            System.out.println("press 1 to continue, 0 to end");
            a = sc.nextInt();
        }
        System.out.println("positives are =" + positive);
        System.out.println("negatives are =" + negative);
        System.out.println("Zeros are =" + zeros);
    }
    
}
