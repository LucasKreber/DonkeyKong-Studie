package source.view;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class HighScoresPanelKeyHandler extends AbstractAction {
    private String name;
    private HighScoresPanel highScoresPanel;

    public HighScoresPanelKeyHandler(String name, HighScoresPanel highScoresPanel){
        this.name = name;
        this.highScoresPanel = highScoresPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(name == "enter"){
            highScoresPanel.guiManager.setMainMenuPanelVisible();
        }
    }
}
