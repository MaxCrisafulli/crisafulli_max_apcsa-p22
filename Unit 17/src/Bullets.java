//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}
	
	public void remove(Ammo al)
	{
		ammo.remove(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (Ammo b : ammo) {
			b.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Ammo b : ammo) {
			b.move("UP");
		}
	}

	public void cleanEmUp()
	{
		for (Ammo b : ammo) {
			b = null;
		}
	}
	
	public void cleanEmUp2()
	{
		for (int i = 1; i < ammo.size(); i++) {
			ammo.remove(i);
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}
	
	public Ammo get(int i) {
		return ammo.get(i);
	}
	
	public Ammo remove(int i) {
		return ammo.remove(i);
	}
	
	public String toString()
	{
		return "";
	}
}
