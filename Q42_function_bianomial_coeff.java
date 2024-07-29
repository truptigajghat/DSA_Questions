/* Q42 ---  Write a java program to find bianomial coefficient. */
        /* formula for bianomial coefficient is -
              n! / (r!* (n-r)!)
        */ 
        
import java.util.*;
public class Q42_function_bianomial_coeff {

    public static int factorial(int n) {

        int factorial = 1;

        for(int i=1; i<=n; i++){
            factorial = factorial*i;
        }
       
        return factorial;
    }
    public static int binCoeff(int n, int r) {

     int fact_n = factorial(n);
     int fact_r = factorial(r);
     int fact_n_min_r = factorial(n-r);

     int binomial = fact_n / (fact_r * fact_n_min_r);
     return binomial;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the n : ");
        int n = sc.nextInt();

        System.out.println("enter the value of r");
        int r = sc.nextInt();
        System.out.println(binCoeff(n, r));;
        sc.close();
    }
}
