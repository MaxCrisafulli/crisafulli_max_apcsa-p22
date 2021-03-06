//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(0);
		setY(0);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y) {
		setX(x);
		setY(y);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);

	}
	
	public Block(int x, int y, int wd) {
		setX(x);
		setY(y);
		setWidth(wd);
		setHeight(10);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int wd, int ht) {
		setX(x);
		setY(y);
		setWidth(wd);
		setHeight(ht);
		setColor(Color.BLACK);

	}
	
	public Block(int x, int y, int wd, int ht, Color col) {
		setX(x);
		setY(y);
		setWidth(wd);
		setHeight(ht);
		setColor(col);
	}
	
	
   //add the other set methods

    public void setColor(Color col)
    {
   	    color = col;
    }
   
   public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}

	//add the other get methods
	
	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	} 

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	
	public Color getColor() {
		return color;
	}

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
   
	public boolean equals(Block obj)
	{
		if (getX() == obj.getX() && getY() == obj.getY() && getWidth() == obj.getWidth() && getHeight() == obj.getHeight() && getColor() == obj.getColor()){
			return true;
		}
		return false;
	}
    

   //add a toString() method  - x , y , width, height, color
	
	public String toString() {
		String output = "";
		output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor(); 
		return output;
	}
}