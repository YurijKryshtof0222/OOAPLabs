package org.yurii.ooaplabs.semestry2.laba7Var1;

public class WesternUnionTransactionHandler extends AbstractTransactionHandler {
    public WesternUnionTransactionHandler() {
        super();
    }

    public WesternUnionTransactionHandler(TransactionHandler next) {
        super(next);
    }

    @Override
    protected boolean canSend(Receiver receiver, double amount) {
        return true;
    }

    @Override
    protected void doSend(Receiver receiver, double amount) {
        System.out.printf("Здійснюється переказ через WesternUnion на суму %.2f грн. одержувачу %s\n", amount, receiver.getName());
    }
}
