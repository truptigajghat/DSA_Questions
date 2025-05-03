import java.util.*;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("its not prime");
        }else if(n == 2){
            System.out.println("prime");
        }else{
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
        sc.close();
    }
}
