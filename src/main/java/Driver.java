/**
 * Created by abhiram.shastri on 10/07/17.
 */
public class Driver {

    public static void main(String[] args) {
        Expression e1 = new leafExpression("age", "18", ">");
        Expression e2 = new leafExpression("age", "18", "<");
        Expression e3 = new leafExpression("city", "Bangalore", "==");

        Expression e4 = new OrExpression(e1,e2);
        Expression e5 = new AndExpression(e4,e3);

        System.out.println(e5.getQuery());

    }
}
