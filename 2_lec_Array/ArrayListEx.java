import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListEx{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(43);
        list.add(45);
        list.add(78);
        System.out.println(list.contains(9087));

    System.out.println(list) ;
    list.set(0,99);  // it will change 0th index into 99
    list.remove(2) ; // index 2 element will remove
    System.out.println(list); 


    // input 
    Scanner in = new Scanner(System.in);
    for(int i = 0 ; i < 5; i++){
    list.add(in.nextInt());}
    //o/p

 for(int i = 0 ; i < 5; i++){
    System.out.println(list.get(i)) ;
    }
    System.out.println(list);
    
    }
}