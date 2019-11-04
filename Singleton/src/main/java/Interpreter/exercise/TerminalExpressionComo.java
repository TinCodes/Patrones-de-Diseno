package Interpreter.exercise;

public class TerminalExpressionComo implements IAbstractExpression {

    @Override
    public void interpreter(Context context){
        if (context.input.startsWith("Como")){
            context.output = "Given:";
            context.input = context.input.substring(4);
        }
    }
}
