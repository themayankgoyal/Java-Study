import java.util.*;
public class ArraySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        int marks[] = new int[size];

        for(int i = 0; i<size; i++){
            System.out.println("Please Enter your " + (i+1) + " Element");
            marks[i]=sc.nextInt();
        }

        System.out.println("Enter Element Which you Want to Search");
        int num = sc.nextInt();

        for(int i = 0; i<size; i++){
            if(marks[i]==num){
                System.out.println("Your Element is Stored on Index Number = " + i);
            }
        }
    }
}
