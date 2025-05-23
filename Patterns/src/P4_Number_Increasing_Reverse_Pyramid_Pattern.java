public class P4_Number_Increasing_Reverse_Pyramid_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint(n);
    }

    public static void patternPrint(int n){
        for ( int i=n ; i>0 ; i-- ){
            for ( int j=1 ; j<=i ; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
