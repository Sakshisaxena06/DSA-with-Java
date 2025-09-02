import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        bubble(a);
        System.out.println(Arrays.toString(a));
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
