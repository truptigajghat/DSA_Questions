/* Q50 --- Write a java program find key in array using binary search.. */

public class Q50_binary_search {
    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(number[mid] == key){
                return mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 18;
        int index = binarySearch(number, key);
        if(index == -1){
            System.out.println("key not found");
        }else{
            System.out.println("your key is at index : " + index);
        }
    }
}
