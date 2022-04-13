import java.util.*;
public class StringArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        String names[] = new String[size];
        for(int i = 0; i<names.length; i++){
            System.out.println("Enter " + (i+1) + " Name");
            names[i]=sc.next();
        }
        System.out.println("All Names are Given Below");
        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}
