/* Q49 ---  Write a java program find largest and smallest value in given array. */

public class Q49_largest_and_smallest_in_array {
    public static int findLargest(int number[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    public static int findSmallest(int number[]) {
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++){
            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int number [] = {2,4,6,8,10,12,14,16,18,20};

        System.out.println("largest of array is : " + findLargest(number));
        System.out.println("smallest of array is : " + findSmallest(number));
    }
}
