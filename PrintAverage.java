import java.util.*;
public class PrintAverage {
    public static int printAverage(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter 3 Numbers");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.println(printAverage(a,b,c));
    }
}
