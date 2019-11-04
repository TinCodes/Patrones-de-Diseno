package PrimerParcial.Interpreter;

public class TerminalExpressionNum2 implements IAbstractExpression {

    @Override
    public void interpreter(Context context) {
        context.output += Integer.parseInt(context.input.substring(0,2));
        context.input = context.input.substring(2);
        System.out.println("Input: " + context.input);
    }
}
