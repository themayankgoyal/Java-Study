import java.util.*;
public class MaxMinNumArray {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i = 0; i<num.length; i++){
            System.out.println("Enter "+ (i+1)+ " Element");
            num[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i =0; i<num.length; i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        for(int i =0; i<num.length; i++){
            if(num[i]<min){
                min = num[i];
            }
        }
        System.out.println("Maximum Element is = " + max + " & Minimum Element is =" + min);
    }
}
