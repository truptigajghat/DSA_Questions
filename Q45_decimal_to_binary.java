/* Q45 ---  Write a java program to convert decimal to binary. */

import java.util.*;
public class Q45_decimal_to_binary {
    public static void decTobin(int decimal) {
        int myNum = decimal;
        int binary = 0;
        int pow = 0;
        while (decimal>0) {

            int lastDigit = decimal%2;

            binary += lastDigit * (int) Math.pow(10, pow);

            pow++;

            decimal = decimal/2;
            
        }
        System.out.println("binary of " + myNum + " is " + binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter decimal number : ");
        int decimal = sc.nextInt();

        decTobin(decimal);

        sc.close();
    }
}
