import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class MaxElement{
    public static void main(String[] args){
        int arr[] ={1,2,5,76,89};
       System.out.println(max(arr));
    }
static int max(int[] arr){
    //find max element 
 int maxVal = arr[0];
    for (int i =0; i<arr.length;i++){
       if(arr[i] > maxVal){
        maxVal=arr[i];
       }
    }
    return maxVal;
}
}