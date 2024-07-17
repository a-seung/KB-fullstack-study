package org.scoula;

import org.scoula.lib.cli.command.AnalizeCommand;
import org.scoula.lib.cli.command.GetScoresCommand;
import org.scoula.lib.cli.command.InitScoresCommand;
import org.scoula.lib.cli.command.PrintScoreCommand;

import java.awt.*;

public class MyApp extends App {
    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);
        menu.add(new MenuItem("학생수", new InitScoresCommand()));
        menu.add(new MenuItem("점수입력", new GetScoresCommand()));
        menu.add(new MenuItem("점수리스트", new PrintScoreCommand()));
        menu.add(new MenuItem("분석", new AnalizeCommand()));
    }

    public static void main(final String[] args) {
        App app = new MyApp();
        app.run();
    }
}
