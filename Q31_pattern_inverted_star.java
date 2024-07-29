/* Q31 ---  Write a java program to print inverted start pattern. 
*/

import java.util.*;
public class Q31_pattern_inverted_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    }
}
