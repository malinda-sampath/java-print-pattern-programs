public class P18_Mirror_Image_Triangle_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint(n);

    }

    public static void patternPrint(int n){
        for (int i=1 ; i<=n ; i++){

            for( int j=1; j<i; j++){
                System.out.print(" ");
            }

            for( int j=i; j<=n ; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }

        for (int i=1 ; i<n ; i++){

            for( int j=1; j<n-i; j++){
                System.out.print(" ");
            }

            for( int j=n-i; j<=n ; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
