import java.util.*;
public class StringsOne {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter size of array");
        int size  = sc.nextInt();
        String names[] = new String[size];
        int tolength = 0;
        for(int i = 0; i<size; i++){
            System.out.println("enter " + (i+1) + " name");
            names[i] = sc.next();
            tolength += names[i].length();
        }
        System.out.println(tolength);
    }
}
