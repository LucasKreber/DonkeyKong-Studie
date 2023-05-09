package source.view;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class HelpPanelKeyHandler extends AbstractAction {
    private String name;
    private HelpPanel helpPanel;

    public HelpPanelKeyHandler(String name, HelpPanel helpPanel){
        this.name = name;
        this.helpPanel = helpPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(name == "enter"){
            helpPanel.guiManager.setOptionsPanelVisible();
        }

        else if(name == "a") {
            if(helpPanel.currentOption > 4)
                helpPanel.currentOption = 4;

            helpPanel.currentOption--;
            if(helpPanel.currentOption == 0) {
                helpPanel.helpLeftRight.setVisible(true);
                helpPanel.helpUpDown.setVisible(false);
                helpPanel.helpJump.setVisible(false);
                helpPanel.helpSmashHammer.setVisible(false);
                helpPanel.helpPause.setVisible(false);
                helpPanel.returnLabel.setVisible(true);
                helpPanel.label1.setVisible(true);
                helpPanel.label2.setVisible(false);
                helpPanel.label3.setVisible(false);
                helpPanel.label4.setVisible(false);
                helpPanel.label5.setVisible(false);

            }
            else if(helpPanel.currentOption == 1) {
                helpPanel.helpLeftRight.setVisible(false);
                helpPanel.helpUpDown.setVisible(true);
                helpPanel.helpJump.setVisible(false);
                helpPanel.helpSmashHammer.setVisible(false);
                helpPanel.helpPause.setVisible(false);
                helpPanel.returnLabel.setVisible(true);
                helpPanel.label1.setVisible(false);
                helpPanel.label2.setVisible(true);
                helpPanel.label3.setVisible(false);
                helpPanel.label4.setVisible(false);
                helpPanel.label5.setVisible(false);
            }
            else if(helpPanel.currentOption == 2) {
                helpPanel.helpLeftRight.setVisible(false);
                helpPanel.helpUpDown.setVisible(false);
                helpPanel.helpJump.setVisible(true);
                helpPanel.helpSmashHammer.setVisible(false);
                helpPanel.helpPause.setVisible(false);
                helpPanel.returnLabel.setVisible(true);
                helpPanel.label1.setVisible(false);
                helpPanel.label2.setVisible(false);
                helpPanel.label3.setVisible(true);
                helpPanel.label4.setVisible(false);
                helpPanel.label5.setVisible(false);
            }
            else if(helpPanel.currentOption == 3) {
                helpPanel.helpLeftRight.setVisible(false);
                helpPanel.helpUpDown.setVisible(false);
                helpPanel.helpJump.setVisible(false);
                helpPanel.helpSmashHammer.setVisible(true);
                helpPanel.helpPause.setVisible(false);
                helpPanel.returnLabel.setVisible(true);
                helpPanel.label1.setVisible(false);
                helpPanel.label2.setVisible(false);
                helpPanel.label3.setVisible(false);
                helpPanel.label4.setVisible(true);
                helpPanel.label5.setVisible(false);
            }
            else if(helpPanel.currentOption == 4) {
                helpPanel.helpLeftRight.setVisible(false);
                helpPanel.helpUpDown.setVisible(false);
                helpPanel.helpJump.setVisible(false);
                helpPanel.helpSmashHammer.setVisible(false);
                helpPanel.helpPause.setVisible(true);
                helpPanel.returnLabel.setVisible(true);
                helpPanel.label1.setVisible(false);
                helpPanel.label2.setVisible(false);
                helpPanel.label3.setVisible(false);
                helpPanel.label4.setVisible(false);
                helpPanel.label5.setVisible(true);
            }
        }

        else if(name == "d") {
            if(helpPanel.currentOption < 0)
                helpPanel.currentOption = 0;

            helpPanel.currentOption++;
            if(helpPanel.currentOption == 0) {
                helpPanel.helpLeftRight.setVisible(true);
                helpPanel.helpUpDown.setVisible(false);
                helpPanel.helpJump.setVisible(false);
                helpPanel.helpSmashHammer.setVisible(false);
                helpPanel.helpPause.setVisible(false);
                helpPanel.returnLabel.setVisible(true);
                helpPanel.label1.setVisible(true);
                helpPanel.label2.setVisible(false);
                helpPanel.label3.setVisible(false);
                helpPanel.label4.setVisible(false);
                helpPanel.label5.setVisible(false);
            }
            else if(helpPanel.currentOption == 1) {
                helpPanel.helpLeftRight.setVisible(false);
                helpPanel.helpUpDown.setVisible(true);
                helpPanel.helpJump.setVisible(false);
                helpPanel.helpSmashHammer.setVisible(false);
                helpPanel.helpPause.setVisible(false);
                helpPanel.returnLabel.setVisible(true);
                helpPanel.label1.setVisible(false);
                helpPanel.label2.setVisible(true);
                helpPanel.label3.setVisible(false);
                helpPanel.label4.setVisible(false);
                helpPanel.label5.setVisible(false);
            }
            else if(helpPanel.currentOption == 2) {
                helpPanel.helpLeftRight.setVisible(false);
                helpPanel.helpUpDown.setVisible(false);
                helpPanel.helpJump.setVisible(true);
                helpPanel.helpSmashHammer.setVisible(false);
                helpPanel.helpPause.setVisible(false);
                helpPanel.returnLabel.setVisible(true);
                helpPanel.label1.setVisible(false);
                helpPanel.label2.setVisible(false);
                helpPanel.label3.setVisible(true);
                helpPanel.label4.setVisible(false);
                helpPanel.label5.setVisible(false);
            }
            else if(helpPanel.currentOption == 3) {
                helpPanel.helpLeftRight.setVisible(false);
                helpPanel.helpUpDown.setVisible(false);
                helpPanel.helpJump.setVisible(false);
                helpPanel.helpSmashHammer.setVisible(true);
                helpPanel.helpPause.setVisible(false);
                helpPanel.returnLabel.setVisible(true);
                helpPanel.label1.setVisible(false);
                helpPanel.label2.setVisible(false);
                helpPanel.label3.setVisible(false);
                helpPanel.label4.setVisible(true);
                helpPanel.label5.setVisible(false);
            }
            else if(helpPanel.currentOption == 4) {
                helpPanel.helpLeftRight.setVisible(false);
                helpPanel.helpUpDown.setVisible(false);
                helpPanel.helpJump.setVisible(false);
                helpPanel.helpSmashHammer.setVisible(false);
                helpPanel.helpPause.setVisible(true);
                helpPanel.returnLabel.setVisible(true);
                helpPanel.label1.setVisible(false);
                helpPanel.label2.setVisible(false);
                helpPanel.label3.setVisible(false);
                helpPanel.label4.setVisible(false);
                helpPanel.label5.setVisible(true);
            }
        }
    }
}
