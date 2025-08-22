import java.util.Scanner;
import java.util.Arrays;
public class MultiDimen{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[][] =new int[3][2];
        System.out.println(arr.length);   // no. of rows 

        //input
        for(int row = 0; row < arr.length ; row++){
            //for each col in every row 
            for(int col = 0 ; col < arr[row].length ;col++ ){
                arr[row][col] = in.nextInt() ;
            }
        }
        //output
        // for(int row=0; row < arr.length ;row++){
        //     // for each col in every row 
        //     for( int col = 0 ; col < arr[row].length ; col++){
        //         System.out.print(arr[row][col] + " ");     
        //     }
        //     System.out.println();
        // }
         for(int row=0;row < arr.length ; row++){
            System.out.print(Arrays.toString(arr[row]));
         }
         System.out.println();
    }
}