package Interpreter;

public class Client {
    public static void main(String []args){
        String weirdLanguage = "A A a e E I i o U *";
        System.out.println("Evaluating: " + weirdLanguage + "\nInterpretation: " + new Parser(weirdLanguage).evaluate());

    }
}
