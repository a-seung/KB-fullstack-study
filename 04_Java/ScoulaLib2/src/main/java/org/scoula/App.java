package org.scoula;

import org.command.*;
import org.ui.MenuItem;

// 각 기능을 메서드화
public abstract class App {
    Menu menu;

    public App() {
    }

    public void init() {
        menu = new Menu();
        createMenu(menu);
        menu.add(new MenuItem("종료", new ExitCommand()));
    }

    public void createMenu(Menu menu) {//자식이 커스터마이징
    }

    public void run() {
        init();
        while (true) {
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
    }
}