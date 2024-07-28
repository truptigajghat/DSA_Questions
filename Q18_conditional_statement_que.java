/* Q18 ---  Write a java program to input week number 1 to 7 &
print day of week name using switch statemet  
 */

 import java.util.*;

public class Q18_conditional_statement_que {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number for day of week : ");

        int num = sc.nextInt();

        switch (num) {
            case 1: System.out.println("Monday");  
                break;

            case 2: System.out.println("Tuesday");  
                break;

            case 3: System.out.println("Wednesday");  
                break; 
                
            case 4: System.out.println("Thursday");  
                break;

            case 5: System.out.println("Friday");  
                break;

            case 6: System.out.println("Saturday");  
                break;

            case 7: System.out.println("Sunday");  
                break;

            default: System.out.println("invalid");
                break;

        }
        sc.close();

    }
}
