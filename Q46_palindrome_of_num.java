/* Q46 ---  Write a java program to check if number is palindrome or not. */

import java.util.*;
public class Q46_palindrome_of_num {
    public static void palindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while(palindrome>0){
            int lastDigit = palindrome%10;

            reverse = (reverse*10) + lastDigit ;

            palindrome = palindrome/10;
            
        }
        if(number==reverse){
            System.out.println("number is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        palindrome(number);

        sc.close();
    }
}
