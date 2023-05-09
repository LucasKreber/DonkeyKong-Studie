package source.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.Border;

import source.controller.UnlockData;


@SuppressWarnings("serial")
public class LevelSelectionPanel extends JPanel {
	GUIPanelManager guiManager;

	JLabel returnLabel, level1, level2, level3, l1img, l2img, l3img;
	int currentOption;
	final int MAX_LEVEL_NUMBER = 3;
	final int RETURN_LABEL = 4;
	int level;
	int unlock = 3;
	
	Border whiteBorder = BorderFactory.createLineBorder(Color.white);
	Border orangeBorder = BorderFactory.createLineBorder(MainMenu.highlighter);

	private BufferedImage level1img, level2img, level3img;
	private UnlockData unlockData;

	public LevelSelectionPanel(GUIPanelManager guiManager) {
		this.guiManager = guiManager;
		try {
			this.unlockData = new UnlockData();
			unlock = unlockData.getUnlock();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			guiManager.setMainMenuPanelVisible();
		}
		
		currentOption = 1;
		
		initializeKeyBindings();

		try {
			level1img = ImageIO.read(new File("src/image/level 1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		l1img = new JLabel(new ImageIcon(level1img));
		l1img.setSize(280, 230);
		l1img.setBorder(orangeBorder);
		l1img.setLocation(130, 40);
		add(l1img);
		
		try {
			level2img = ImageIO.read(new File("src/image/level 2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		l2img = new JLabel(new ImageIcon(level2img));
		l2img.setSize(280, 230);
		l2img.setBorder(whiteBorder);
		l2img.setLocation(130, 290);
		add(l2img);
		
		try {
			level3img = ImageIO.read(new File("src/image/level 3.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		l3img = new JLabel(new ImageIcon(level3img));
		l3img.setSize(280, 230);
		l3img.setBorder(whiteBorder);
		l3img.setLocation(130, 540);
		add(l3img);
		
		level1 = new JLabel("LEVEL1");
		level1.setForeground(MainMenu.highlighter);
		level1.setFont(MainMenu.optionsFont);
		level1.setSize(300, 45);
		level1.setLocation(550, 125);
		add(level1);
		
		level2 = new JLabel("LEVEL2");
		level2.setForeground(MainMenu.strColor);
		level2.setFont(MainMenu.optionsFont);
		level2.setSize(300, 45);
		level2.setLocation(550, 375);
		add(level2);
		
		level3 = new JLabel("LEVEL3");
		level3.setForeground(MainMenu.strColor);
		level3.setFont(MainMenu.optionsFont);
		level3.setSize(300, 45);
		level3.setLocation(550, 625);
		add(level3);

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
		actionMapPause.put("enterReleased", new LevelSelectionPanelKeyHandler("enter", this));
		
		inputMapPause.put(KeyStroke.getKeyStroke("W"), "wPressed");
		actionMapPause.put("wPressed", new LevelSelectionPanelKeyHandler("w", this));
		
		inputMapPause.put(KeyStroke.getKeyStroke("S"), "sPressed");
		actionMapPause.put("sPressed", new LevelSelectionPanelKeyHandler("s", this));
		
	}
}