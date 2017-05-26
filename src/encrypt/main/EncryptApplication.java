package encrypt.main;

import encrypt.controller.MainController;

public class EncryptApplication {
	
	MainController mainC = new MainController();
	
	public EncryptApplication () {
		mainC.loadView();
	}
	
	public static void main(String[] args) {
		new EncryptApplication();
	}

}
