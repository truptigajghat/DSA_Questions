/* Q21 ---  Write a java program to print numbers from 1 to n
          take value of n from user
   */

import java.util.*;

public class Q21_loop_que_print_1ton {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }

        sc.close();
    }
}
