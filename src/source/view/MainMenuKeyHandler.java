package source.view;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static source.view.MainMenu.highlighter;
import static source.view.MainMenu.strColor;

public class MainMenuKeyHandler extends AbstractAction {

    private String name;
    private MainMenu mainMenu;

    public MainMenuKeyHandler(String name, MainMenu mainMenu){
        this.name = name;
        this.mainMenu = mainMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(name == "enter"){
            if(mainMenu.currentOption == 0) {
                mainMenu.guiManager.setLevelSelectionPanelVisible();
            }

            else if (mainMenu.currentOption == 1) {
                mainMenu.guiManager.setOptionsPanelVisible();
            }

            else if(mainMenu.currentOption == 2) {
                mainMenu.guiManager.setHighScoresPanelVisible();
            }

            else if(mainMenu.currentOption == 3) {
                System.exit(0);
            }

        }
        else if(name == "w") {
            mainMenu.currentOption--;

            if(mainMenu.currentOption == 0) {
                mainMenu.options.setForeground(strColor);
                mainMenu.play.setForeground(highlighter);
            }

            else if(mainMenu.currentOption == 1) {
                mainMenu.highscores.setForeground(strColor);
                mainMenu.options.setForeground(highlighter);
            }

            else if(mainMenu.currentOption == 2) {
                mainMenu.quit.setForeground(strColor);
                mainMenu.highscores.setForeground(highlighter);
            }

            else if(mainMenu.currentOption == 3){
                mainMenu.play.setForeground(strColor);
                mainMenu.quit.setForeground(highlighter);
            }

            //check bounds
            if(mainMenu.currentOption < 0) {
                mainMenu.currentOption = 3;
                mainMenu.play.setForeground(strColor);
                mainMenu.quit.setForeground(highlighter);
            }
        }

        else if(name == "s") {
            mainMenu.currentOption++;

            if(mainMenu.currentOption == 0) {
                mainMenu.quit.setForeground(strColor);
                mainMenu.play.setForeground(highlighter);
            }

            else if(mainMenu.currentOption == 1) {
                mainMenu.play.setForeground(strColor);
                mainMenu.options.setForeground(highlighter);
            }

            else if(mainMenu.currentOption == 2) {
                mainMenu.options.setForeground(strColor);
                mainMenu.highscores.setForeground(highlighter);
            }

            else if(mainMenu.currentOption == 3){
                mainMenu.highscores.setForeground(strColor);
                mainMenu.quit.setForeground(highlighter);
            }

            //check bounds
            if(mainMenu.currentOption > 3) {
                mainMenu.currentOption = 0;
                mainMenu.quit.setForeground(strColor);
                mainMenu.play.setForeground(highlighter);
            }
        }
    }
}
