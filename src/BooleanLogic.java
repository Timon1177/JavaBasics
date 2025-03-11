public class BooleanLogic {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;

        System.out.println(x);
        System.out.println(!x);

        System.out.println(y);
        System.out.println(!y);

        System.out.println(x && y); // Bei dem and Operator müssen beide Wahr sein.
        System.out.println(x || y); // Bei dem or Operator musse nur einer Wahr sein.


    }
}
