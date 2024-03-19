package org.yurii.ooaplabs.semestry2.module1;

public class PayPalTransactionHandler extends AbstractTransactionHandler {

    public PayPalTransactionHandler() {
        super();
    }

    public PayPalTransactionHandler(TransactionHandler next) {
        super(next);
    }

    @Override
    protected boolean canSend(Receiver receiver, double amount) {
        return receiver.hasPayPalAccount();
    }

    @Override
    protected void doSend(Receiver receiver, double amount) {
        System.out.printf("Здійснюється переказ через PayPal на суму %.2f грн. одержувачу %s\n", amount, receiver.getName());
    }
}
