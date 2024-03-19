package org.yurii.ooaplabs.semestry2.laba8Var10;

import java.util.Scanner;

// Клас клієнта
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String infixExpression;

        System.out.println("Введіть простий математичний вираз у звичайному записі: ");

        infixExpression = scanner.nextLine();
        ArithmeticExpressionContext context = new ArithmeticExpressionContext(infixExpression);
        String postfixExpression = ArithmeticExpressionContext.infixToPostfix(infixExpression);
        int result = context.evaluate();

        System.out.println("Постфіксний запис виразу: " + postfixExpression);
        System.out.println("Результат: " + result);
    }

}