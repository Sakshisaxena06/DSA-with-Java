import java.util.Scanner;
import java.util.Arrays;
public class Array{
    public static void main(String[] args){
        //  String[] arr = new String[4];
        //  System.out.println(arr[0]);
        int[] arr = new int[4];
 Scanner in = new Scanner(System.in);
         arr[0]=90;
         arr[1]=80;
         arr[2]=66;
         arr[3] = 90;
         for(int i = 0; i < arr.length ; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
           arr[i] =  in.nextInt();
         }

         System.out.print(Arrays.toString(arr)); 
         // Entered

        //  for(int i =0; i < arr.length ; i++){
        //  System.out.print(arr[i] + " ");
        //  }
    }
}