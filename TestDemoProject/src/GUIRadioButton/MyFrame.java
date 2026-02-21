package GUIRadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JRadioButton pizzaButton;
	JRadioButton burgerButton;
	JRadioButton hotdogButton;
	ImageIcon pizzaIcon;
	ImageIcon burgerIcon;
	ImageIcon hotdogIcon;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza.jpg");
		burgerIcon = new ImageIcon("burger.jpg");
		hotdogIcon = new ImageIcon("hotdog.jpg");		
		
		pizzaButton = new JRadioButton("pizza");
		burgerButton = new JRadioButton("burger");
		hotdogButton = new JRadioButton("hotdog");
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(hotdogButton);
		group.add(burgerButton);
		group.add(pizzaButton);
		
		pizzaButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		burgerButton.addActionListener(this);
		
		pizzaButton.setIcon(pizzaIcon);
		burgerButton.setIcon(burgerIcon);
		hotdogButton.setIcon(hotdogIcon);

		this.add(hotdogButton);
		this.add(burgerButton);
		this.add(pizzaButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizzaButton) {
			System.out.println("You choose pizza");
		} else if(e.getSource()==hotdogButton) {
			System.out.println("You choose hotdog");
		} else if(e.getSource()==burgerButton) {
			System.out.println("You choose burger");
		}
		
	}

}
