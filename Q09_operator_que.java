/* Q9 --- what will be the output of following : */
public class Q9_operator_que {
    public static void main(String[] args) {
        int x, y, z ;
        x=y=z=2;
        x+=y;
        y-=z;
        z/=(x+y);

        System.out.println(x + " " + y+ " " + z);

    }
}
