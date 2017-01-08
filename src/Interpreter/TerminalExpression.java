package Interpreter;

/**
 * Created by Данил on 08.01.2017.
 */
public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpet(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
