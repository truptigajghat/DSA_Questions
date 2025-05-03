import java.util.*;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE; 
        while (true) {
            System.out.println("enter n: ");
            int n = sc.nextInt();

            if(n%10 == 0){
                System.out.println("you enter multiple of 10");
                break;
            }
            System.out.println("you enter : " + n);
            count++;
            sum += n;
            if(n>max){
                max = n;
            }
            if(n<min){
                min = n;
            }
        }
        if(count>0){
            double avg = (double) sum / count;
            System.out.println("average is : " + avg);
            System.out.println("min num is : " + min);
            System.out.println("max num is : " + max);
            System.out.println("total numbers entered : " + count);
            System.out.println("sum of the numbers : " + sum);
        }else{
            System.out.println("no valid number entered");
        }
        sc.close();
    }
}
