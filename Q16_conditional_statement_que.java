/* Q16 ---  Write a java program to get a number from user and
 print whether it is positive or negative  */

 
import java.util.*;
public class Q16_conditional_statement_que {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number>0){
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }

        sc.close();
    }
}
