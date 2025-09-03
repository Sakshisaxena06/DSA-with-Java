import java.util.Arrays;
public class InsertionSort{
    public static void main(String[] args){
        int[] arr = {1,3,5,2,9,1} ;
        insertion(arr);
        System.out.println(Arrays.toString(arr)) ;

    }
   static void swap(int[] a , int first , int second){
    int temp = a[first] ;
    a[first] = a[second];
    a[second]=temp;
 }
    static void insertion(int[] arr){
        for( int i =0; i<= arr.length -2 ; i++){
            for(int j =i +1 ; j > 0 ;j-- ){
                if(arr[j] < arr[j-1]){
                    swap(arr, j ,j-1) ;
                }
                else{
                    break;
                }
            }
        }
    }
}