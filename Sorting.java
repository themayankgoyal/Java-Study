import java.util.*;
public class Sorting {
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};
        InsertionSortt(arr);
        //BubbleSort(arr);
        //SelectionSort(arr);
        
        PrintingFunctio(arr);
    }

    //Print Function
    public static void PrintingFunctio(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    //Bubble Sort Function
    public static void BubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //Selection Sort Function
    public static void SelectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int small = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    //Insertion Sort Function
    public static void InsertionSortt(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
