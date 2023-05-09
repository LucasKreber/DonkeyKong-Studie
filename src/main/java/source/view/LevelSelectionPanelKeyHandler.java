package source.view;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LevelSelectionPanelKeyHandler extends AbstractAction {
    private String name;
    private LevelSelectionPanel levelSelectionPanel;

    public LevelSelectionPanelKeyHandler(String name, LevelSelectionPanel levelSelectionPanel){
        this.name = name;
        this.levelSelectionPanel = levelSelectionPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(name == "enter"){
            if(levelSelectionPanel.currentOption == 1) {
                levelSelectionPanel.level = 1;
                levelSelectionPanel.guiManager.setGamePanelVisible(levelSelectionPanel.level);
            }
            else if(levelSelectionPanel.currentOption == 2) {
                levelSelectionPanel.level = 2;
                levelSelectionPanel.guiManager.setGamePanelVisible(levelSelectionPanel.level);
            }
            else if(levelSelectionPanel.currentOption == 3) {
                levelSelectionPanel.level = 3;
                levelSelectionPanel.guiManager.setGamePanelVisible(levelSelectionPanel.level);
            }
            else if(levelSelectionPanel.currentOption == levelSelectionPanel.RETURN_LABEL) {
                levelSelectionPanel.guiManager.setMainMenuPanelVisible();
            }
        }

        else if(name == "w") {
            if(levelSelectionPanel.currentOption <= levelSelectionPanel.unlock || levelSelectionPanel.unlock == levelSelectionPanel.MAX_LEVEL_NUMBER){
                levelSelectionPanel.currentOption--;
            }
            else{
                levelSelectionPanel.currentOption = levelSelectionPanel.unlock;
            }

            if(levelSelectionPanel.currentOption == 1) {
                levelSelectionPanel.level2.setForeground(MainMenu.strColor);
                levelSelectionPanel.l2img.setBorder(levelSelectionPanel.whiteBorder);
                levelSelectionPanel.level1.setForeground(MainMenu.highlighter);
                levelSelectionPanel.l1img.setBorder(levelSelectionPanel.orangeBorder);
                levelSelectionPanel.returnLabel.setForeground(MainMenu.strColor);
            }

            else if(levelSelectionPanel.currentOption == 2) {
                levelSelectionPanel.level3.setForeground(MainMenu.strColor);
                levelSelectionPanel.l3img.setBorder(levelSelectionPanel.whiteBorder);
                levelSelectionPanel.level2.setForeground(MainMenu.highlighter);
                levelSelectionPanel.l2img.setBorder(levelSelectionPanel.orangeBorder);
                levelSelectionPanel.returnLabel.setForeground(MainMenu.strColor);
            }

            else if(levelSelectionPanel.currentOption == 3) {
                levelSelectionPanel.returnLabel.setForeground(MainMenu.strColor);
                levelSelectionPanel.level3.setForeground(MainMenu.highlighter);
                levelSelectionPanel.l3img.setBorder(levelSelectionPanel.orangeBorder);
            }

            else if(levelSelectionPanel.currentOption == levelSelectionPanel.RETURN_LABEL){
                levelSelectionPanel.level1.setForeground(MainMenu.strColor);
                levelSelectionPanel.l1img.setBorder(levelSelectionPanel.whiteBorder);
                levelSelectionPanel.returnLabel.setForeground(MainMenu.highlighter);
            }

            //check bounds
            if(levelSelectionPanel.currentOption < 1) {
                levelSelectionPanel.currentOption = levelSelectionPanel.RETURN_LABEL;
                levelSelectionPanel.level1.setForeground(MainMenu.strColor);
                levelSelectionPanel.l1img.setBorder(levelSelectionPanel.whiteBorder);
                levelSelectionPanel.returnLabel.setForeground(MainMenu.highlighter);
            }
        }

        else if(name == "s") {
            if(levelSelectionPanel.currentOption < levelSelectionPanel.unlock || levelSelectionPanel.currentOption == levelSelectionPanel.RETURN_LABEL || levelSelectionPanel.unlock == levelSelectionPanel.MAX_LEVEL_NUMBER){
                levelSelectionPanel.currentOption++;
            }
            else{
                levelSelectionPanel.currentOption = levelSelectionPanel.RETURN_LABEL;
            }

            if(levelSelectionPanel.currentOption == 1) {
                levelSelectionPanel.returnLabel.setForeground(MainMenu.strColor);
                levelSelectionPanel.level1.setForeground(MainMenu.highlighter);
                levelSelectionPanel.l1img.setBorder(levelSelectionPanel.orangeBorder);
            }

            else if(levelSelectionPanel.currentOption == 2) {
                levelSelectionPanel.level1.setForeground(MainMenu.strColor);
                levelSelectionPanel.l1img.setBorder(levelSelectionPanel.whiteBorder);
                levelSelectionPanel.level2.setForeground(MainMenu.highlighter);
                levelSelectionPanel.l2img.setBorder(levelSelectionPanel.orangeBorder);
            }

            else if(levelSelectionPanel.currentOption == 3) {
                levelSelectionPanel.level2.setForeground(MainMenu.strColor);
                levelSelectionPanel.l2img.setBorder(levelSelectionPanel.whiteBorder);
                levelSelectionPanel.level3.setForeground(MainMenu.highlighter);
                levelSelectionPanel.l3img.setBorder(levelSelectionPanel.orangeBorder);
            }

            else if(levelSelectionPanel.currentOption == levelSelectionPanel.RETURN_LABEL){
                levelSelectionPanel.level1.setForeground(MainMenu.strColor);
                levelSelectionPanel.l1img.setBorder(levelSelectionPanel.whiteBorder);
                levelSelectionPanel.level2.setForeground(MainMenu.strColor);
                levelSelectionPanel.l2img.setBorder(levelSelectionPanel.whiteBorder);
                levelSelectionPanel.level3.setForeground(MainMenu.strColor);
                levelSelectionPanel.l3img.setBorder(levelSelectionPanel.whiteBorder);
                levelSelectionPanel.returnLabel.setForeground(MainMenu.highlighter);
            }

            //check bounds
            if(levelSelectionPanel.currentOption > levelSelectionPanel.RETURN_LABEL) {
                levelSelectionPanel.currentOption = 1;
                levelSelectionPanel.returnLabel.setForeground(MainMenu.strColor);
                levelSelectionPanel.level1.setForeground(MainMenu.highlighter);
                levelSelectionPanel.l1img.setBorder(levelSelectionPanel.orangeBorder);
            }
        }
    }
}
