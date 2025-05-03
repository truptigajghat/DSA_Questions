public class Exercise18 {
    public static void deletion(String[] arr) {
        int pos = 2;
        String[] newfritslist = new String[arr.length-1];
        for(int i=0; i<pos; i++){
            newfritslist[i] = arr[i];
        }
        for(int i=pos+1; i<arr.length; i++){
            newfritslist[i-1] = arr[i];
        }
        for(String list : newfritslist){
            System.out.println(list);
        }

    }
    public static void insertion(String[] arr) {
        int pos = 2;
        String newfruit = "papaya";
        String[] newfritslist = new String[arr.length+1];
        for(int i=0; i<pos; i++){
            newfritslist[i] = arr[i];
        }
        newfritslist[pos] = newfruit;

        for(int i=pos; i<arr.length; i++){
            newfritslist[i+1] = arr[i];
        }
        for(String list : newfritslist){
            System.out.println(list);
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "chokoo", "mango"};
        deletion(fruits);
    }
}
