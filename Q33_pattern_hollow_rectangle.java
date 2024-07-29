/* Q33 ---  Write a java program to print hollow rectangle pattern. 
*/

import java.util.*;
public class Q33_pattern_hollow_rectangle {
    public static void hollow_rectangle(int totRows, int totCols) {
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i==1 || i==totRows ||j==1||j==totCols){
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

        System.out.println("enter total number of rows");
        int totRows = sc.nextInt();

        System.out.println("enter total number of columns");
        int totCols = sc.nextInt();

        hollow_rectangle(totRows, totCols);

        sc.close();
    }
}
