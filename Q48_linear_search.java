/* Q48 ---  Write a java program find key in array using linear search. */

public class Q48_linear_search {
    public static int linearSearch(int array[], int key) {

        for(int i=0; i<array.length; i++){
            if (array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array [] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;

        int index = linearSearch(array, key);

        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index : " + index);
        } 
    }
}
