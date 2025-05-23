import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter The first Number:");
        int a = Integer.parseInt(scanner1.nextLine());

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter The second Number:");
        int b = Integer.parseInt(scanner2.nextLine());
        numSwap(a,b);
    }

    public static void numSwap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Fist Num: "+a);
        System.out.println("Second Num: "+b);
    }
}
