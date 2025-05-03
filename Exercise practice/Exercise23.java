public class Exercise23 {
    public static void main(String[] args) {
        int decNum = 8;
        int binNum = 0;
        int pow = 0;
        while(decNum>0){
            int lastdig = decNum%2;
            binNum = (int) (binNum + (lastdig * Math.pow(10, pow)));
            pow++;
            decNum = decNum/2;
        }
        System.out.println(binNum);
    }
}
