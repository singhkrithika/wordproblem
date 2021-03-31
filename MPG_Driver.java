
/**
 * Write a description of class MPG_Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MPG_Driver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MPG_Driver
     */
    public MPG_Driver()
    {
        // initialise instance variables
        x = 0;
    }
    
    public static void main (String[] args) 
    {
        MPG test_drive = new MPG(20);
        System.out.println("New car odometer reading: " + test_drive.myStartMiles);
        test_drive.fillUp(150,8);
        System.out.println("Miles per gallon: " + test_drive.calculateMPG());
        System.out.println("Miles per gallon: " + test_drive.calculateMPG());
        test_drive.resetMPG();
        test_drive.fillUp(350, 10);
        test_drive.fillUp(450, 20);
        System.out.println("Miles per gallon: " + test_drive.calculateMPG());
        test_drive.resetMPG();
        test_drive.fillUp(603, 25.5);
        System.out.println("Miles per gallon: " + test_drive.calculateMPG());
    }
}
