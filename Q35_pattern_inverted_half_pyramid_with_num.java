/* Q35 ---  Write a java program to print inverted half pyramid with number pattern. 
*/

import java.util.*;
public class Q35_pattern_inverted_half_pyramid_with_num {
    public static void pyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
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
