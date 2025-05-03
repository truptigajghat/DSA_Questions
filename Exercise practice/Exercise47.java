//subarrays in array
public class Exercise47 {
    public static void subarray(int[] arr) {
        int ts = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays : " + ts);
    }
    public static void maxsum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum =0;
                for(int k=i; k<=j; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        maxsum(arr);
    }
}
