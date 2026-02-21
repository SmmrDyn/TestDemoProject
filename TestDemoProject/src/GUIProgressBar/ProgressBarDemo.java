package GUIProgressBar;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,500); //empty
	
	ProgressBarDemo() {
		
		bar.setValue(0);
		bar.setBounds(0, 0, 400, 50);
		bar.setStringPainted(true);
		bar.setFont(new Font("Poppins",Font.BOLD,20));
		bar.setForeground(Color.DARK_GRAY);
		bar.setBackground(Color.LIGHT_GRAY);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
		
	}
	
	public void fill() {
		int counter = 500;
		
		while(counter>0) {
			//counter<=100
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter -= 1;
			//counter += 1;
		}
		bar.setString("Done!");
	}

}
