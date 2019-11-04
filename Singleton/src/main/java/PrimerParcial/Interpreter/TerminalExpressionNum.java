package PrimerParcial.Interpreter;

public class TerminalExpressionNum implements IAbstractExpression {

    @Override
    public void interpreter(Context context) {
        context.output += Integer.parseInt(context.input.substring(0,1));
        context.input = context.input.substring(1);
        System.out.println("Input: " + context.input);
    }
}
