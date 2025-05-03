import java.util.ArrayList;

public class Exercise17 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("Banana");
        list.add("chicoo");
        list.add("chhole");
        System.out.println(list);
        list.remove("chicoo");

        String target = "apple";
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
                if(list.get(i).equals(target)){
                    System.out.println("found " + list.get(i));
                }
                
        }
        list.add(2, "cherry");
        System.out.println(list);
    }
}
