/* Q34 ---  Write a java program to print inverted and rotated half pyramid pattern. 
*/

import java.util.*;
public class Q34_pattern_inverted_rotated_half_pyramid {
    public static void pyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        pyramid(n);

        sc.close();
    }
}
