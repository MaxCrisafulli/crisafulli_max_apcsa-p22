//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;
import java.awt.Component;

public class TheGame2 extends JFrame
{
	private static final int WIDTH = 785; //USE 785
	private static final int HEIGHT = 810;

	public TheGame2()
	{
		super("BREAKOUT");
		setSize(WIDTH,HEIGHT);

		Breakout game = new Breakout();

		((Component)game).setFocusable(true);
		getContentPane().add(game);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		TheGame2 run = new TheGame2();
	}
}