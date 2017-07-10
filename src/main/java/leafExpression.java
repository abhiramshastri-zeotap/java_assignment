import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by abhiram.shastri on 10/07/17.
 */

public class leafExpression extends Expression{
    private String left;
    private String right;
    private String op;

    public leafExpression(String left, String right, String op) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

    public String getOp() {
        return op;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getQuery() {
        return "(" + left + " " + op + " " + right + " )";
    }
}








