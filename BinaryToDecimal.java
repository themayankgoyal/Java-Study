import java.util.*;
public class BinaryToDecimal {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //taking input - Binary Number
        System.out.println("Enter Binary Number");
        int num = sc.nextInt();

        //Calling Function that will Convert Binary to Decimal
        System.out.println(ConvertBinary(num));
        
        //taking input - Decimal Number
        System.out.println("Enter Decimal Number");
        int num2 = sc.nextInt();

        //Calling Function which will convert Decimal to Binary
        ConvertDecimal(num2);
    }

    //Function to Convert Binary to Decimal Number
    public static int ConvertBinary(int num){
        int temp =num;
        int last_digit = 0;
        int newnumber = 0;
        int base = 1;
        while(temp>0){
            last_digit = temp%10;
            temp = temp/10;
            newnumber += last_digit*base;
            base = base*2;
        }
        return newnumber;
    }

    //Function to Convert Decimal Number to Binary Number
    public static void ConvertDecimal(int num2){
        int array1[] = new int[40];
        int index = 0;
        while(num2>0){
            array1[index] = num2%2;
            num2 = num2/2;
            index++;
        }
        for(int i = index-1; i>=0; i--){
            System.out.print(array1[i]);
        }
    }
}
