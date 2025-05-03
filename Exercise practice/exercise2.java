import java.util.*;
public class exercise2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();
        double tax = 0;
        if(salary<=500000){
            tax = 0;
        }else if((salary>500000) && (salary< 1000000)){
            tax = 0.2 * salary;
        }else{
            tax = 0.3 * salary;
        }
        System.out.println("tax is : " + tax);
        sc.close();
    }
}
