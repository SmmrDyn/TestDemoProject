package GUIJOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something
		
//		JOptionPane.showMessageDialog(null, "This is plain", "Title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is info", "Title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is question", "Title", JOptionPane.QUESTION_MESSAGE);
//		while(true) {
			
//		JOptionPane.showMessageDialog(null, "This is warning", "Title", JOptionPane.WARNING_MESSAGE);
//		}
		
//		JOptionPane.showMessageDialog(null, "This is error", "Title", JOptionPane.ERROR_MESSAGE);
		
		
//		int answer = JOptionPane.showConfirmDialog(null, "do you code", "title", JOptionPane.YES_NO_CANCEL_OPTION);
//		String name = JOptionPane.showInputDialog("What is your name: ");
//		System.out.println("Hello" + name);
		
		String[] responses = {"No(Maybe?)", "Yes"}; 
		ImageIcon icon = new ImageIcon("133311513.png");

		JOptionPane.showOptionDialog(null, "Sleepy", "Secret", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
	}

}
