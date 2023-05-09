package source.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import source.controller.Sound;


@SuppressWarnings("serial")
public class OptionsPanel extends JPanel{
	
	GUIPanelManager guiManager;
	
	JLabel returnLabel, titleLabel, soundLabel, helpLabel, creditsLabel;
	int currentOption;
	protected static boolean soundOn = true;
	Sound sound;
	
	public OptionsPanel(GUIPanelManager guiManager, Sound sound) {
		initializeKeyBindings();
		
		this.guiManager = guiManager;
		this.sound = sound;
		currentOption = 0;
		
		titleLabel = new JLabel("OPTIONS");
		titleLabel.setForeground(MainMenu.strColor);
		titleLabel.setFont(new Font("Press Start 2P", Font.BOLD,60));
		titleLabel.setSize(650, 100);
		titleLabel.setLocation(280, 40);
		add(titleLabel);
		
		if(soundOn) {
			soundLabel = new JLabel("SOUND:ON");
		}
		else {
			soundLabel = new JLabel("SOUND:OFF");
		}
		
		soundLabel.setForeground(MainMenu.highlighter);
		soundLabel.setFont(MainMenu.optionsFont);
		soundLabel.setSize(450, 60);
		soundLabel.setLocation(100, 250);
		add(soundLabel);
		
		helpLabel = new JLabel("HELP");
		helpLabel.setForeground(MainMenu.strColor);
		helpLabel.setFont(MainMenu.optionsFont);
		helpLabel.setSize(285, 60);
		helpLabel.setLocation(100, 380);
		add(helpLabel);
		
		creditsLabel = new JLabel("SHOW CREDITS");
		creditsLabel.setForeground(MainMenu.strColor);
		creditsLabel.setFont(MainMenu.optionsFont);
		creditsLabel.setSize(600, 60);
		creditsLabel.setLocation(100, 510);
		add(creditsLabel);
		
		returnLabel = new JLabel("RETURN");
		returnLabel.setForeground(MainMenu.strColor);
		returnLabel.setFont(MainMenu.optionsFont);
		returnLabel.setSize(285, 45);
		returnLabel.setLocation(355, 850);
		add(returnLabel);
		
		setBackground(Color.BLACK);
		setLayout(null);
	}
	
	public void initializeKeyBindings(){
		InputMap inputMapPause = this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMapPause = this.getActionMap();
		
		inputMapPause.put(KeyStroke.getKeyStroke("released ENTER"), "enterReleased");
		actionMapPause.put("enterReleased", new OptionsPanelKeyHandler("enter", this));
		
		inputMapPause.put(KeyStroke.getKeyStroke("W"), "wPressed");
		actionMapPause.put("wPressed", new OptionsPanelKeyHandler("w", this));
		
		inputMapPause.put(KeyStroke.getKeyStroke("S"), "sPressed");
		actionMapPause.put("sPressed", new OptionsPanelKeyHandler("s", this));
	}
}
