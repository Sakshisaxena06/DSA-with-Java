import java.util.Scanner;
 public class ArmstrongNo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int a  = in.nextInt();
        Armstrong(a);
       

    }
    static void Armstrong(int a){
 int original = a;
  int sum =0;
  while(a>0){
        int rem = a%10;
        int cube = rem * rem * rem;
        sum+=cube;
        a=a/10;

  }
  if (sum ==original){
System.out.println("It is armstrong no.: " + original);
} else{
    System.out.println("it is not an armstrong no.: " + original);
}
    }
    
 }