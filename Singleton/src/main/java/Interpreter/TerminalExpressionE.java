package Interpreter;

public class TerminalExpressionE implements IAbstractExpression {

    @Override
    public void interpreter(Context context){
        if (context.input.startsWith("e") || context.input.startsWith("E")){
            context.output = context.output + "2";
            context.input = context.input.substring(1);
        }
    }

}
