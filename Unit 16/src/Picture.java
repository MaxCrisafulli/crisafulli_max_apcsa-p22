import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to set R and G to 0 */
  public void KeepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  /** Method to set G and B to 0 */
  public void KeepOnlyRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  /** Method to set R and B to 0 */
  public void KeepOnlyGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Negates the image */
  public void Negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255-pixelObj.getRed());
        pixelObj.setBlue(255-pixelObj.getBlue());
        pixelObj.setGreen(255-pixelObj.getGreen());
      }
    }
  }
  
  /** Sets the image to GrayScale */
  public void Grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int average = (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3;
        pixelObj.setRed(average);
        pixelObj.setBlue(average);
        pixelObj.setGreen(average);
      }
    }
  }
  
  /** Fixes the water.jpg */
  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	pixelObj.setBlue(pixelObj.getBlue()*5-637);
    	pixelObj.setRed(pixelObj.getRed()*5-637);
    	pixelObj.setGreen(pixelObj.getGreen()*5-637);
      }
    }
  }
  
  
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
   * vertical mirror in the center of the picture
   * from left to right */
 public void mirrorVerticalRightToLeft()
 {
   Pixel[][] pixels = this.getPixels2D();
   Pixel leftPixel = null;
   Pixel rightPixel = null;
   int width = pixels[0].length;
   for (int row = 0; row < pixels.length; row++)
   {
     for (int col = 0; col < width / 2; col++)
     {
       leftPixel = pixels[row][col];
       rightPixel = pixels[row][width - 1 - col];
       leftPixel.setColor(rightPixel.getColor());
     }
   } 
 }
  

 
 /** Method that mirrors horizontally */
public void mirrorHorizontal()
{
  Pixel[][] pixels = this.getPixels2D();
  Pixel topPixel = null;
  Pixel bottomPixel = null;
  int width = pixels[0].length;
  for (int col = 0; col < width; col++)

  {
    for (int row = 0; row < pixels.length/2 -1; row++)
    {
      topPixel = pixels[row][col];
      bottomPixel = pixels[pixels.length-row-1][col];
      bottomPixel.setColor(topPixel.getColor());
    }
  } 
}

/** Method that mirrors horizontally BTT */
public void mirrorHorizontalBotToTop()
{
 Pixel[][] pixels = this.getPixels2D();
 Pixel topPixel = null;
 Pixel bottomPixel = null;
 int width = pixels[0].length;
 for (int col = 0; col < width; col++)

 {
   for (int row = 0; row < pixels.length/2 -1; row++)
   {
     topPixel = pixels[row][col];
     bottomPixel = pixels[pixels.length-row-1][col];
     topPixel.setColor(bottomPixel.getColor());
   }
 } 
}

/** Method that mirrors diagonally */
	public void mirrorDiagonal() {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		
		//loop through the rows
		for (int row = 0; row < 480; row++) {
			//loops through the column
			for (int col = 0 ; col < 480; col++) {
				leftPixel = pixels[col][row];
				rightPixel = pixels[row][col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}




  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** Mirror just part of arms */
  public void mirrorArms()
  {
	int mirrorrow = 194;
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    for (int col = 105; col < 294; col++)

    {
      for (int row = mirrorrow; row > 162; row--)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[mirrorrow - row + mirrorrow][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  /** Mirror gull to right so there is 2 seagulls on the beach */
  public void mirrorGull()
  {
    int mirrorPoint = 343;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 233; row < 319; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 237; col < 343; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy2(Picture fromPic, int startRow, int startCol, int endRow, int endCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < endRow &&
         toRow < endRow; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < endCol &&
           toCol < endCol;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }


  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
    Picture flower2 = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\640x480.jpg");
  }
  
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  /** Method to show large changes in color 
   * @param edgeDist the distance for finding edges
   * WITH A A TOP BOTTOM LOOP
   */
 public void edgeDetection2(int edgeDist)
 {
   Pixel leftPixel = null;
   Pixel rightPixel = null;
   Pixel topPixel = null;
   Pixel bottomPixel = null;
   Pixel[][] pixels = this.getPixels2D();
   Color rightColor = null;
   Color topColor = null;
   for (int row = 0; row < pixels.length-1; row++)
   {
	   
     for (int col = 0; 
          col < pixels[0].length-1; col++)
     {
       leftPixel = pixels[row][col];
       rightPixel = pixels[row][col+1];
       rightColor = rightPixel.getColor();
       bottomPixel = pixels[row][col];
       topPixel = pixels[row+1][col];
       topColor = topPixel.getColor();
       if (leftPixel.colorDistance(rightColor) > 
           edgeDist && bottomPixel.colorDistance(topColor) > edgeDist) {
         leftPixel.setColor(Color.BLACK);
         bottomPixel.setColor(Color.BLACK);
       }
       else {
    	  bottomPixel.setColor(Color.WHITE);
    	 leftPixel.setColor(Color.WHITE);
       }
     }
   }
   
 }
 
 
 
 
 
 
 
 
 public void encode(Picture msg)
 {
   Pixel[][] imgpixels = this.getPixels2D();
   Pixel[][] msgpixels = msg.getPixels2D();
   Boolean[][] msglocs = new Boolean[msgpixels.length][msgpixels[0].length];
   
   
   //generates a boolean matrix of message pixel locations
   for (int i = 0; i < msgpixels.length; i++) {
	   for (int j = 0; j < msgpixels[i].length;j++) {
		   if (msgpixels[i][j].getRed() > 200 && msgpixels[i][j].getBlue() > 200 && msgpixels[i][j].getGreen() > 200) { 
			   msglocs[i][j] = false;
		   }
		   else {
			   msglocs[i][j] = true;
		   }
	   }
   }
   //changes the pixels at the message location
   for (int i = 0; i < imgpixels.length; i++) {
	   for (int j = 0; j < imgpixels[i].length;j++) {
		   if (msglocs[i][j] == true) { //if its the message it will set the final digit to odd prime numbers
			int rdig = imgpixels[i][j].getRed()%10;
		   	int gdig = imgpixels[i][j].getGreen()%10;
		   	int bdig = imgpixels[i][j].getBlue()%10;
		   	int rleft = imgpixels[i][j].getRed() - rdig;
		   	int gleft = imgpixels[i][j].getGreen() - gdig;
		   	int bleft = imgpixels[i][j].getBlue() - bdig;
		   	while (!isOP(rdig)) {
			   	rdig++;
		   	}
		   	while (!isOP(gdig)) {
			   	gdig++;
		   	}
		   	while (!isOP(bdig)) {
			   	bdig++;
		   	}
		   	imgpixels[i][j].setRed(rdig + rleft);
		   	imgpixels[i][j].setGreen(gdig + gleft);
		   	imgpixels[i][j].setBlue(bdig + bleft);
		   }
		   else {
				int rdig = imgpixels[i][j].getRed()%10;
			   	int gdig = imgpixels[i][j].getGreen()%10;
			   	int bdig = imgpixels[i][j].getBlue()%10;
			   	int rleft = imgpixels[i][j].getRed() - rdig;
			   	int gleft = imgpixels[i][j].getGreen() - gdig;
			   	int bleft = imgpixels[i][j].getBlue() - bdig;
			   	while (isOP(rdig)) {
				   	rdig++;
			   	}
			   	while (isOP(gdig)) {
				   	gdig++;
			   	}
			   	while (isOP(bdig)) {
				   	bdig++;
			   	}
			   	imgpixels[i][j].setRed(rdig + rleft);
			   	imgpixels[i][j].setGreen(gdig + gleft);
			   	imgpixels[i][j].setBlue(bdig + bleft);
		   }
		   if (i < 10 && j > 600) {
			   imgpixels[i][j].setColor(Color.YELLOW);
		   }
	   }
   }
 }

 //small method to check prime number
 boolean isPrime(int n) {
     if (n%2==0) return false;
     for(int i=3;i*i<=n;i+=2) {
         if(n%i==0)
             return false;
     }
     return true;
 }
 
 //small method to check if a message number
 boolean isOP(int n) {
     if (isPrime(n) && n%2 != 0) {
    	 return true;
     }
     return false;
 }
	 
 public void decode()
 {
   Pixel[][] imgpixels = this.getPixels2D();
   for (int i = 0; i < imgpixels.length; i++) {
	   for (int j = 0; j < imgpixels[i].length;j++) {
		   int rdig = imgpixels[i][j].getRed()%10;
		   int gdig = imgpixels[i][j].getGreen()%10;
		   int bdig = imgpixels[i][j].getBlue()%10;
		   if (isOP(rdig) && isOP(gdig) && isOP(bdig)) {
			   imgpixels[i][j].setColor(Color.BLACK);  
		   }
		   else {
			  imgpixels[i][j].setColor(Color.WHITE); 
		   }
	   }
   	 }
   }
   
 
 
 
 
 
 
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
