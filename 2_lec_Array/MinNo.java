import java.util.Scanner;
import java.util.Arrays;
 public class MinNo{
    public static void main(String[] args){
        int[] arr ={1,6,77,7,8};
        System.out.print(min(arr));
        
    }
    static int min(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
        }
        return min;
    }
 }