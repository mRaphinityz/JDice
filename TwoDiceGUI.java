// GUI based version of the Chapter 4 TwocDice application


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TwoDiceGUI extends JFrame implements ActionListener
{

	// graphic components for this class
	Font mainFont = new Font("Impact", Font.PLAIN, 28);
	JLabel title = new JLabel("Two Dice Game");
	JLabel dieRoll1 = new JLabel("Player's die roll is: ");
	JTextField dieField1 = new JTextField(3);
	JLabel dieRoll2 = new JLabel("Computer's die roll is: ");
	JTextField dieField2 = new JTextField(3);
	JLabel result = new JLabel("");
	JButton button = new JButton("Click to Play");

	// constructor method for this class
	public TwoDiceGUI()
	{
		super("Two Dice App");
		setBounds(600, 450, 300, 200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		// add graphics to the frame
		add(title);
		add(dieRoll1);
		add(dieField1);
		add(dieRoll2);
		add(dieField2);
		add(result);
		add(button);

		// add action listener to the button component
		button.addActionListener(this);

		setVisible(true);
	}

	// event handling method
	@Override
	
	public void actionPerformed(ActionEvent event)
	{
		// create two Die object
		Die playerDie = new Die();
		Die comDie = new Die();

		// output the values of the Die objects to the fields in the GUI
		dieField1.setText("" + playerDie.getDieValue());
		dieField2.setText("" + comDie.getDieValue());

		// Decide what the outcome of the game should be
		// set the text of the result label accordingly
		if(playerDie.getDieValue() > comDie.getDieValue())
		{
			result.setText("You have won the game!");
		}
		else
		{
			if(playerDie.getDieValue() < comDie.getDieValue())
			{
				result.setText("You have lost the game!");
			}
		}
		if(playerDie.getDieValue() == comDie.getDieValue())
			{
				result.setText("We have a Draw!");
			}
	}



	public static void main(String[] args)
	{
		TwoDiceGUI aFrame = new TwoDiceGUI();
	}
}