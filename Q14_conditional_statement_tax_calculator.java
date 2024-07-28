/* Q14 --- print the number is even or odd : */

import java.util.*;
public class Q14_conditional_statement_tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your salary : ");
        int salary = sc.nextInt();

        double tax ;
        if(salary < 500000){
            tax = 0;
            System.out.println("your tax is : " + tax);
        }else if (salary>500000 && salary<1000000) {
            tax = salary * 0.2;
            System.out.println("your tax is : "+ tax);
        }else{
            tax = salary * 0.3;
            System.out.println("your salary is : " + tax);
        }
        sc.close();
    }
}
