package Interpreter.exercise;

public class TerminalExpressionQuiero implements IAbstractExpression {

    @Override
    public void interpreter(Context context){
        if (context.input.startsWith("Quiero")){
            context.output = "When:";
            context.input = context.input.substring(6);
        }
    }

}
