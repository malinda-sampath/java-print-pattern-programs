public class P6_Zero_One_Triangle_Pattern {

    public static void main(String[] args){
        int n=6;
        patternPrint1(n);
        patternPrint2(n);
    }

    public static void patternPrint1(int n){
        int num = 1;
        for ( int i=1; i<=n ; i++){
            for ( int j=1; j<=i ; j++){
                num++;
                if(num % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void patternPrint2(int n){
        for ( int i=1; i<=n ; i++){
            for ( int j=1; j<=i ; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
