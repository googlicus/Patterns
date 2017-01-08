package Interpreter;

/**
 * Created by Данил on 08.01.2017.
 */
//Interpreter pattern provides a way to evaluate language grammar or expression.
// This type of pattern comes under behavioral pattern.
// This pattern involves implementing an expression interface which tells to interpret a particular context.
// This pattern is used in SQL parsing, symbol processing engine etc.
public class InterpreterDemo {
    private static Expression getMaleExpression(){
        Expression bob = new TerminalExpression("bob");
        Expression john = new TerminalExpression("john");
        return new OrExpression(bob, john);
    }

    private static Expression getJuliMarried(){
        Expression julie = new TerminalExpression("julie");
        Expression married = new TerminalExpression("married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args){
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getJuliMarried();

        System.out.println("John is male:" + isMale.interpet("john"));
        System.out.println("Julie is married:" + isMarriedWoman.interpet("married julie"));
    }
}
