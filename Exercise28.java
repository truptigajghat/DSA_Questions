import java.util.Scanner;

public class Exercise28 {
    public static boolean isArmNum(int n) {
        int original = n;
        int sum = 0;
        while (n>0) {
            int lastDig = n%10;
            sum += lastDig * lastDig * lastDig;
            n = n/10;
        }
        return original == sum;
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter num: ");
        int n = sc.nextInt();
        System.out.println(isArmNum(n));
        sc.close();
    }
}
