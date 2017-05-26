package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import model.MenuActions;

public class RotByWord extends MenuActions{
	
JFrame mainFrame = new JFrame();
	
	JPanel headerPanel = new JPanel();
	JLabel header = new JLabel("Encryption Program");
	
	JPanel promptPanel = new JPanel();
	JScrollPane scrollPrompt = new JScrollPane(promptPanel);
	
	JPanel editPane = new JPanel();
	JLabel charLbl = new JLabel("Enter a character to rotate");
	JTextArea charText = new JTextArea("", 2, 1);
	
	JPanel button = new JPanel();
	public JButton encrypt = new JButton("Encrypt");
	public JButton decrypt = new JButton("Decrypt");
	public JButton mainMenu = new JButton("Main Menu");
	public JButton exit = new JButton("Exit");
	
	public RotByWord() {
		
		headerPanel.add(header);
		header.setForeground(Color.CYAN);
		headerPanel.setBackground(Color.BLACK);
		
		promptPanel.setBackground(Color.BLACK);
		promptPanel.add(prompt);
		prompt.setLineWrap(false);
		prompt.setForeground(Color.CYAN);
		prompt.setBackground(Color.DARK_GRAY);
		scrollPrompt.setBackground(Color.BLACK);
		
		editPane.setBackground(Color.BLACK);
		editPane.setForeground(Color.CYAN);
		charLbl.setForeground(Color.CYAN);
		charLbl.setBackground(Color.BLACK);
		charText.setBackground(Color.DARK_GRAY);
		charText.setForeground(Color.CYAN);
		editPane.add(charLbl);
		editPane.add(charText);
		
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
		mainFrame.setSize(800, 800);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		// Drop down menu
        fileMenu.setMnemonic('F');
        fileMenu.add(openAction);
        fileMenu.add(saveAction);
        fileMenu.add(exitAction);
        mainFrame.setJMenuBar(menuBar);
				
	}
	
	public void loadRotByWordView() {
		prompt.setColumns(60);
		prompt.setRows(500);
		String promptText = "Enter some text here or \n"
				+ "choose the menu option to load \n"
				+ "a file of your own.";
		prompt.setText(promptText);
		mainFrame.setVisible(true);
	}
	
	public void closeRot13View() {
		mainFrame.setVisible(false);
	}
	
	public void setCharTextBlank() {
		charText.setText("");
	}
	
	public String getCharText() {
		return charText.getText();
	}
}
