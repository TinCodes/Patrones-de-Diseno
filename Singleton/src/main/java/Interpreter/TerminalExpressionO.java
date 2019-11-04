package Interpreter;

public class TerminalExpressionO implements IAbstractExpression {

    @Override
    public void interpreter(Context context){
        if (context.input.startsWith("o") || context.input.startsWith("O")){
            context.output = context.output + "4";
            context.input = context.input.substring(1);
        }
    }

}
