/**
 * Created by abhiram.shastri on 10/07/17.
 */
public class OrExpression extends Expression{

    private Expression left;
    private Expression right;

    public OrExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String getQuery(){
        return "( " + this.left.getQuery() + " or " + this.right.getQuery() + " )";
    }

}