/*Q4 ---  Find the area of circle by taking input from user.
 * 
 * hint -- formula of area of circle is -- (3.14 * radius * radius)
 * 
 * take radius from user
 */

import java.util.*;
public class Q4_basics_area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the radius of circle");
        float radius = sc.nextFloat();
        Double area = (3.14 * radius * radius);

        System.out.println("Area of circle is : " + area);

        sc.close();
    }
}
