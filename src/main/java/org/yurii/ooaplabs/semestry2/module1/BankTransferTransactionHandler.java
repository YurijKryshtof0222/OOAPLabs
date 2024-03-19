package org.yurii.ooaplabs.semestry2.module1;

public class BankTransferTransactionHandler extends AbstractTransactionHandler {

    public BankTransferTransactionHandler() {
        super();
    }

    public BankTransferTransactionHandler(TransactionHandler next) {
        super(next);
    }

    @Override
    protected boolean canSend(Receiver receiver, double amount) {
        return receiver.getCountry().equals("UA") && amount >= 100;
    }

    @Override
    protected void doSend(Receiver receiver, double amount) {
        System.out.printf("Здійснюється банківський переказ на суму %.2f грн. одержувачу %s\n", amount, receiver.getName());
    }
}
