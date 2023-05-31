public class LogicalOperators2 {
    public static void main(String[] args) {

        boolean value = true || true && false;

        System.out.println(value);
                            //true || false
        boolean value1 = true || (true && false);
                            // true && false
        boolean value2 = (true || true) && false;

        System.out.println(value1);
        System.out.println(value2);
    }
}
