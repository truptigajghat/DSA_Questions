/*reverse an array*/
public class Exercise44 {
    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 4, 2};
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; 
            j--;
        }
        
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]);
        }
    }
}
