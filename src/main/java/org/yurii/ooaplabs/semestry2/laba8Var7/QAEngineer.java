package org.yurii.ooaplabs.semestry2.laba8Var7;

class QAEngineer extends AbstractMember {
    public QAEngineer(ProjectManager mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("Тестувальник отримав повідомлення: " + message);
    }
}
