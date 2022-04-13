import java.util.*;
public class MyStringBuilder {
    public static void main(String args[]){


        // String str = "h";
        // System.out.println(str);
        // str = str + "e";
        // System.out.println(str);
        // str = str + "l";
        // System.out.println(str);
        // str = str + "l";
        // System.out.println(str);
        // str = str + "o";
        // System.out.println(str);


        Scanner sc  = new Scanner(System.in);
        // int size = sc.nextInt();
        // String str[] = new String[size];
        
        // for(int i =0; i<size; i++){
        //     str[i]=sc.next();
        //     sb.append(str[i]);
        // }
        // System.out.println(sb.length());
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        // for(int i =0; i<str.length();i++){
        //     if(sb.charAt(i)=='e'){
        //         sb.setCharAt(i, 'i');
        //     }
        // }
        // System.out.println(sb);
        for(int i=0; i<sb.length();i++){
            if(sb.charAt(i)=='@'){
                sb.delete(i, sb.length());
                break;
            }
        }
        System.out.println(sb);




        // sb.setCharAt(2,'M');
        // sb.insert(2,'M');
        // sb.delete(2, 4);
        // System.out.println(sb);


        
        // for(int i =0; i<sb.length()/2; i++){
        //     int last = sb.length()-1-i;
        //     char lastchar = sb.charAt(last);
        //     char startchar = sb.charAt(i);
        //     sb.setCharAt(i, lastchar);
        //     sb.setCharAt(last, startchar);
        // }
        // System.out.println(sb);


    }
}
