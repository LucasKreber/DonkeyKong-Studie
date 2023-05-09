package source.view;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CreditsPanelKeyHandler extends AbstractAction {
    private String name;
    private CreditsPanel creditsPanel;

    public CreditsPanelKeyHandler(String name, CreditsPanel creditsPanel){
        this.name = name;
        this.creditsPanel = creditsPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(name == "enter"){
            if(creditsPanel.currentOption == 0) {
                creditsPanel.guiManager.setOptionsPanelVisible();
            }
        }
    }
}
