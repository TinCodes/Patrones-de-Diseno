package Interpreter;

import java.util.ArrayList;

// our NonTerminalExpression:
public class Parser {

    private ArrayList<IAbstractExpression> parseTree =  new ArrayList<>();
    private Context context;

    public Parser(String s){
        context =  new Context(s.replace(" ", ""));
        for (String token : s.split(" ")){
            switch (token.toLowerCase()){
                case "a":
                    parseTree.add(new TerminalExpressionA());
                    break;

                case "e":
                    parseTree.add(new TerminalExpressionE());
                    break;

                case "i":
                    parseTree.add(new TerminalExpressionI());
                    break;

                case "o":
                    parseTree.add(new TerminalExpressionO());
                    break;

                case "u":
                    parseTree.add(new TerminalExpressionU());
                    break;

                case "*":
                    parseTree.add(new TerminalExpressionAstk());
                    break;

                default:
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
