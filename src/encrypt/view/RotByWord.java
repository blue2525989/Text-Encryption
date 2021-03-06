package encrypt.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import encrypt.model.MenuActions;

public class RotByWord extends MenuActions{
	
JFrame mainFrame = new JFrame();
	
	JPanel headerPanel = new JPanel();
	JLabel header = new JLabel("Encryption Program");
	
	JPanel promptPanel = new JPanel();
	JScrollPane scrollPrompt = new JScrollPane(promptPanel);
	
	JPanel editPane = new JPanel();
	JLabel sentLbl = new JLabel("Enter a sentence to encrypt");
	JTextArea sentText = new JTextArea("", 1, 35);
	JLabel keyLbl = new JLabel("Enter a keyword to rotate it by");
	JTextArea keyText = new JTextArea("", 1, 10);
	JLabel numLbl1 = new JLabel("Optional: enter a number to rotate it by");
	JTextArea numText1 = new JTextArea("", 1, 10);
	JLabel numLbl2 = new JLabel("Optional: enter a number to rotate it by");
	JTextArea numText2 = new JTextArea("", 1, 10);
	
	JPanel button = new JPanel();
	public JButton encrypt = new JButton("Encrypt");
	public JButton decrypt = new JButton("Decrypt");
	public JButton mainMenu = new JButton("Main Menu");
	public JButton exit = new JButton("Exit");
	
	public RotByWord() {
		
		headerPanel.add(header);
		header.setForeground(Color.CYAN);
		headerPanel.setBackground(Color.BLACK);
		
		GridLayout gridLay = new GridLayout(1,1);
		promptPanel.setBackground(Color.BLACK);
		promptPanel.add(prompt);
		promptPanel.setLayout(gridLay);
		prompt.setLineWrap(true);
		prompt.setForeground(Color.CYAN);
		prompt.setBackground(Color.DARK_GRAY);
		scrollPrompt.setBackground(Color.BLACK);
		
		GridLayout editGrd = new GridLayout(4, 2);
		editPane.setLayout(editGrd);
		editPane.setBackground(Color.BLACK);
		editPane.setForeground(Color.CYAN);
		sentLbl.setForeground(Color.CYAN);
		sentLbl.setBackground(Color.BLACK);
		sentText.setBackground(Color.DARK_GRAY);
		sentText.setForeground(Color.CYAN);
		keyLbl.setForeground(Color.CYAN);
		keyLbl.setBackground(Color.BLACK);
		numLbl1.setForeground(Color.CYAN);
		numLbl1.setBackground(Color.BLACK);
		numText1.setForeground(Color.CYAN);
		numText1.setBackground(Color.DARK_GRAY);
		numLbl2.setForeground(Color.CYAN);
		numLbl2.setBackground(Color.BLACK);
		sentText.setLineWrap(true);
		keyText.setLineWrap(true);
		numText1.setLineWrap(true);
		numText2.setLineWrap(true);
		editPane.add(sentLbl);
		editPane.add(sentText);
		editPane.add(keyLbl);
		editPane.add(keyText);
		editPane.add(numLbl1);
		editPane.add(numText1);
		editPane.add(numLbl2);
		editPane.add(numText2);
		
		button.setBackground(Color.BLACK);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.CYAN);
		button.add(encrypt);
		button.add(decrypt);
		button.add(mainMenu);
		button.add(exit);
		encrypt.setSize(20, 20);
		decrypt.setSize(20,20);
		mainMenu.setSize(20, 20);
		
		GridLayout main = new GridLayout(4,1);
		main.setHgap(-15);
		mainFrame.setLayout(main);
		mainFrame.add(headerPanel);
		mainFrame.add(scrollPrompt);
		mainFrame.add(editPane);
		mainFrame.add(button);
		mainFrame.setVisible(false);
		mainFrame.setSize(860, 800);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		// Drop down menu
        fileMenu.setMnemonic('F');
        fileMenu.add(openAction);
        fileMenu.add(saveAction);
        fileMenu.add(exitAction);
        mainFrame.setJMenuBar(menuBar);
				
	}
	
	public void loadRotWordView() {
		prompt.setColumns(75);
		prompt.setRows(20);
		String promptText = "Enter some text here or \n"
				+ "choose the menu option to load \n"
				+ "a file of your own.";
		prompt.setText(promptText);
		mainFrame.setVisible(true);
	}
	
	public void closeRotWordView() {
		mainFrame.setVisible(false);
	}
	
	public void setSentTextBlank() {
		sentText.setText("");
	}
	
	public String getSentText() {
		return sentText.getText();
	}
	
	public void setKeyTextBlank() {
		keyText.setText("");
	}
	
	public String getKeyText() {
		return keyText.getText();
	}

	public void setNum1TextBlank() {
		numText1.setText("");
	}
	
	public String getNum1Text() {
		return numText1.getText();
	}
	
	public void setNum2TextBlank() {
		numText2.setText("");
	}
	
	public String getNum2Text() {
		return numText2.getText();
	}
}
