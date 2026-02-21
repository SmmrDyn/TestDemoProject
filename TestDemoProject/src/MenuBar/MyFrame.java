package MenuBar;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu ;
	JMenu helpMenu;
	JMenuItem load;
	JMenuItem save;
	JMenuItem exit;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("file.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		load = new JMenuItem("Load");
		save = new JMenuItem("Save");
		exit = new JMenuItem("Exit");
		
		load.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_D); // alt + d for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h for help
		load.setMnemonic(KeyEvent.VK_L); // l for load
		save.setMnemonic(KeyEvent.VK_S); // s for save
		exit.setMnemonic(KeyEvent.VK_E); // e for exit
		
		load.setIcon(loadIcon);
		save.setIcon(saveIcon);
		exit.setIcon(exitIcon);
		
		fileMenu.add(load);
		fileMenu.add(save);
		fileMenu.add(exit);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
				
		this.setJMenuBar(menuBar);
		this.setVisible(true);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==load) {
			System.out.println("Loading");
		}
		if(e.getSource()==save) {
			System.out.println("Saving");
		}
		if(e.getSource()==exit) {
			System.out.println("Exiting");
		}
		
	}

}
