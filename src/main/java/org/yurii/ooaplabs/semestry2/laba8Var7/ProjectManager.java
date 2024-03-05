package org.yurii.ooaplabs.semestry2.laba8Var7;

import java.util.ArrayList;
import java.util.List;

// Клас керуючого проектом
public class ProjectManager {
    private List<AbstractMember> teamMembers;

    public ProjectManager() {
        this.teamMembers = new ArrayList<>();
    }

    public void addTeamMember(AbstractMember teamMember) {
        teamMembers.add(teamMember);
    }

    public void send(AbstractMember sender, String message) {
        for (AbstractMember member : teamMembers) {
            if (member != sender) {
                member.receive(message);
            }
        }
    }
}