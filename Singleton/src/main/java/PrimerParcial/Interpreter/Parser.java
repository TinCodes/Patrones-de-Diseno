package PrimerParcial.Interpreter;

import java.util.ArrayList;

public class Parser {

    private ArrayList<IAbstractExpression> parseTree =  new ArrayList<>();
    private Context context;

    public Parser(String s){
        context =  new Context(s.replace("+"," ").replace(" ",""));
        for (String token : s.split(" ")){
            if (token.length() > 1)
                parseTree.add(new TerminalExpressionNum());
            else
                parseTree.add(new TerminalExpressionNum2());
        }
    }

    public int evaluate(){
        for (IAbstractExpression e : parseTree){
            e.interpreter(context);
        }

        return context.output;
    }

}
