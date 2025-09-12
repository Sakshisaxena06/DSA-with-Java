public class simple{
    public static void main(String[] args){
//    pattern1(4) ;
//    pattern2(5);
// pattern3(4);
// pattern4(4);
// pattern28(5);
pattern30(5);
    }
    static void pattern1(int n ){
        for(int row =1; row<=n ; row++){
            // the approch the no of row * = no  of colums 
            //* 
            //* * 
            //* * * 
            //* * * * 
            for( int col =1; col<= row ; col++){
                System.out.print("*");
            }
            System.out.println( ) ;
        }
    }

    static void pattern2(int m ){
for(int i =m ; i>=1 ;i--){
    for(int j =1; j<=i ; j++){
        System.out.print("*");
    }
        System.out.println(" ");
    
}
    }

     static void pattern3(int n ){
        for(int row =1; row<=n ; row++){
            
            for( int col =1; col<= row ; col++){
                System.out.print(col);
            }
            System.out.println( ) ;
        }
    }

     static void pattern4(int n ){
        for(int row =0; row< 2* n ; row++){
            int totalColsInRows = row > n ? 2 * n - row  : row ;
            for( int col =1; col<= totalColsInRows ; col++){
                System.out.print("*");
            }
            System.out.println( ) ;
        }
    }
    static void pattern28(int n ){
        for(int row =0; row < 2* n ; row++){
            int totalColsInRows = row > n ? 2 * n - row  : row ;
int totalNoOfSpaces = n - totalColsInRows ;
for(int s =0 ; s < totalNoOfSpaces ; s++){
    System.out.print(" ");
}
            for( int col =1; col<= totalColsInRows ; col++){
                System.out.print("*");
            }
            System.out.println( ) ;
        }
    }
static void pattern30(int n ){
    for(int row = 1 ; row <= n; row++){
        for(int s =0 ; s < n-row ; s++){
            System.out.print(" ");
        }
        for(int col= row ; col >= 1 ; col--){
            System.out.print(col);
        }
        for(int col = 2; col <= row ; col++){
            System.out.print(col);
        }
        System.out.println();
    }
}

}