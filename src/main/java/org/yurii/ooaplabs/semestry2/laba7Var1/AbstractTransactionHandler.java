package org.yurii.ooaplabs.semestry2.laba7Var1;

public abstract class AbstractTransactionHandler implements TransactionHandler {
    private TransactionHandler next;

    public AbstractTransactionHandler() {}

    public AbstractTransactionHandler(TransactionHandler next) {
        this.next = next;
    }

    @Override
    public void handle(Receiver receiver, double amount) throws TransactionException{
        if (canSend(receiver, amount)) {
            doSend(receiver, amount);
        } else if (next != null) {
            next.handle(receiver, amount);
        } else {
            throw new TransactionException("Неможливо здійснити переказ");
        }
    }

    public void setNext(TransactionHandler next) {
        this.next = next;
    }

    protected abstract boolean canSend(Receiver receiver, double amount);
    protected abstract void doSend(Receiver receiver, double amount);
}
