/* Q39 ---  Write a java program to print solid rhombus pattern. 
*/

import java.util.*;
public class Q39_pattern_solid_rhombus {
    public static void rhombus(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
           }
           for(int j=1;j<=n; j++){
            System.out.print("*");
           }
           System.out.println();
        }       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();

        rhombus(n);
        sc.close();
    }
}
