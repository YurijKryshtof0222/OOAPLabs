package org.yurii.ooaplabs.semestry2.laba8Var10;

public class SubtractOperation implements Operation {
    @Override
    public void interpret(ArithmeticExpressionContext context) {
        int subtrahend = context.pop();
        int minuend = context.pop();
        context.push(minuend - subtrahend);
    }
}
