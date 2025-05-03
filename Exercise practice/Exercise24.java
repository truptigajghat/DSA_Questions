import java.util.Scanner;

public class Exercise24 {
    public static boolean isEven(int n) {
       return n%2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
        sc.close();
    }
}
