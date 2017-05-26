package encrypt.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Encrypt;
import view.MainView;
import view.Rot13View;
import view.RotAnyView;
import view.RotByWord;

public class MainController extends Encrypt implements ActionListener {
	
	MainView uiMain = new MainView();
	Rot13View uiRot13 = new Rot13View();
	RotAnyView uiRotAny = new RotAnyView();
	RotByWord uiRotWord = new RotByWord();
	
	public MainController () {
		uiMain.rot13.addActionListener(this);
		uiMain.rotAny.addActionListener(this);
		uiMain.rotByWord.addActionListener(this);
		uiMain.exit.addActionListener(this);
		
		uiRot13.encrypt.addActionListener(this);
		uiRot13.decrypt.addActionListener(this);
		uiRot13.mainMenu.addActionListener(this);
		uiRot13.exit.addActionListener(this);
	}
	
	public void loadView() {
		uiMain.loadMainView();
	}
	
	public void actionPerformed (ActionEvent event) {
		// rot 13 view button
		if (event.getSource() == uiMain.rot13) {
			uiMain.closeMainView();
			uiRot13.loadRot13View();
		}
		// rot 13 view button
		if (event.getSource() == uiMain.rotAny) {
			uiMain.closeMainView();
			uiRotAny.loadRotAnyView();
		}
		// rot 13 view button
		if (event.getSource() == uiMain.rotByWord) {
			uiMain.closeMainView();
			uiRotWord.loadRotByWordView();
		}
		// exit button
		if (event.getSource() == uiMain.exit) {
			System.exit(0);
		}
		
		/***************************ROT 13**********************/
			
		if (event.getSource() == uiRot13.mainMenu) {
			uiRot13.closeRot13View();
			uiMain.loadMainView();
		}
			
		// encrypt button
		if (event.getSource() == uiRot13.encrypt) {
			uiRot13.setPromptBlank();
			String charText = uiRot13.getCharText();
			char[] chars = charText.toCharArray();
			char newChar = (char) rot13(chars[0]);
			uiRot13.setPrompt("The character is now: " + newChar + "");
		}
		
		// decrypt button
		if (event.getSource() == uiRot13.decrypt) {
			String enc =  uiRot13.getPromptText();
			uiRot13.setPromptBlank();
			char[] chars = enc.toCharArray();
			char newChar = (char) unRot13(chars[chars.length-1]);
			uiRot13.setPrompt("The character is now: " + newChar + "");
		}
			
		// exit button
		if (event.getSource() == uiRot13.exit) {
			System.exit(0);
		}	
	}
}
