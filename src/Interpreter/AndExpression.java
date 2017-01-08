package Interpreter;

/**
 * Created by Данил on 08.01.2017.
 */
public class AndExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpet(String context) {
        return expr1.interpet(context) && expr2.interpet(context);
    }
}
