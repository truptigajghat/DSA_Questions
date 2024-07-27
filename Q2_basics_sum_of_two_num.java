/*Q2 ---  Sum of two numbers by taking input from user. */

import java.util.*;  //package for using inbuilt methods eg. scanner.
public class Q2_basics_sum_of_two_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //class to take input from user
        System.out.println("Enter your first number");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number"); 
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is : " + sum);
        sc.close();
    }
}
