import java.util.*;
public class practice {
    public static void main(String args[]){
        String str = "Mayank";
        char[] s1 = str.toLowerCase().toCharArray();
        for(int i = 0; i<s1.length;i++){
            System.out.println(s1[i]-97);
        }
    }
}
