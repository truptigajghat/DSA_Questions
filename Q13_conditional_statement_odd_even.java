/* Q13 --- print the number is even or odd : */

import java.util.*;

public class Q13_conditional_statement_odd_even {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.err.println("enter the number :");
            int num = sc.nextInt();

            if(num % 2 == 0){
                System.out.println("num is even");
            }else{
                System.out.println("num is odd");
            }
            sc.close();
    }
}
