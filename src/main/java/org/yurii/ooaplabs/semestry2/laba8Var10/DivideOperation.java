package org.yurii.ooaplabs.semestry2.laba8Var10;

public class DivideOperation implements Operation {
    @Override
    public void interpret(ArithmeticExpressionContext context) {
        int divisor = context.pop();
        int dividend = context.pop();
        context.push(dividend / divisor);
    }
}
