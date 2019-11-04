package PrimerParcial.Interpreter;

public class Client {
    public static void main(String []args){
        String weirdLanguage = "2+10+8";
        System.out.println("Evaluating: " + weirdLanguage + "\nInterpretation: " + new Parser(weirdLanguage).evaluate());

    }
}
