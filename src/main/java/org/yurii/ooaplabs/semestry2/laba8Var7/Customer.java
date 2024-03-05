package org.yurii.ooaplabs.semestry2.laba8Var7;

public class Customer extends AbstractMember {
    public Customer(ProjectManager mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("Замовник отримав повідомлення: " + message);
    }
}
