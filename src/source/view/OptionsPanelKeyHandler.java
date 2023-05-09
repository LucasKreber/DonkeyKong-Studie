package source.view;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class OptionsPanelKeyHandler extends AbstractAction {
    private String name;
    private OptionsPanel optionsPanel;

    public OptionsPanelKeyHandler(String name, OptionsPanel optionsPanel){
        this.name = name;
        this.optionsPanel = optionsPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(name == "enter"){
            if(optionsPanel.currentOption == 0) {
                if(optionsPanel.soundLabel.getText().equals("SOUND:ON")) {
                    optionsPanel.soundOn = false;
                    optionsPanel.soundLabel.setText("SOUND:OFF");
                    optionsPanel.sound.disableSound();
                }
                else {
                    optionsPanel.soundOn = true;
                    optionsPanel.soundLabel.setText("SOUND:ON");
                    optionsPanel.sound.enableSound();
                }
            }
            else if(optionsPanel.currentOption == 1) {
                optionsPanel.guiManager.setHelpPanelVisible();
            }
            else if(optionsPanel.currentOption == 2) {
                optionsPanel.guiManager.setCreditsPanelVisible();
            }
            else if(optionsPanel.currentOption == 3) {
                optionsPanel.guiManager.setMainMenuPanelVisible();
            }
        }

        else if(name == "w") {
            optionsPanel.currentOption--;

            if(optionsPanel.currentOption == 0) {
                optionsPanel.helpLabel.setForeground(MainMenu.strColor);
                optionsPanel.soundLabel.setForeground(MainMenu.highlighter);
            }

            else if(optionsPanel.currentOption == 1) {
                optionsPanel.creditsLabel.setForeground(MainMenu.strColor);
                optionsPanel.helpLabel.setForeground(MainMenu.highlighter);
            }

            else if(optionsPanel.currentOption == 2) {
                optionsPanel.returnLabel.setForeground(MainMenu.strColor);
                optionsPanel.creditsLabel.setForeground(MainMenu.highlighter);
            }

            else if(optionsPanel.currentOption == 3){
                optionsPanel.soundLabel.setForeground(MainMenu.strColor);
                optionsPanel.returnLabel.setForeground(MainMenu.highlighter);
            }

            //check bounds
            if(optionsPanel.currentOption < 0) {
                optionsPanel.currentOption = 3;
                optionsPanel.soundLabel.setForeground(MainMenu.strColor);
                optionsPanel.returnLabel.setForeground(MainMenu.highlighter);
            }
        }

        else if(name == "s") {
            optionsPanel.currentOption++;

            if(optionsPanel.currentOption == 0) {
                optionsPanel.returnLabel.setForeground(MainMenu.strColor);
                optionsPanel.soundLabel.setForeground(MainMenu.highlighter);
            }

            else if(optionsPanel.currentOption == 1) {
                optionsPanel.soundLabel.setForeground(MainMenu.strColor);
                optionsPanel.helpLabel.setForeground(MainMenu.highlighter);
            }

            else if(optionsPanel.currentOption == 2) {
                optionsPanel.helpLabel.setForeground(MainMenu.strColor);
                optionsPanel.creditsLabel.setForeground(MainMenu.highlighter);
            }

            else if(optionsPanel.currentOption == 3){
                optionsPanel.creditsLabel.setForeground(MainMenu.strColor);
                optionsPanel.returnLabel.setForeground(MainMenu.highlighter);
            }

            //check bounds
            if(optionsPanel.currentOption > 3) {
                optionsPanel.currentOption = 0;
                optionsPanel.returnLabel.setForeground(MainMenu.strColor);
                optionsPanel.soundLabel.setForeground(MainMenu.highlighter);
            }
        }
    }
}
