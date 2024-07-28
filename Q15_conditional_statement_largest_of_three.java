/* Q15 --- print the largest of three numbers : */

import java.util.*;
public class Q15_conditional_statement_largest_of_three {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        System.out.println("enter your first number");
        int A = sc.nextInt();

        System.out.println("enter your second number");
        int B = sc.nextInt();

        System.out.println("enter your third number");
        int C = sc.nextInt();


        if(A>B && A>C){
            System.out.println("A is greater than B & C");
        }else if(B>C){
            System.out.println("B is greater than A & C");
        }else{
            System.out.println("C is greater than A & B");
        }

        sc.close();
    }
}
