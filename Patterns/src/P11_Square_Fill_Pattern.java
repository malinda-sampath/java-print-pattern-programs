public class P11_Square_Fill_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint(n);

    }

    public static void patternPrint(int n){
        for (int i=1 ; i<=n ; i++){
            for ( int j=0 ; j<n ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
