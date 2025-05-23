public class P8_Rhombus_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint(n);

    }

    public static void patternPrint(int n){
        for ( int i=1; i<=n ; i++){
            for ( int j=n-i; j>0 ; j--){
                System.out.print(" ");
            }

            for ( int j=n ; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
