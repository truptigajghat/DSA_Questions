public class Exerciese43 {
    public static void main(String[] args) {
        int[] n = {55, 88, 77, 44};
        int key = 88;
        for(int i=0; i<n.length; i++){
            if(n[i] == key){
                System.out.println("found at " + i);
                break;
            }
        }
    }
}
