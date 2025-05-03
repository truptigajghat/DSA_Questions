import java.util.*;
public class Exercise42 {
    public static int hotelMenu(String menu[], String order){
        for(int i=0; i<menu.length; i++){
            if(menu[i].equals(order)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"samosa", "paratha", "chai", "creamroll"};
        System.out.println("Give your order");
        String order = sc.nextLine();
        int index = hotelMenu(menu, order);
        if(index == -1){
             System.out.println("Not availabe");
        }else{
            System.out.println("Available at counter no. " + index);
        }
        sc.close();
    }
}
