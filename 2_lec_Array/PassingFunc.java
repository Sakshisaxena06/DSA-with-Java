import java.util.Scanner;
import java.util.Arrays;
public class PassingFunc{
     public static void main(String[] args){
        int[] nums ={3,2,4,5} ;
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

     }
     static void change(int[] arr){
        arr[0] = 99;
     }
}