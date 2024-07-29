/* Q36 ---  Write a java program to print floyds triangle pattern. 
*/

import java.util.*;
public class Q36_pattern_floyds_triangle {
    public static void triangle(int n){
        int counter = 1;
        for(int i=0; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();

        triangle(n);

        sc.close();
    }
}
