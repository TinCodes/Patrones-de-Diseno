package Interpreter.example;

import java.util.ArrayList;

// our NonTerminalExpression:
public class Parser {

    private ArrayList<IAbstractExpression> parseTree =  new ArrayList<>();
    private Context context;

    public Parser(String s){
        context =  new Context(s.replace(" ", ""));
        for (String token : s.split(" ")){
            switch (token){
                case "I":
                    parseTree.add(new TerminalExpressionI());
                    break;

                case "V":
                    parseTree.add(new TerminalExpressionV());
                    break;

                case "X":
                    parseTree.add(new TerminalExpressionX());
                    break;

                default:
                    break;
            }
        }
    }

    public int evaluate(){
        for (IAbstractExpression e : parseTree){
            e.interpreter(context);
        }

        return context.output;
    }

}
