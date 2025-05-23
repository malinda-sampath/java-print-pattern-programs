public class P7_Palindrome_Triangle_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint1(n);
        patternPrint2(n);

    }

    public static void patternPrint1(int n){
        for ( int i=1; i<=n ; i++){
            for ( int j=n; j>i ; j--) {
                System.out.print(" ");
            }
            for ( int j=i; j>=1 ; j--) {
                System.out.print(j);
            }

            for ( int j=1; j<=i ; j++) {
                if(j!=i) {
                    System.out.print(j+1);
                }
            }

            System.out.println();
        }
    }


    public static void patternPrint2(int n){
        for ( int i=1; i<=n ; i++){
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for ( int j=i ; j>0 ; j--){
                System.out.print(j+" ");
            }

            for ( int j=1; j<i;j++){
                    System.out.print(j+1+" ");
            }

            System.out.println();
        }
    }
}
