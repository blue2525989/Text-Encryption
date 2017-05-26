package encrypt.model;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class MenuActions {
	
	 private JFileChooser fileChooser = new JFileChooser();
	 public JTextArea prompt = new JTextArea("", 50, 10);
	 public JMenuBar menuBar = new JMenuBar();
	 public JMenu fileMenu = menuBar.add(new JMenu("File"));
	    
	 public Action openAction = new openAction();
	 public Action saveAction = new saveAction();
	 public Action exitAction = new exitAction();
	 		
	public void setPromptBlank() {
		prompt.setText("");
	}
		
	public void setPrompt(String s) {
		prompt.setText(s);
	}
	
	public String getPromptText() {
		return prompt.getText();
	}
	
    @SuppressWarnings("serial")
	class openAction extends AbstractAction {
        
	    public openAction() {
	        super("Open file...");
	        putValue(MNEMONIC_KEY, new Integer('O'));
	    }
	    
	    public void actionPerformed(ActionEvent e) {
		    int retval = fileChooser.showOpenDialog(null); 
		    if (retval == JFileChooser.APPROVE_OPTION) {
		        File f = fileChooser.getSelectedFile();
		        try {
		            FileReader reader = new FileReader(f);
		            prompt.read(reader, "");
		        } catch (IOException ioex) {
		            JOptionPane.showMessageDialog(null, ioex);
		            System.exit(1);
		        }
		    }
	    }
    }

	@SuppressWarnings("serial")
	class saveAction extends AbstractAction {
	    
	    public saveAction() {
	        super("Save file...");
	        putValue(MNEMONIC_KEY, new Integer('S'));
	    }
	    
	    public void actionPerformed(ActionEvent e) {
	        int retval = fileChooser.showSaveDialog(null);
	        if (retval == JFileChooser.APPROVE_OPTION) {
	            File f = fileChooser.getSelectedFile();
	            try {
	                FileWriter write = new FileWriter(f);
	                prompt.write(write);
	            } catch (IOException ioex) {
	                JOptionPane.showMessageDialog(null, ioex);
	                System.exit(1);
	            }
	        }
	    }
	}
	
	@SuppressWarnings("serial")
	class exitAction extends AbstractAction {
	    
	    public exitAction() {
	    }
	    
	    public void actionPerformed(ActionEvent e) {
	        System.exit(0);
	    }
	}

}
