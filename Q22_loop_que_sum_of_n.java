/* Q22 ---  Write a java program to print sum of first n natural numbers.
          take value of n from user
   */
  import java.util.*;
   public class Q22_loop_que_sum_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("sum of n natural number is : " + sum);

        sc.close();
    }
}
