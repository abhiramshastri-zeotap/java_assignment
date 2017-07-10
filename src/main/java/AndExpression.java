
/**
 * Created by abhiram.shastri on 10/07/17.
 */
public class AndExpression extends Expression{

    private Expression left;
    private Expression right;

    public AndExpression(Expression left, Expression right){
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
        return "( " + this.left.getQuery() + " and " + this.right.getQuery() + " )";
    }
}
