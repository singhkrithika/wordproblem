
/**
 * Write a description of class MPG here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MPG
{
    // instance variables - replace the example below with your own
    int myStartMiles;
    int myEndMiles;
    double myGallonsUsed;

    /**
     * Constructor for objects of class MPG
     */
    public MPG(int odometerReading)
    {
        myStartMiles = odometerReading;
    }

    public double calculateMPG()
    {
        return (myEndMiles - myStartMiles)/myGallonsUsed;
    }
    
    public void fillUp(int odometerReading, double gallons)
    {
        myGallonsUsed = gallons;
        myEndMiles = odometerReading;
    }
    
    public void resetMPG()
    {
        myGallonsUsed = 0;
        myStartMiles = myEndMiles;
    }
}
