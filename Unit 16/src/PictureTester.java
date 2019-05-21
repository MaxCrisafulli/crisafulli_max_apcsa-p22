/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test KeepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.KeepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test KeepOnlyRed */
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.KeepOnlyRed();
    beach.explore();
  }
  
  /** Method to test KeepOnlyGreen */
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.KeepOnlyGreen();
    beach.explore();
  }
  
  /** Method to test Negate */
  public static void testNegate()
  {
    Picture beach = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.Negate();
    beach.explore();
  }
  
  /** Method to test GrayScale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.Grayscale();
    beach.explore();
  }
  
  /** Method to test GrayScale */
  public static void testfixUnderwater()
  {
    Picture beach = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorHoriztonal */
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  /** Method to test mirrorHoriztonalBTT */
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  /** Method to test diagonally */
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  /** Method to test mirrorGull */
  public static void testMirrorGull()
  {
    Picture gull = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }

  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  
  /** Method to test the copy2 method */
  public static void testCopy()
  {
	Picture flower1 = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
    Picture canvas = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\640x480.jpg");
    canvas.copy2(flower1 ,0,0,50,50);
    canvas.copy2(flower1 ,50,0,100,50);
    canvas.explore();
  }

  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test edgeDetection2 */
  public static void exttest()
  {
    
	Picture beach = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    Picture msg = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\msg.jpg");
    msg.explore();
    beach.explore();
    beach.encode(msg);
    beach.explore();
    beach.decode();
    beach.explore();
  }
  
  //make a testing method for encoding
  //display original image (beach)
  //display message
  //display encoded
  //display decoded
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testfixUnderwater(); 
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();  
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();                //DONT HAVE TO DO ANYTHING AFTER THIS
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	exttest();
  }
}