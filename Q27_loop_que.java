/* Q27 ---  Write a java program that reads set of integer
            & then print sum of even odd integer */

import java.util.Scanner;

public class Q27_loop_que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, choice, evenSum, oddSum;
        evenSum = 0; oddSum = 0;

        do{
            System.out.println("enter your number");
            number = sc.nextInt();

            if(number%2==0) {
                evenSum = evenSum + number;
            }else{
                oddSum = oddSum + number;
            }
            System.out.println("do you want to continue ? press 0 for no & 1 for yes");

            choice = sc.nextInt();
        } while(choice == 1);

        System.out.println("even sum is " + evenSum);
        System.out.println("odd sum is " + oddSum);

        sc.close();
    }
}
