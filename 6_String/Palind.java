public class Palind{
    public static void main(String[] args){
        String str = "abccba";
         System.out.println(isPalindrone(str)) ; // it means if reverse of string is same or not  we do it by binary search 
    }
    static boolean isPalindrone(String str){
        str = str.toLowerCase() ;
        for(int i =0; i<= str.length() /2;i++){
char start = str.charAt(i) ;
char end = str.charAt(str.length() - 1 - i) ;
if(start!= end){
    return false;
}
        }
        return true ;
    }
}