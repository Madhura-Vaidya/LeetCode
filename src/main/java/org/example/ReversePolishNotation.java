package org.example;

import java.util.Stack;

public class ReversePolishNotation {
    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static boolean isOperator(String token) {
        return "+-*/".contains(token);
    }

    private static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    static double evaluateRPN(String expression) {
        String[] numerals = expression.split(" ");
        Stack<Double> stack = new Stack<>();
        Double operand1, operand2;
        for (String numeral : numerals){
            if(isNumber(numeral)){
                stack.push(Double.parseDouble(numeral));
            }
            if(isOperator(numeral)){
              operand2 = stack.pop();
              operand1 = stack.pop();
              stack.push(performOperation(numeral, operand1, operand2));

            }
        }
        return stack.pop();
    }

    public static void main(String[] args){
        System.out.println("The operation is "+evaluateRPN("3 4 +"));
        System.out.println("The operation is "+evaluateRPN("3 4 + 2 *"));
        System.out.println("The operation is "+evaluateRPN("3 4 + 2 * 7 /"));
    }
}
