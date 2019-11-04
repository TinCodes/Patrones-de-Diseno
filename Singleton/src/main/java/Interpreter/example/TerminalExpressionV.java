package Interpreter.example;

public class TerminalExpressionV implements IAbstractExpression{

    @Override
    public void interpreter(Context context){
        if (context.input.startsWith("V")){
            if (context.input.substring(1).equals("I")){
                context.output = context.output + 5;
                context.input = context.input.substring(1);
            } else if (context.input.substring(1).equals("X")){
                context.output = context.output - 5;
                context.input = context.input.substring(1);
            }

        }
    }
}
