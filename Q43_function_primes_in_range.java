/* Q43 ---  Write a java program to find prime number in range. */

import java.util.*;

public class Q43_function_primes_in_range {

    public static boolean isPrime(int number) {
        if(number == 2){
            return true;
        }else{
            for(int i=2; i<=Math.sqrt(number); i++){
                if(number%2==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void primesInRange(int number) {
        for(int i=2; i<=number; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number you want to check : ");
        int number = sc.nextInt();
        primesInRange(number);

        sc.close();


    }
}
