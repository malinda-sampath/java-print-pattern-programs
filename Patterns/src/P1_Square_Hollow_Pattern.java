public class P1_Square_Hollow_Pattern {
    public static void main(String[] args){
        int n = 5;
        printSquareHollow(n);
    }

    public static void printSquareHollow(int n) {
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if( i==0 || j==0 || i==n-1 || j==n-1 ){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
