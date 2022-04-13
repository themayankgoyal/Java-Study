import java.util.*;
public class ToggleBitPos {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter pos");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        int newnumber = bitmask^n;
        System.out.println(newnumber);
    }
    
}
