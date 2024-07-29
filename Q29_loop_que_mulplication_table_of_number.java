/* Q29 ---  Write a java program to print multiplication table of  number given by user. 
*/

import java.util.Scanner;

public class Q29_loop_que_mulplication_table_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }
        sc.close();
    }
}
