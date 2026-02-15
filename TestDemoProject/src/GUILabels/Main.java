package GUILabels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// JLabel - a GUI display area for a string of text, an image or both
		
		ImageIcon image = new ImageIcon("133311513.png");
		Border border = BorderFactory.createLineBorder(Color.black,3);
		
		JLabel label = new JLabel();
		label.setText("Do you even sleep?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text position left, center, right of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text position top, center, bottom of imageicon
		label.setForeground(new Color(0,0,0)); // color of text
		label.setFont(new Font("Mv Boli", Font.BOLD,50));
		label.setIconTextGap(-25); //gap of text to image
		label.setOpaque(true); //display background color
		label.setBorder(border); //border of label //not image+text
		label.setVerticalAlignment(JLabel.CENTER); //vertical position of icon/text within label
		label.setHorizontalAlignment(JLabel.CENTER); //horizontal position of icon/text within label
//		label.setBounds(50, 50, 400, 400);
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500,500);
//		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.setIconImage(image.getImage());
		frame.pack();
		

	}

}
