/* Q32 ---  Write a java program to print charecter  pattern. 
*/
import java.util.*;
public class Q32_pattern_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n :");
        int n = sc.nextInt();

        char ch = 'A';

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
