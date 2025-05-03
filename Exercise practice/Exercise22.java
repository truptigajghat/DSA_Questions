public class Exercise22 {
    public static void main(String[] args) {
        int binaryNum = 1000;
        int pow = 0;
        int decNum = 0;
        while(binaryNum>0){
            int lastDig = binaryNum%10;
            decNum =  (int) (decNum + lastDig * Math.pow(2, pow));
            pow++;
            binaryNum = binaryNum/10;
        }
        System.out.println(decNum);
    }
}
