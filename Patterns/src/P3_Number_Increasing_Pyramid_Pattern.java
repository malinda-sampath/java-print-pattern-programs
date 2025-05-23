public class P3_Number_Increasing_Pyramid_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint(n);

    }

    public static void patternPrint(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print (j+" ");
            }

            System.out.println();
        }
    }
}
