package Interpreter.exercise;

public class TerminalExpressionAny implements IAbstractExpression {

    @Override
    public void interpreter(Context context){
        if (context.input.startsWith(" ")){
            context.output = context.output + context.input.split(":");
        }
    }

}
