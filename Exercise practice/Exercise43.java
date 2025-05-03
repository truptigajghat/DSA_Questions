public class Exercise43 {
    public static int maxNum(int[] n) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n.length; i++){
            if(max<n[i]){
                max = n[i];
            }
        }
        return max;
    }
    public static int minNum(int[] n) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n.length; i++){
            if(min>n[i]){
                min=n[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] n= {10, 50, 7, 8, 100, 0, 5};
        System.out.println(maxNum(n));
        System.out.println(minNum(n));
    }
}
