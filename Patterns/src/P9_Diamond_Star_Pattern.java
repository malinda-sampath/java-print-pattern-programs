public class P9_Diamond_Star_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint(n);

    }

    public static void patternPrint(int n){
        for ( int i=1; i<=n ; i++){
            for ( int j=n-i; j>0 ; j--){
                System.out.print(" ");
            }

            for ( int j=1 ; j<=i ; j++){
                System.out.print("*");
            }

            for ( int j=1 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for ( int i=1; i<=n-1 ; i++){
            for ( int j=0; j<i ; j++){
                System.out.print(" ");
            }

            for ( int j=n ; j>i ; j--){
                System.out.print("*");
            }

            for ( int j=n-1 ; j>i ; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
