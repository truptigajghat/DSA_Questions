/* Q24 ---  Write a java program to print reverse of given number by user */

import java.util.Scanner;

public class Q24_loop_que_reverse_of_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number : ");
        int number = sc.nextInt();

        while (number>0) {
            int lastDigit = number%10;
            System.out.print(lastDigit);
            number = number/10;
        }
        System.out.println();
        sc.close();
    }
}
