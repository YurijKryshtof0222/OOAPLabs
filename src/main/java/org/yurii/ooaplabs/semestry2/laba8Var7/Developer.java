package org.yurii.ooaplabs.semestry2.laba8Var7;

public class Developer extends AbstractMember {
    public Developer(ProjectManager mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("Програміст отримав повідомлення: " + message);
    }
}
