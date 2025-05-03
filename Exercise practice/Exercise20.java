import java.util.*;
public class Exercise20 {
    public static long factorial(int n) {
        long fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter r: ");
        int r = sc.nextInt();
        double bicoe = (double)  factorial(n)/(factorial(r)*factorial(n - r));
        System.out.println(bicoe);

        sc.close();
    }
}
