/* Q28 ---  Write a java program to find the factorial of number given by user. 
*/

import java.util.Scanner;

public class Q28_loop_que_factorial_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("enter the number");
        int number = sc.nextInt();
        int factorial = 1;

        for(int i=1; i<=number; i++){
            factorial = factorial * i;
        }
        System.out.println("factorial of number is : " + factorial);

        sc.close();
    }
}
