/* Q40 ---  Write a java program to print hollow rhombus pattern. 
*/

import java.util.*;
public class Q40_pattern_hollow_rhombus {
    public static void rhombus(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter thev value of n");
        int n = sc.nextInt();

        rhombus(n);

        sc.close();

    }
}
