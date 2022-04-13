import java.util.*;
public class StringTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String result = "";
        for(int i =0; i<str1.length(); i++){
            if(str1.charAt(i)=='e'){
                result+='i';
            }else{
                result+=str1.charAt(i);
            }
        }
        System.out.println(result);
    }
}
