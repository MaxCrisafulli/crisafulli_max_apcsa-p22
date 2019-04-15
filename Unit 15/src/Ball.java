//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	   {
			super(x,y);
			xSpeed = 3;
			ySpeed = 1;
	   }
	   
	   
	   public Ball(int x, int y, int wd, int ht)
	   {
			super(x,y,wd,ht);
			xSpeed = 3;
			ySpeed = 1;
	   }
	   
	   public Ball(int x, int y, int wd, int ht, Color col)
	   {
			super(x,y,wd,ht,col);
			xSpeed = 3;
			ySpeed = 1;
	   }
	   
	   public Ball(int x, int y, int wd, int ht, int xspd, int yspd)
	   {
			super(x,y,wd,ht);
			xSpeed = xspd;
			ySpeed = yspd;
	   }
	   
	   public Ball(int x, int y, int wd, int ht, Color col, int xspd, int yspd)
	   {
			super(x,y,wd,ht,col);
			xSpeed = xspd;
			ySpeed = yspd;
	   }

   //add the set methods
   
	  public void setXSpeed(int xspd) {
		  xSpeed = xspd;
	  }
	   
	  public void setYSpeed(int yspd) {
		  ySpeed = yspd;
	  }
	    
   public void moveAndDraw(Graphics window)
   {
	  draw(window,Color.RED);
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
      draw(window);
   }
   
   
   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
   
   //equals method
   
	public boolean equals(Ball obj)
	{
		if (getXSpeed() == obj.getXSpeed() && getYSpeed() == obj.getYSpeed() && getX() == obj.getX() && getY() == obj.getY() && getWidth() == obj.getWidth() && getHeight() == obj.getHeight() && getColor() == obj.getColor()){
			return true;
		}
		return false;
	}   

   //add a toString() method
	public String toString() {
		 String output = "";
		 output += super.toString() + " " + getXSpeed() + " " +  getYSpeed();
		 return output;
	}
	
	
	
	
	
	
	
}