/*Q5 ---  Average of three numbers A, B, C by taking input from user. */

import java.util.*;

public class Q5_basics_average_of_three_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of A : ");
        int A = sc.nextInt();
        System.out.print("enter value of B : ");
        int B = sc.nextInt();
        System.out.print("enter value of C : ");
        int C = sc.nextInt();

        double Average = (A+B+C)/3;

        System.out.println("Average of A, B, C is : " + Average);

        sc.close();
    }
}
