public class P5_Number_Changing_Pyramid_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint(n);
    }

    public static void patternPrint(int n){
        int num = 1;
        for ( int i=1; i<=n ; i++){
            for ( int j=1; j<=i ; j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
