package Interpreter.exercise;

public class TerminalExpressionPara implements IAbstractExpression {

    @Override
    public void interpreter(Context context){
        if (context.input.startsWith("Para")){
            context.output = "Then";
            context.input = context.input.substring(4);
        }
    }

}
