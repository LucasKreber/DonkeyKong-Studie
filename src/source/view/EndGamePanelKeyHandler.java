package source.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class EndGamePanelKeyHandler extends AbstractAction {
    private String name;
    private EndGamePanel endGamePanel;

    public EndGamePanelKeyHandler(String name, EndGamePanel endGamePanel){
        this.name = name;
        this.endGamePanel = endGamePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(endGamePanel.textArea.getText().length() == 5){
            if(name == "enter"){
                try {
                    endGamePanel.scoreData.setHighscore(endGamePanel.textArea.getText(), endGamePanel.score);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                endGamePanel.guiManager.setMainMenuPanelVisible();
            }
        }

        if(endGamePanel.textArea.getText().length() > 0){
            if(name == "back space"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText().substring(0, endGamePanel.textArea.getText ().length() - 1));
            }
        }

        if(endGamePanel.textArea.getText().length() < 5){
            if(name == "q"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "Q");
            }
            else if(name == "w"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "W");
            }
            else if(name == "e"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "E");
            }
            else if(name == "r"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "R");
            }
            else if(name == "t"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "T");
            }
            else if(name == "y"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "Y");
            }
            else if(name == "u"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "U");
            }
            else if(name == "i"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "I");
            }
            else if(name == "o"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "O");
            }
            else if(name == "p"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "P");
            }
            else if(name == "a"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "A");
            }
            else if(name == "s"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "S");
            }
            else if(name == "d"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "D");
            }
            else if(name == "f"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "F");
            }
            else if(name == "g"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "G");
            }
            else if(name == "h"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "H");
            }
            else if(name == "j"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "J");
            }
            else if(name == "k"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "K");
            }
            else if(name == "l"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "L");
            }
            else if(name == "z"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "Z");
            }
            else if(name == "x"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "X");
            }
            else if(name == "c"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "C");
            }
            else if(name == "v"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "V");
            }
            else if(name == "b"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "B");
            }
            else if(name == "n"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "N");
            }
            else if(name == "m"){
                endGamePanel.textArea.setText(endGamePanel.textArea.getText() + "M");
            }
        }
    }
}
