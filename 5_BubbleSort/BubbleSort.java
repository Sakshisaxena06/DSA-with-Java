import java.util.Arrays;
 

 // there are two method of sorting ..
 
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {50,45,32,66,78,90};
        // bubble(a);
        selection(a) ;
        System.out.println(Arrays.toString(a));
    }

static void selection(int[] a){
    for(int i=0; i<a.length ; i++){
        // find the max item in the remaining arry and swap the current index 
        int last = a.length - i -1;
        int maxIndex = getMaxIndex(a, 0 ,  last) ;
        swap(a, maxIndex , last);
    }
}
 static void swap(int[] a , int first , int second){
    int temp = a[first] ;
    a[first] = a[second];
    a[second]=temp;
 }
private static int getMaxIndex(int[] a , int start , int end ){
    int max = start ; 
for(int i= start ; i<= end ; i++){
    if (a[max]  < a[i]){
        max = i ;
    }
}    
     return max ;
}
    static void bubble(int[] a) {
        boolean swapped;
        // run steps in n-1
        for (int i = 0; i < a.length; i++) {
            swapped = false;
            for (int j = 1; j < a.length - i; j++) {  // start from 1
                if (a[j] < a[j - 1]) {  // compare with previous element
                    // swap
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {  // already sorted
                break;
            }
        }
    }
}
