package org.yurii.ooaplabs.semestry2.module1;

public class Main {
    public static void main(String[] args) {
        TransactionHandler transactionHandler = new BankTransferTransactionHandler(
                new WesternUnionTransactionHandler(
                        new PayPalTransactionHandler()
                )
        );

        Receiver receiver = new Receiver("Іван Петренко", "UA", true);

        try {
            transactionHandler.handle(receiver, 500.50);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
