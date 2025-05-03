public class Exeecise19 {
    public static void main(String[] args) {
        String name = "trupti";
        String newReve = "";
        for(int i=name.length()-1; i>=0; i--){
            newReve += name.charAt(i);
        }
        System.out.println(newReve);
    }
}
