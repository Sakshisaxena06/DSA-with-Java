public class SB{
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        for(int i =0; i< 26 ; i++){
            char ch = (char)('a'+ i);
            builder.append(ch) ;
        }
        System.out.println(builder);
        builder.deleteCharAt(0) ;  // it will delete an item 
        builder.reverse();  // it will reverse
        
        System.out.println(builder);
    }
}