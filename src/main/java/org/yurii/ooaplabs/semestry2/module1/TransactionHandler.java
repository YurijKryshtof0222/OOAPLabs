package org.yurii.ooaplabs.semestry2.module1;

public interface TransactionHandler {
    void handle(Receiver receiver, double amount) throws TransactionException;
}

