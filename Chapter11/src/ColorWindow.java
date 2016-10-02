/*This class demonstrates how to set the background color of a panel and the foreground color of a label*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ColorWindow extends JFrame {
	private JPanel panel;
	private JLabel messageLabel;
	private JButton redButton;
	private JButton blueButton;
	private JButton yellowButton;
	private final int WINDOW_WIDTH=220;
	private final int WINDOW_HEIGHT=100;
	
	public ColorWindow()
	{
		//call the JFram constructor to setup the title.
		super("Colors");
		
		//Set the size of the window.
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		//Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Build the panel and add it to the frame.
		buildPanel();
		
		//add the panel to the frame`s content pane;
		add(panel);
		
		//Display the window.
		setVisible(true);
	}
	
	private void buildPanel()
	{
		//create the label, text field, and button components.
		messageLabel = new JLabel("Click a button to select a color");
		
		redButton = new JButton("Red");
		blueButton = new JButton("Blue");
		yellowButton = new JButton("Yellow");
		
		//Add an action listener to the button
		redButton.addActionListener(new RedButtonListener());
		blueButton.addActionListener(new BlueButtonListener());
		yellowButton.addActionListener(new YellowButtonListener());
		
		//create a panel to hold the components.
		
		panel =new JPanel();
		panel.add(messageLabel);
		panel.add(redButton);
		panel.add(blueButton);
		panel.add(yellowButton);
	}
	
	private class RedButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			panel.setBackground(Color.RED);
			messageLabel.setForeground(Color.BLUE);
		}
	}
	
	private class BlueButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			panel.setBackground(Color.BLUE);
			messageLabel.setForeground(Color.YELLOW);
		}
	}
	
	private class YellowButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			panel.setBackground(Color.YELLOW);
			messageLabel.setForeground(Color.BLACK);
		}
	}
}
