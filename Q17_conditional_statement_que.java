/* Q17 ---  Write a java program to find user has fever or not 
  condition - user has fever if tempeature is above 100 
 */
import java.util.Scanner;

public class Q17_conditional_statement_que {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your temperature here : ");
        float tempeature = sc.nextFloat();

        if(tempeature>100){
            System.out.println("Yes! you have fever, take care");
        }else{
            System.out.println("Don't worry, you don't have fever");
        }
        sc.close();
    }
}
