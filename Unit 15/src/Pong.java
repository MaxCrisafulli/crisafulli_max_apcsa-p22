//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int lscore, rscore;


	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(350,250,10,10,Color.WHITE,(int)Math.floor(3*Math.random())-3,(int)Math.floor(3*Math.random())-3);
		leftPaddle = new Paddle(20,200,10,40,Color.WHITE,2);
		rightPaddle = new Paddle(760,200,10,40,Color.WHITE,2);
		keys = new boolean[4];
		lscore = 0;
		rscore = 0;

    
    	setBackground(Color.BLACK);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
	   
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.setColor(Color.WHITE);
		graphToBack.setFont(new Font("Helvetica", Font.PLAIN, 15));
		graphToBack.drawString(Integer.toString(lscore),15,25);
		graphToBack.drawString(Integer.toString(rscore),765,25);


		//RIGHT WALL
		
		if (didCollideRight()) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			lscore++;
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(0,0,50,50);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString(Integer.toString(lscore),15,25);
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(ball.getX(),ball.getY(),10,10);
			ball = null;
			ball = new Ball(350,250,10,10,Color.WHITE,(int)Math.floor(3*Math.random())-3,(int)Math.floor(3*Math.random())-3);
		}
		
		
		//LEFT WALL
		if (didCollideLeft()) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			rscore++;
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(750,0,50,50);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString(Integer.toString(rscore),765,25);
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(ball.getX(),ball.getY(),10,10);
			ball = null;
			ball = new Ball(350,250,10,10,Color.WHITE,(int)Math.floor(3*Math.random())-3,(int)Math.floor(3*Math.random())-3);
		}
		
		
		//TOP OR BOTTOM WALL
		
		if (didCollideTop() || didCollideBottom()) {
			ball.setYSpeed(-ball.getYSpeed());
		}

		//LEFT PADDLE
		
		if (didLCollidePaddle(leftPaddle)) {
			ball.setYSpeed(ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//RIGHT PADDLE
		
		if (didRCollidePaddle(rightPaddle)) {
			ball.setYSpeed(ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//PADDLE CONTROL

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
			
		}
		if(keys[3] == true)
		{
				rightPaddle.moveUpAndDraw(graphToBack);
		}
		

		twoDGraph.drawImage(back, null, 0, 0);
	}
   
   //EDGE COLLISION METHODS


	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[1]=true; break;
			case 'Z' : keys[0]=true; break;
			case 'I' : keys[3]=true; break;
			case 'M' : keys[2]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[1]=false; break;
			case 'Z' : keys[0]=false; break;
			case 'I' : keys[3]=false; break;
			case 'M' : keys[2]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}

   
	//COLLISION DETECTIONS
   public boolean didCollideLeft() {
	   if (ball.getX() < 1 ) {
		   return true;
	   }
	   return false;
   }
   
   public boolean didCollideRight() {
	   if (ball.getX() > 780 ) {
		   return true;
	   }
	   return false;
   }

   public boolean didCollideTop() {
	   if (ball.getY() < 1 ) {
		   return true;
	   }
	   return false;
   }

   public boolean didCollideBottom() {
	   if (ball.getY() > 550 ) {
		   return true;
	   }
	   return false;
   }
   
   public boolean didLCollidePaddle(Paddle n){
	   if(ball.getY() >= n.getY() && ball.getY() <= (n.getY()+n.getHeight()) && ball.getX() <= n.getX() + n.getWidth())
			return true;
	   else
		   return false;
   }
   
   public boolean didRCollidePaddle(Paddle n){
	   if(ball.getY() >= n.getY() && ball.getY() <= (n.getY()+n.getHeight()) && ball.getX() >= n.getX()- n.getWidth())
			return true;
	   else
		   return false;
   }

}