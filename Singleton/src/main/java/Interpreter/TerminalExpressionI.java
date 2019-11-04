package Interpreter;

public class TerminalExpressionI implements IAbstractExpression {

    @Override
    public void interpreter(Context context){
        if (context.input.startsWith("i") || context.input.startsWith("I")){
            context.output = context.output + "3";
            context.input = context.input.substring(1);
        }
    }

}
