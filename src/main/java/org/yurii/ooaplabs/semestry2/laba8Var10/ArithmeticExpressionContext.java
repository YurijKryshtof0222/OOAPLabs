package org.yurii.ooaplabs.semestry2.laba8Var10;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Context
public class ArithmeticExpressionContext {
    private final String arithmeticExpression;
    private final Stack<Integer> stack = new Stack<>();

    public ArithmeticExpressionContext(String arithmethicExpression) {
        this.arithmeticExpression = arithmethicExpression;
    }

    public int evaluate() {
        String postfixExpression = infixToPostfix(arithmeticExpression);

        String[] tokens = postfixExpression.split(" ");

        for (String token : tokens) {
            switch (token) {
                case "+" -> new AddOperation().interpret(this);
                case "-" -> new SubtractOperation().interpret(this);
                case "*" -> new MultiplyOperation().interpret(this);
                case "/" -> new DivideOperation().interpret(this);
                default -> this.push(Integer.parseInt(token));
            }
        }

        return this.pop();
    }

    public Integer push(Integer integer) {
        return stack.push(integer);
    }

    public Integer pop() {
        return stack.pop();
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        //Додаю пробіл в кінець інфіксного виразу, щоб обробити останнє число або оператор
        infix += " ";

        // Регулярний вираз для виділення чисел
        Pattern numberPattern = Pattern.compile("\\d+");

        // Поточний індекс в інфіксному виразі
        int index = 0;

        while (index < infix.length()) {
            char c = infix.charAt(index);

            if (Character.isDigit(c)) {
                // Якщо це цифра, зчитую число повністю
                Matcher matcher = numberPattern.matcher(infix.substring(index));
                if (matcher.find()) {
                    String number = matcher.group();
                    postfix.append(number).append(" ");
                    // Пересуваю індекс на наступне місце після числа
                    index += number.length();
                }
            } else if (c == '+' || c == '-') {
                while (!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(c);
                index++;
            } else if (c == '*' || c == '/') {
                stack.push(c);
                index++;
            } else if (c == '(') {
                stack.push(c);
                index++;
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.pop(); // Видаляю відкриваючу дужку зі стеку
                index++;
            } else if (Character.isWhitespace(c)) {
                // Ігнорую пробіли
                index++;
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

}