import java.util.*;
public class Q26_loop_que_prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int number = sc.nextInt();

        if(number == 2){
            System.out.println("number is prime");
        }else{

            boolean isPrime = true;

            for(int i=2; i<=Math.sqrt(number); i++){

                if(i%2==0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("number  is prime");
            }else{
                System.out.println("not prime");
            }
        }
        sc.close();
    }
}
