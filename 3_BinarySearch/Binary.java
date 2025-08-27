import java.util.Scanner;
public class Binary{
public static void main(String[] args){
  int[] arr ={3,4,3,5,6,7,5,7};
  
  
        int target = 6;
        int ans = binarySearch(arr, target);
        System.out.println("Index: " + ans);
}

 // return the index
 // return -1 if doesnt exist
 public static int binarySearch(int[] arr,int target){
   int start =0;
    int end = arr.length-1 ;

   boolean IsAsc = arr[start] < arr[end] ;
   System.out.println(IsAsc);
   
     
    while(start <= end){
        int mid = start+ (end-start) /2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            end = mid -1;
        }else if(target>arr[mid]){
            start =mid +1;
        }else{
            return mid;
        }
    }
    return -1;
 }
}


