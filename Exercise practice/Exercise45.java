//pairs in array 
public class Exercise45 {
    public static void printpairs(int[] arr) {
        int totalpairs = 0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs " + totalpairs);
    }
    public static void main(String[] args) {
        int[] arr = {2, 10, 20, 40, 80};
        printpairs(arr);
    }
}
