public class Exercise41 {
    public static void main(String[] args) {
        int[] books = {10, 20, 30, 40, 50};
        int curr    = 5;
        int index = 1;

        for(int i=index; i<curr-1; i++){
            books[i]=books[i+1];
        }
        curr--;

        for(int i=0; i<curr; i++){
            System.out.println(books[i]);
        }
    }
}
