/* Q19 ---  Write a java program that takes a year fro user and 
            print whether year is leap year or not   
 */
 import java.util.*;
 public class Q19_conditional_statement_leap_year {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();

        boolean x = (year%4) == 0; //year shoul be divisible by 4
        boolean y = (year%100) != 0; //year should not be century year 
        boolean z = (year%100 == 0) &&  (year%400 == 0); // if year is century year then it should be devisible by 400 

        if(x &&  (y || z)){
            System.out.println("leap year");
        }else{
            System.out.println("not leap year");
        }
        sc.close();
    }
}
