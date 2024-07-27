/*Q3 ---  Product of two numbers by taking input from user. */


import java.util.*;
public class Q3_basics_product_of_two_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your first number : ");
        int num1 =sc.nextInt();

        System.out.print("enter your second number : ");
        int num2 =sc.nextInt();

        int product = num1 * num2;

        System.out.println(product);

        sc.close();
        
    }
}
