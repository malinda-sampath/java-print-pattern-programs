public class P19_Hollow_Triangle_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint(n);

    }

    public static void patternPrint(int n){
        for (int i=1 ; i<=n ; i++){

            for( int j=i; j<=n; j++){
                System.out.print(" ");
            }

            for( int j=0; j<=2*(i-1) ; j++){
                if ( j==0 || j==2*(i-1) || i==n ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
