package org.yurii.ooaplabs.semestry2.laba7Var1;

public interface TransactionHandler {
    void handle(Receiver receiver, double amount) throws TransactionException;
}

