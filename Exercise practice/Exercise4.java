import java.util.*;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=n; i++ ){
            sum += i;
        }
        System.out.println("sum of first n naturat number is: " + sum);
        sc.close();
    }
}
