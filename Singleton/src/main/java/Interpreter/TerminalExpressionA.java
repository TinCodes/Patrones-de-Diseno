package Interpreter;

public class TerminalExpressionA implements IAbstractExpression {

    @Override
    public void interpreter(Context context){
        if (context.input.startsWith("a") || context.input.startsWith("A")){
            context.output = context.output + "1";
            context.input = context.input.substring(1);
        }
    }

}
