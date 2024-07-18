package org.scoula.command;

import org.scoula.ui.Input;
import org.scoula.domain.StudentScores;

public class InitScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int studentNum = Input.getInt("학생수> ");
        studentScores.setStudentNum(studentNum);
    }
}
