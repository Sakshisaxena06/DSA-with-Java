import java.util.Scanner;
import java.util.Arrays;
 public class Searchng{
    public static void main(String[] args){
        int nums[] ={23,45,43,2,1,56,66,19};
        int target = 2;
        int ans = linaerSearch( nums, target);
        System.out.print(ans);

        
    }

    // search in the array : return the index if they found
    //otherwise not found return them -1
    static int linaerSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        // run a loop
        for(int i =0;i<arr.length;i++){
            //check for element at every index
            int element = arr[i];
            if (element==target){
                 return i;
            }
           
        }
        return -1;
    }
 }