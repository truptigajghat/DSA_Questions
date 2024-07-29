/* Q47 ---  Write a java program find sum of digits in an integer. */
import java.util.*;
public class Q47_sum_of_digit_in_integer {
    public static int sumOfDigit(int number){
        int sum = 0;

        while (number>0) {

            int lastDigit = number%10;
            sum += lastDigit;
            number = number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int number = sc.nextInt();

        System.out.println(sumOfDigit(number));
        sc.close();

    }
}
