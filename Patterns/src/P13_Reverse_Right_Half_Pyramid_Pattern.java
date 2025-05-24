public class P13_Reverse_Right_Half_Pyramid_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint(n);

    }

    public static void patternPrint(int n){
        for (int i=1 ; i<=n ; i++){
            for( int j=n; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
