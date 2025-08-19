import java.util.Scanner;
public class SwitchCase{


    // for converting float into integer
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
 String fruit = input.next();
 switch(fruit){
 case "Mango" -> System.out.println("king of fruit");
 case "Apple" -> System.out.println("Round fruit");
 default -> System.out.println("invalid");

     } }}
