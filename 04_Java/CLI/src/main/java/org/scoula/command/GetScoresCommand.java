package org.scoula.command;

import org.scoula.ui.Input;
import org.scoula.domain.StudentScores;

public class GetScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();
    @Override
    public void execute() {
        int [] scores = studentScores.getScores();
        for(int i = 0; i< scores.length; i++) {
            scores[i] = Input.getInt("scores[" + i + "]> ");
        }
    }
}
