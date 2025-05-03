//binary search code 
public class Exercise46 {
    public static int binarySearch(int[] arr, int key) {
        int start = 0; 
        int end = arr.length-1;
        while (start<=end) {
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 40;
        System.out.println(binarySearch(arr, key));
    }
}
