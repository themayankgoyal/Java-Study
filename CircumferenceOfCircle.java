import java.util.*;
public class CircumferenceOfCircle {
    public static double circumference(double r){
        double c = 0;
        c = 2*3.14*r;
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        double r  = sc.nextInt();
        System.out.println(circumference(r));
    }
    
}
