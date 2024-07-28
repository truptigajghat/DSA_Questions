/* Q6 ---- Enter a cost of 3 items from user (using float data types)
  a pencile, a pen and an eraser 
  you have to output total cost of items back to user as bill.
  add 18% GST tax  
 */

 import java.util.*;
public class Q6_basics_total_of_items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter cost of Pencil : ");
        float Pencil = sc.nextFloat();

        System.out.print("enter cost of Pen : ");
        float Pen = sc.nextFloat();

        System.out.print("enter cost of Eraser : ");
        float Eraser = sc.nextFloat();

        float Total = (Pencil+Pen+Eraser); 

        System.out.println("Total bill is : " + Total );

        //total cost with 18% GST is 

        double newTotal = Total + (0.18 * Total);

        System.out.println("your total bill with 18% GST is : " + newTotal);
        sc.close();


    }
}
