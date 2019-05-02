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
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Breakout extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;
	private ArrayList<Block> blocks;
	private int level;

	public Breakout()
	{
		//set up all variables related to the game
		ball = new Ball(350,250,10,10,Color.WHITE,3, 3);
		paddle = new Paddle(400,400,40,40,Color.WHITE,2);
		keys = new boolean[4];
		blocks = new ArrayList<Block>();
		level  = 1;
		
		//top side blocks
		for (int i = 5; i<750; i+= 85) {
			for (int j = 5; j < 90; j+= 45) {
				blocks.add(new Block(i,j , 80, 40, Color.RED));
			}
		}

		//bottom side blocks
		for (int i = 5; i<750; i+= 85) {
			for (int j = 680; j < 750; j+= 45) {
				blocks.add(new Block(i,j , 80, 40, Color.BLUE));
			}
		}
		
		//left side blocks
		for (int j = 95; j < 660; j+= 45) {
			for (int i = 5; i<175; i+= 85) {
				blocks.add(new Block(i,j , 80, 40, Color.GREEN));
			}
		}

		//right side blocks
		for (int j = 95; j < 660; j+= 45) {
			for (int i = 600; i<750; i+= 85) {
				blocks.add(new Block(i,j , 80, 40, Color.YELLOW));
			}
		}

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
		paddle.draw(graphToBack);
		for (Block block : blocks) {
			block.draw(graphToBack);
		}
		graphToBack.setColor(Color.WHITE);
		graphToBack.setFont(new Font("Helvetica", Font.PLAIN, 25));
		graphToBack.drawString("Level. " + Integer.toString(level),400,360);


		//LEVEL CHANGE
		if (blocks.size() == 0) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			level++;
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(400,290,75,75);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString(Integer.toString(level),400,360);
			graphToBack.setColor(Color.BLACK);
			//top side blocks
			for (int i = 5; i<750; i+= 85) {
				for (int j = 5; j < 90; j+= 45) {
					blocks.add(new Block(i,j , 80, 40, Color.RED));
				}
			}

			//bottom side blocks
			for (int i = 5; i<750; i+= 85) {
				for (int j = 680; j < 750; j+= 45) {
					blocks.add(new Block(i,j , 80, 40, Color.BLUE));
				}
			}
			
			//left side blocks
			for (int j = 95; j < 660; j+= 45) {
				for (int i = 5; i<175; i+= 85) {
					blocks.add(new Block(i,j , 80, 40, Color.GREEN));
				}
			}

			//right side blocks
			for (int j = 95; j < 660; j+= 45) {
				for (int i = 600; i<750; i+= 85) {
					blocks.add(new Block(i,j , 80, 40, Color.YELLOW));
				}
			}
			for (Block block : blocks) {
				block.draw(graphToBack);
			}
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(ball.getX(),ball.getY(),10,10);
			ball = null;
			ball = new Ball(350,250,10,10,Color.WHITE,3, 3);
		}
		
		
		//TOP OR BOTTOM WALL
		
		if (didCollideTop() || didCollideBottom()) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		//LEFT OR RIGHT WALL
		
		if (didCollideRight() || didCollideLeft()) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		//LEFT PADDLE COLLISION
		
		if (lCollide(paddle)) {
			ball.setYSpeed(ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//RIGHT PADDLE COLLISION
		
		if (rCollide(paddle)) {
			ball.setYSpeed(ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
		} 
		
		//TOP PADDLE COLLISION
		
		if (tCollide(paddle)) {
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(ball.getXSpeed());
		} 
		
		//BOTTOM PADDLE COLLISION
		
		if (bCollide(paddle)) {
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(ball.getXSpeed());
		} 
		
		for (Block block : blocks) {
			if (lCollide(block) || rCollide(block)) {
				block.draw(graphToBack, Color.BLACK);
				blocks.remove(block);
				//level++;
				//graphToBack.setColor(Color.BLACK);
				//graphToBack.fillRect(400,290,75,75);
				//graphToBack.setColor(Color.WHITE);
				//graphToBack.drawString(Integer.toString(level),400,360);
				//graphToBack.setColor(Color.BLACK);
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		
		for (Block block : blocks) {
			if (tCollide(block) || bCollide(block)) {
				block.draw(graphToBack, Color.BLACK);
				blocks.remove(block);
				ball.setYSpeed(-ball.getYSpeed());
			}
		}
		
		//PADDLE CONTROL

		if(keys[0] == true)
		{
			paddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			paddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			paddle.moveDownAndDraw(graphToBack);
			
		}
		if(keys[3] == true)
		{
				paddle.moveRightAndDraw(graphToBack);
		}
		

		twoDGraph.drawImage(back, null, 0, 0);
	}
   
   //EDGE COLLISION METHODS


	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'A' : keys[1]=true; break;
			case 'S' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'A' : keys[1]=false; break;
			case 'S' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
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
	   if (ball.getX() > 760 ) {
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
	   if (ball.getY() > 760 ) {
		   return true;
	   }
	   return false;
   }
   
   
   //X AND Y ARE IN TOP LEFT AND DRAWS RIGHT AND DOWN!!!
   public boolean lCollide(Block n){
	   if(ball.getX() + 2*ball.getXSpeed() >= n.getX() && ball.getX() < n.getX() + n.getWidth() /2 && ball.getY() >= n.getY() && ball.getY() <=  n.getY() + n.getHeight())
			return true;
	   else
		   return false;
   }
   
   public boolean rCollide (Block n){
	   if(ball.getX() + 2*ball.getXSpeed() <= n.getX() + n.getWidth() && ball.getX() >= n.getX() + n.getWidth()/2 && ball.getY() >= n.getY() && ball.getY() <=  n.getY() + n.getHeight())
			return true;
	   else
		   return false;
   }
   
   public boolean tCollide(Block n){
	   if(ball.getY() + 2*ball.getYSpeed() >= n.getY() && ball.getY() <= n.getY() + n.getHeight()/2 && ball.getX() >= n.getX() && ball.getX() <=  n.getX() + n.getWidth())
			return true;
	   else
		   return false;
   }
   
   public boolean bCollide(Block n){
	   if(ball.getY() + 2*ball.getYSpeed() <= n.getY() + n.getHeight() && ball.getY() >= n.getY() + n.getHeight()/2 && ball.getX() >= n.getX() && ball.getX() <=  n.getX() + n.getWidth())
			return true;
	   else
		   return false;
   }
   
   //RANDOM SPEED GENERATOR FOR -3 TO 3 EXCLUDING -1, 0, AND 1
   
   public int rand() {
	   int output = (int)(Math.random()*7) -3;	
	   if (output >= -1 && output <= 1) {
		   return 2;
	   }
	   else {
		   return output;
	   }
   }
   
   

}