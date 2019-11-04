package Interpreter.exercise;

import java.util.ArrayList;

public class Parser {

    private ArrayList<IAbstractExpression> parseTree =  new ArrayList<>();
    private Context context;

    public Parser(String s){
        context =  new Context(s.replace("\n", ":").replace(" ", ""));
        System.out.println(context.input);
        for (String token : s.split(":")){
            System.out.println("-" + token);
            switch (token){
                case "Como":
                   parseTree.add(new TerminalExpressionComo());
                   break;

                case "Quiero":
                   parseTree.add(new TerminalExpressionQuiero());
                   break;

                case "Para":
                   parseTree.add(new TerminalExpressionPara());
                   break;

               default:
                   parseTree.add(new TerminalExpressionAny());
                   break;
            }
        }
    }

    public String evaluate(){
        for (IAbstractExpression e : parseTree){
            e.interpreter(context);
        }

        return context.output;
    }

}
