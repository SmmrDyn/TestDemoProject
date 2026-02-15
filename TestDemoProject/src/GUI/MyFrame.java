package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame() {
		
		this.setTitle("Frame Title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setSize(420,420); // set dimensions
		this.setResizable(false); // prevents to be resized
		this.setVisible(true); //visible
		
		ImageIcon image = new ImageIcon("133311513.png"); //imageicon
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(255,240,230));// background color
	}
}
