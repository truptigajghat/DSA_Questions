/* Q37 ---  Write a java program to print 0-1 triangle pattern. 
*/

import java.util.*;
public class Q37_pattern_0_1_triangle {
    public static void triangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        triangle(n);

        sc.close();
    }
}
