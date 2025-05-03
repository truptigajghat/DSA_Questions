import java.util.Scanner;

public class Exercise27 {
    public static int sumDigit(int n) {
        int sum = 0;
        while (n>0) {
            int lastdig = n%10;
            sum += lastdig;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        System.out.println(sumDigit(n));
        sc.close();
    }
}
