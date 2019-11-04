package Interpreter.example;

public class TerminalExpressionI implements IAbstractExpression {
    @Override
    public void interpreter(Context context){
        if (context.input.startsWith("I")){
            if (context.input.substring(1).equals("I") && !(context.input.endsWith("I"))){
                context.output = context.output - 2;
                context.input = context.input.substring(1);
            } else if (context.input.substring(1).equals("V") || context.input.substring(1).equals("X")){
                context.output = context.output - 1;
                context.input = context.input.substring(1);
            } else {
                context.output = context.output + 1;
                context.input = context.input.substring(1);
            }
        }
    }
}
