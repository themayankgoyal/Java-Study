public class SortedArrayAscendingOrder {
    public static void main(String args[]){
        int num[] = {3,4,6,2};
        boolean flag = true;
        for(int i =0; i<num.length-1; i++){
            if(num[i]<num[i+1]){
                flag = true;
            }else{
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
