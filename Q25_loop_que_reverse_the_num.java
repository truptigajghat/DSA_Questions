/* Q25 ---  Write a java program to  reverse of given number by user */

import java.util.Scanner;

public class Q25_loop_que_reverse_the_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int number = sc.nextInt();

        int reverse = 0;

        while (number>0) {
            int lastDigit = number%10;
            reverse = (reverse*10)+lastDigit;
            number = number/10;
        }
        System.out.println(reverse);

        sc.close();
    }
}
