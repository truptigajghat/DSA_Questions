import java.util.Scanner;

public class Exercise40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter your 5 sub marks");
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<marks.length; i++){
            System.out.println( i + " " + marks[i] );
        }
        sc.close();
    }
}
