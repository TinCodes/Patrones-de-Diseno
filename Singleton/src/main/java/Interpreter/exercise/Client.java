package Interpreter.exercise;

public class Client {
    public static void main(String []args){
        String weirdLanguage = "Como: administrador cool\nQuiero: hacer todo lo que quiera\nPara: causar sufrimientos\n";
        System.out.println("Evaluating: " + weirdLanguage + "\n\nInterpretation: " + new Parser(weirdLanguage).evaluate());

    }
}
