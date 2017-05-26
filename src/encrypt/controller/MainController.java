package encrypt.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import encrypt.model.Encrypt;
import encrypt.view.MainView;
import encrypt.view.Rot13View;
import encrypt.view.RotAnyView;
import encrypt.view.RotByWord;

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
		
		uiRotAny.encrypt.addActionListener(this);
		uiRotAny.decrypt.addActionListener(this);
		uiRotAny.mainMenu.addActionListener(this);
		uiRotAny.exit.addActionListener(this);
		
		uiRotWord.encrypt.addActionListener(this);
		uiRotWord.decrypt.addActionListener(this);
		uiRotWord.mainMenu.addActionListener(this);
		uiRotWord.exit.addActionListener(this);
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
			uiRotWord.loadRotWordView();
		}
		// exit button
		if (event.getSource() == uiMain.exit) {
			System.exit(0);
		}
		
		/***************************ROT 13**********************/
			
		// main menu button
		if (event.getSource() == uiRot13.mainMenu) {
			uiRot13.closeRot13View();
			uiMain.loadMainView();
		}
			
		// encrypt button
		if (event.getSource() == uiRot13.encrypt) {
			try {
				String master = (uiRot13.getCharText().length() > 0) ?
						(uiRot13.getCharText()) : (uiRot13.getPromptText());
				uiRot13.setPromptBlank();
				String enc = rot13String(master);
				uiRot13.setPrompt(enc);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		
		// decrypt button
		if (event.getSource() == uiRot13.decrypt) {
			try {
				String master = (uiRot13.getCharText().length() > 0) ?
						(uiRot13.getCharText()) : (uiRot13.getPromptText());
				uiRot13.setPromptBlank();
				String enc = unRot13String(master);
				uiRot13.setPrompt(enc);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
			
		// exit button
		if (event.getSource() == uiRot13.exit) {
			System.exit(0);
		}	
		
		/***************************ROT ANY*****************************/
		
		// main menu button
		if (event.getSource() == uiRotAny.mainMenu) {
			uiRotAny.setSentTextBlank();
			uiRotAny.setKeyTextBlank();
			uiRotAny.setNum1TextBlank();
			uiRotAny.closeRotAnyView();
			uiMain.loadMainView();
		}
					
		// encrypt button
		if (event.getSource() == uiRotAny.encrypt) {
			try {
				// tries sentence text box first, if not tries prompt text box
				String master = ((uiRotAny.getSentText().length() > 0)) ?
						(uiRotAny.getSentText()) :
							(uiRotAny.getPromptText());
				String numTempText = uiRotAny.getKeyText();
				int numText = Integer.parseInt(numTempText);
				String enc = "";
				if (uiRotAny.getNum1Text().length() > 0) {
					String temp = uiRotAny.getNum1Text();
					int xtra = Integer.parseInt(temp);					
					enc = rotAnyString(master, numText, xtra);					
				}				
				else {
					enc = rotAnyString(master, numText);
				}
				uiRotAny.setPrompt(enc);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
			
		// decrypt button
		if (event.getSource() == uiRotAny.decrypt) {
			try {
				// tries sentence text box first, if not tries prompt text box
				String master = ((uiRotAny.getSentText().length() > 0)) ?
						(uiRotAny.getSentText()) :
							(uiRotAny.getPromptText());
				String numTempText = uiRotAny.getKeyText();
				int numText = Integer.parseInt(numTempText);
				String enc = "";
				if (uiRotWord.getNum1Text().length() > 0) {
					String temp = uiRotAny.getNum1Text();
					int xtra = Integer.parseInt(temp);					
					enc = unrotAnyString(master, numText, xtra);					
				}				
				else {
					enc = unrotAnyString(master, numText);
				}
				uiRotAny.setPrompt(enc);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,  e.getMessage());
			}
		}
					
		// exit button
		if (event.getSource() == uiRotAny.exit) {
			System.exit(0);
		}	
		
		/***************************ROT BY WORD****************************/
		
		// main menu button
		if (event.getSource() == uiRotWord.mainMenu) {
			uiRotWord.setSentTextBlank();
			uiRotWord.setKeyTextBlank();
			uiRotWord.setNum1TextBlank();
			uiRotWord.setNum2TextBlank();
			uiRotWord.closeRotWordView();
			uiMain.loadMainView();
		}
							
		// encrypt button
		if (event.getSource() == uiRotWord.encrypt) {
			try {
				String enc = "";
				// tries sentence text box first, if not tries prompt text box
				String master = ((uiRotWord.getSentText().length() > 0)) ?
						(uiRotWord.getSentText()) :
							(uiRotWord.getPromptText());
				if (uiRotWord.getNum1Text().length() > 0) {
					String temp = uiRotWord.getNum1Text();
					int xtra = Integer.parseInt(temp);
					// check second extra number box
					if (uiRotWord.getNum2Text().length() > 0) {
						String temp2 = uiRotWord.getNum2Text();
						int xtra2 = Integer.parseInt(temp2);
						enc = rotateByWord(master, uiRotWord.getKeyText(), xtra, xtra2);
					}
					else {
						enc = rotateByWord(master, uiRotWord.getKeyText(), xtra);
					}
				}				
				else {
					enc = rotateByWord(master, uiRotWord.getKeyText());
				}
				uiRotWord.setPrompt(enc);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
					
		// decrypt button
		if (event.getSource() == uiRotWord.decrypt) {
			try {
				String enc = "";
				// tries sentence text box first, if not tries prompt text box
				String master = ((uiRotWord.getSentText().length() > 0)) ?
						(uiRotWord.getSentText()) :
							(uiRotWord.getPromptText());
				if (uiRotWord.getNum1Text().length() > 0) {
					String temp = uiRotWord.getNum1Text();
					int xtra = Integer.parseInt(temp);
					// check second extra number box
					if (uiRotWord.getNum2Text().length() > 0) {
						String temp2 = uiRotWord.getNum2Text();
						int xtra2 = Integer.parseInt(temp2);
						enc = unrotateByWord(master, uiRotWord.getKeyText(), xtra, xtra2);
					}
					else {
						enc = unrotateByWord(master, uiRotWord.getKeyText(), xtra);
					}
				}				
				else {
					enc = unrotateByWord(master, uiRotWord.getKeyText());
				}
				uiRotWord.setPrompt(enc);				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,  e.getMessage());
			}
		}
							
		// exit button
		if (event.getSource() == uiRotWord.exit) {
			System.exit(0);
		}	
		
	}
}
