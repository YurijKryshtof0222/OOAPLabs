package org.yurii.ooaplabs.semestry2.laba8Var10;

public class AddOperation implements Operation {
    @Override
    public void interpret(ArithmeticExpressionContext context) {
        context.push(context.pop() + context.pop());
    }
}
