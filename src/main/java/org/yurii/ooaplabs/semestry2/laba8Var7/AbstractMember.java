package org.yurii.ooaplabs.semestry2.laba8Var7;

public abstract class AbstractMember implements Member {
    protected ProjectManager mediator;

    public AbstractMember(ProjectManager mediator) {
        this.mediator = mediator;
    }
}
