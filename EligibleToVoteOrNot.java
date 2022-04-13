import java.util.*;
public class EligibleToVoteOrNot {
    public static void ageVote(int age){
        if(age>=18){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to Vote");
        }
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        ageVote(age);
    }
}
