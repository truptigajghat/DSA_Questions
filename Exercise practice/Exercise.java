import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element number");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i<n; i++){
            System.out.println("enter num: ");
            int num = sc.nextInt();
            if(num%2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        sc.close();
    }
}
