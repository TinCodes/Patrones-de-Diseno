package Interpreter;

public class TerminalExpressionU implements IAbstractExpression {

    @Override
    public void interpreter(Context context){
        if (context.input.startsWith("u") || context.input.startsWith("U")){
            context.output = context.output + "5";
            context.input = context.input.substring(1);
        }
    }

}
