package org.scoula.lib.cli.ui;

public class Menu {

    public void printMenu(){
        System.out.println("--------------------------------------------------");
        for(int i = 0; i<menus.size(); i++){
            System.out.println("%d%s");
        }
    }
}
