package source.view;

import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;

import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import source.controller.ScoreData;


public class EndGamePanel extends JPanel{
	
	GUIPanelManager guiManager;
	ScoreData scoreData;
	JTextField textArea;
	int score;
	private JLabel titleLabel;
	
	public EndGamePanel(GUIPanelManager guiManager, int score){
		initializeJTextField();

		this.guiManager = guiManager;
		try {
			scoreData = new ScoreData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.score = score;
		
		titleLabel = new JLabel("ENTER NAME");
		titleLabel.setForeground(MainMenu.strColor);
		titleLabel.setFont(new Font("Press Start 2P", Font.BOLD,60));
		titleLabel.setSize(700, 150);
		titleLabel.setLocation(180, 40);
		add(titleLabel);
		
		setBackground(Color.BLACK);
		setLayout(null);
	}
	
	public void initializeJTextField(){
		textArea = new JTextField();
		textArea.setBackground(Color.BLACK);
		textArea.setForeground(MainMenu.strColor);
		textArea.setFont(new Font("Press Start 2P", Font.BOLD,120));
		textArea.setHorizontalAlignment(SwingConstants.CENTER);
		textArea.setBorder(null);
		textArea.setSize(800, 600);
		textArea.setLocation(90, 200);
		
		textArea.setEditable(false);
		add(textArea);
		textArea.requestFocus();
		
		InputMap inputMap = textArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = textArea.getActionMap();
		
		inputMap.put(KeyStroke.getKeyStroke("released ENTER"), "enterReleased");
		actionMap.put("enterReleased", new EndGamePanelKeyHandler("enter", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released BACK_SPACE"), "backSpaceReleased");
		actionMap.put("backSpaceReleased", new EndGamePanelKeyHandler("back space", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released Q"), "qReleased");
		actionMap.put("qReleased", new EndGamePanelKeyHandler("q", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released W"), "wReleased");
		actionMap.put("wReleased", new EndGamePanelKeyHandler("w", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released E"), "eReleased");
		actionMap.put("eReleased", new EndGamePanelKeyHandler("e", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released R"), "rReleased");
		actionMap.put("rReleased", new EndGamePanelKeyHandler("r", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released T"), "tReleased");
		actionMap.put("tReleased", new EndGamePanelKeyHandler("t", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released Y"), "yReleased");
		actionMap.put("yReleased", new EndGamePanelKeyHandler("y", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released U"), "uReleased");
		actionMap.put("uReleased", new EndGamePanelKeyHandler("u", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released I"), "iReleased");
		actionMap.put("iReleased", new EndGamePanelKeyHandler("i", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released O"), "oReleased");
		actionMap.put("oReleased", new EndGamePanelKeyHandler("o", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released P"), "pReleased");
		actionMap.put("pReleased", new EndGamePanelKeyHandler("p", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released A"), "aReleased");
		actionMap.put("aReleased", new EndGamePanelKeyHandler("a", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released S"), "sReleased");
		actionMap.put("sReleased", new EndGamePanelKeyHandler("s", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released D"), "dReleased");
		actionMap.put("dReleased", new EndGamePanelKeyHandler("d", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released F"), "fReleased");
		actionMap.put("fReleased", new EndGamePanelKeyHandler("f", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released G"), "gReleased");
		actionMap.put("gReleased", new EndGamePanelKeyHandler("g", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released H"), "hReleased");
		actionMap.put("hReleased", new EndGamePanelKeyHandler("h", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released J"), "jReleased");
		actionMap.put("jReleased", new EndGamePanelKeyHandler("j", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released K"), "kReleased");
		actionMap.put("kReleased", new EndGamePanelKeyHandler("k", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released L"), "lReleased");
		actionMap.put("lReleased", new EndGamePanelKeyHandler("l", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released Z"), "zReleased");
		actionMap.put("zReleased", new EndGamePanelKeyHandler("z", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released X"), "xReleased");
		actionMap.put("xReleased", new EndGamePanelKeyHandler("x", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released C"), "cReleased");
		actionMap.put("cReleased", new EndGamePanelKeyHandler("c", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released V"), "vReleased");
		actionMap.put("vReleased", new EndGamePanelKeyHandler("v", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released B"), "bReleased");
		actionMap.put("bReleased", new EndGamePanelKeyHandler("b", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released N"), "nReleased");
		actionMap.put("nReleased", new EndGamePanelKeyHandler("n", this));
		
		inputMap.put(KeyStroke.getKeyStroke("released M"), "mReleased");
		actionMap.put("mReleased", new EndGamePanelKeyHandler("m", this));
	}
}