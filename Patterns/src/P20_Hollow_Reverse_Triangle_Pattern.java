public class P20_Hollow_Reverse_Triangle_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint(n);

    }

    public static void patternPrint(int n){
        for (int i=1 ; i<=n ; i++){
            for ( int j=1 ; j<=i ; j++ ){
                System.out.print(" ");
            }

            for ( int j=2*(n-i) ; j>=0 ; j--){
                if( j==0 || j==2*(n-i) || i==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
