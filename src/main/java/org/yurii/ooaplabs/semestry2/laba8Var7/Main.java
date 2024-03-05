package org.yurii.ooaplabs.semestry2.laba8Var7;

public class Main {
    public static void main(String[] args) {
        ProjectManager manager = new ProjectManager();

        Customer customer = new Customer(manager);
        Developer developer = new Developer(manager);
        QAEngineer QAEngineer = new QAEngineer(manager);

        manager.addTeamMember(customer);
        manager.addTeamMember(developer);
        manager.addTeamMember(QAEngineer);


        customer.send("Ми потребуємо новий функціонал!");
        System.out.println();
        developer.send("Я зайнятий розробкою нового функціоналу.");
        System.out.println();
        QAEngineer.send("Проводжу тестування нового функціоналу.");
    }
}
