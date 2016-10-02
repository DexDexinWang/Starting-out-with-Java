import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuWindow extends JFrame{
	private JLabel messageLabel;
	private final int LABEL_WIDTH=400;
	private final int LABEL_HEIGHT=200;
	
	//The following variables will reference menu components
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu textMenu;
	private JMenuItem exitItem;
	private JRadioButtonMenuItem blackItem;
	private JRadioButtonMenuItem redItem;
	private JRadioButtonMenuItem blueItem;
	private JCheckBoxMenuItem visibleItem;
	
	//constructor
	public MenuWindow()
	{
		//call the JFram constructor to setup the title.
		super("Eample Menu System");
		
		//Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Build the panel and add it to the frame.
		buildPanel();
		
		
		//Display the window.
		pack();
		setVisible(true);
	}
	
	private void buildPanel()
	{
		//create messageLabel label and set its size and color
		messageLabel =new JLabel("Use the Text menu to change my color and make me invisible.",SwingConstants.CENTER);
		messageLabel.setPreferredSize(new Dimension(LABEL_WIDTH,LABEL_HEIGHT));
		messageLabel.setForeground(Color.BLACK);
		add(messageLabel);
		buildMenuBar();
	}
	
	private void buildMenuBar()
	{
		//create the menu bar
		menuBar =new JMenuBar();
		
		//Create the file and text menus
		buildFielMenu();
		buildTextMenu();
		
		menuBar.add(fileMenu);
		menuBar.add(textMenu);
		
		//set the window`s menu bar.
		setJMenuBar(menuBar);
	}
	
	private void buildFielMenu()
	{
		//Create an Exit menu item.
		exitItem = new JMenuItem("Exit");
		//A mnemonic is a key on the keyboard that you press in combination with the Alt key to quickly access a component such as a button.
		//ATL+X
		exitItem.setMnemonic(KeyEvent.VK_X);
		exitItem.addActionListener(new ExitListener());
		
		//create a JMenu object for the File menu
		fileMenu =new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		//Add the Exit menu item to the File menu
		fileMenu.add(exitItem);
	}
	
	private void buildTextMenu()
	{
		//create the radio button menu items to change the color of the tetxt. add an action listener to each one.
		blackItem = new JRadioButtonMenuItem("Black",true);
		blackItem.setMnemonic(KeyEvent.VK_B);
		blackItem.addActionListener(new ColorListener());
		
		redItem = new JRadioButtonMenuItem("Red",true);
		redItem.setMnemonic(KeyEvent.VK_R);
		redItem.addActionListener(new ColorListener());
		
		blueItem = new JRadioButtonMenuItem("Blue",true);
		blueItem.setMnemonic(KeyEvent.VK_U);
		blueItem.addActionListener(new ColorListener());
		
		ButtonGroup group =new ButtonGroup();
		group.add(blackItem);
		group.add(redItem);
		group.add(blueItem);
		
		//Create a check box menu item to make the text
		visibleItem =new JCheckBoxMenuItem("Visible",true);
		visibleItem.setMnemonic(KeyEvent.VK_V);
		visibleItem.addActionListener(new VisibleListener());
		
		
		//Create a JMenu object for the Text menu.
		textMenu =new JMenu("Text");
		textMenu.setMnemonic(KeyEvent.VK_T);
		
		//add the menu items to the Text menu.
		textMenu.add(blackItem);
		textMenu.add(redItem);
		textMenu.add(blueItem);
		textMenu.addSeparator();//add a separator bar
		textMenu.add(visibleItem);
	}
	
	private class ExitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	private class ColorListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(blackItem.isSelected())
			{
				messageLabel.setForeground(Color.BLACK);
			}
			else if(redItem.isSelected())
			{
				messageLabel.setForeground(Color.RED);
			}
			else if(blueItem.isSelected())
			{
				messageLabel.setForeground(Color.BLUE);
			}
		}
	}
	
	private class VisibleListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(visibleItem.isSelected())
			{
				messageLabel.setVisible(true);
			}
			else
			{
				messageLabel.setVisible(false);
			}
		}
	}
}
