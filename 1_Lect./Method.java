import java.util.Scanner;

public class Method{
public static void main(String[] args){
// String message = greet();
// System.out.println(message);

String personalised = mygreet("sakshi");
System.out.println(personalised);


}

static String mygreet(String name){
    // String greeting ="its me here sakshi";
    String message = "hello " + name;

    return message;
}
}