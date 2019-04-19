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
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\APCSA\\Unit 16\\Unit16-Assignments-pixLab\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
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
    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}