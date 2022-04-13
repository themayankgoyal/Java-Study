public class PascalTriangle {
    public static int giveFact(int n){
        int num = 1;
        for(int i = n; i>=1; i--){
            num = num*i;
        }
        return num;
    }
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(giveFact(n));
            }
        System.out.println();
        }
    }
}
