package encrypt.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

import encrypt.model.MenuActions;

public class MainView extends MenuActions{
	
	JFrame mainFrame = new JFrame();
	
	JPanel headerPanel = new JPanel();
	JLabel header = new JLabel("Encryption Program");
	
	JPanel promptPanel = new JPanel();
	JScrollPane scrollPrompt = new JScrollPane(promptPanel);
	
	JPanel button = new JPanel();
	public JButton rot13 = new JButton("Rot 13");
	public JButton rotAny = new JButton("Rot Any");
	public JButton rotByWord = new JButton("Rotate by word");
	public JButton exit = new JButton("Exit");
	
	public MainView() {
		
		headerPanel.add(header);
		header.setForeground(Color.CYAN);
		headerPanel.setBackground(Color.BLACK);
		
		promptPanel.setBackground(Color.BLACK);
		promptPanel.add(prompt);
		prompt.setLineWrap(false);
		prompt.setEditable(false);
		prompt.setForeground(Color.CYAN);
		prompt.setBackground(Color.BLACK);
		scrollPrompt.setBackground(Color.BLACK);
		
		button.setBackground(Color.BLACK);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.CYAN);
		button.add(rot13);
		button.add(rotAny);
		button.add(rotByWord);
		button.add(exit);
		rot13.setSize(20, 20);
		rotAny.setSize(20,20);
		rotByWord.setSize(20, 20);
		
		GridLayout main = new GridLayout(3,1);
		mainFrame.setLayout(main);
		mainFrame.add(headerPanel);
		mainFrame.add(promptPanel);
		mainFrame.add(button);
		mainFrame.setVisible(false);
		mainFrame.setSize(400, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
				
	}
	
	public void loadMainView() {
		String promptText = "Welcome to my Encryption program\n"
				+ "Choose either the rot13, rotAny,\n"
				+ "or the rotate by word button to\n"
				+ "pick an encryption method.";
		prompt.setText(promptText);
		mainFrame.setVisible(true);
	}
	
	public void closeMainView() {
		mainFrame.setVisible(false);
	}

}
