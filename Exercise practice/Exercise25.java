import java.util.Scanner;

public class Exercise25 {
    public static boolean isPalindrome(int n) {
       int original = n;
       int reverse = 0;
       while (n>0) {
        int lastDig = n%10;
        reverse = reverse * 10 + lastDig;
        n = n/10;
       } 
       return reverse == original; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }

}
