import java.util.Scanner;
 public class ArmstrongNo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int a  = in.nextInt();
        Armstrong(a);

        if (Armstrong(a)) {
            System.out.println(a + " is an Armstrong number.");
        } else {
            System.out.println(a + " is NOT an Armstrong number.");
        }


         // if we have  to print all Armstrong no we apply for loop nd give argument in Armstrong(i)
        System.out.println("All 3-digit Armstrong numbers:");
        for (int i = 100; i < 1000; i++) {
            if (Armstrong(i)) {
                System.out.println(i);
            
        }
    }
    }
    static boolean Armstrong(int a){
 int original = a;
  int sum =0;
  while(a>0){
        int rem = a%10;
        int cube = rem * rem * rem;
        sum+=cube;
        a=a/10;
  }
return sum==original;
    }
 }