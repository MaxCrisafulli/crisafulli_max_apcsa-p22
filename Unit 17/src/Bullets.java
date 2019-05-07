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

	public List<Ammo> getList()
	{
		return ammo;
	}
	
	public Ammo get(int i) {
		return ammo.get(i);
	}

	public String toString()
	{
		return "";
	}
}
