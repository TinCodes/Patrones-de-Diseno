package Interpreter.example;

import Interpreter.Parser;

public class Client {
    public static void main(String []args){
        String weirdLanguage = "I I I";
        System.out.println("Evaluating: " + weirdLanguage + "\nInterpretation: " + new Parser(weirdLanguage).evaluate());

    }
}
