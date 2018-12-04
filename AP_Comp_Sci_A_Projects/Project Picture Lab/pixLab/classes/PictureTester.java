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
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    // Method to test keepOnlyBlue
    public static void testKeepOnlyBlue()
    {
        Picture victor_YuriOnIce = new Picture("0_myPic_Victor_YURI-ON-ICE.jpg");
        victor_YuriOnIce.explore();
        victor_YuriOnIce.keepOnlyBlue();
        victor_YuriOnIce.explore();
    }

    // Method to test keepOnlyRed
    public static void testKeepOnlyRed()
    {
        Picture victor_YuriOnIce = new Picture("0_myPic_Victor_YURI-ON-ICE.jpg");
        victor_YuriOnIce.explore();
        victor_YuriOnIce.keepOnlyRed();
        victor_YuriOnIce.explore();
    }

    // Method to test keepOnlyGreen
    public static void testKeepOnlyGreen()
    {
        Picture victor_YuriOnIce = new Picture("0_myPic_Victor_YURI-ON-ICE.jpg");
        victor_YuriOnIce.explore();
        victor_YuriOnIce.keepOnlyGreen();
        victor_YuriOnIce.explore();
    }

    // Method to test negate
    public static void testNegate()
    {
        Picture victor_YuriOnIce = new Picture("0_myPic_Victor_YURI-ON-ICE.jpg");
        victor_YuriOnIce.explore();
        victor_YuriOnIce.negate();
        victor_YuriOnIce.explore();
    }

    // Method to test graysclae
    public static void testGrayscale()
    {
        Picture victor_YuriOnIce = new Picture("0_myPic_Victor_YURI-ON-ICE.jpg");
        victor_YuriOnIce.explore();
        victor_YuriOnIce.grayscale();
        victor_YuriOnIce.explore();
    }

    // Method to test fixunderwater
    public static void testFixUnderwater()
    {
        Picture water = new Picture("water.jpg");
        water.explore();
        water.fixUnderwater();
        water.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    // Method to test mirrorVerticalRightToLeft
    public static void testMirrorVerticalRightToLeft()
    {
        Picture mountain = new Picture("my_Mountain.jpg");
        mountain.explore();
        mountain.mirrorVerticalRightToLeft();
        mountain.explore();
    }

    // method to test mirrorHorizontal
    public static void testMirrorHorizontal()
    {
        Picture mountain = new Picture("my_Mountain.jpg");
        mountain.explore();
        mountain.mirrorHorizontal();
        mountain.explore();
    }
    
    // Mehod to test mirrorHorizontalBotToTop
    public static void testMirrorHorizontalBotToTop()
    {
        Picture mountain = new Picture("my_Mountain.jpg");
        mountain.explore();
        mountain.mirrorHorizontalBotToTop();
        mountain.explore();
    }
    
    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }
    
    // Method to test mirrorArms
    public static void testMirrorArms()
    {
        Picture snowman = new Picture("snowman.jpg");
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }
    
    // Method to test mirrorGull
    public static void testMirrorGull()
    {
        Picture seagull = new Picture("seagull.jpg");
        seagull.explore();
        seagull.mirrorGull();
        seagull.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }
    
    public static void testCopyME()
    {
        Picture canvas = new Picture("swan.jpg");
        canvas.copyME();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
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
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorVerticalRightToLeft();
        //testMirrorHorizontal();
        //testMirrorHorizontalBotToTop();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        testCopyME();
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