//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Tile extends Block
{
   //instance variables
   private boolean visible;
   private String name;

   public Tile()
   {
		super();
		setWidth(80);
		setHeight(40);
		setColor(Color.WHITE);
   }
   
   //add the other Paddle constructors

   public Tile(int x, int y)
   {
		super(x,y);
		setColor(Color.WHITE);
   }
   
   public Tile(int x, int y, int w)
   {
		super(x,y, w);
		setColor(Color.WHITE);
   }
   
   
   public Tile(int x, int y, int wd, int ht)
   {
		super(x,y,wd,ht);
		setColor(Color.WHITE);
   }
   
   public Tile(int x, int y, int wd, int ht, Color col)
   {
		super(x,y,wd,ht,col);
   }
   
   public void setName(String newName) {
	   name = newName;
   }
   
   public String getName() {
	   return name;
   }
   
   public void setVisible(boolean isVis) {
	   visible = isVis;
   }
   
   public boolean getVisible() {
	   return visible;
   }
   
}