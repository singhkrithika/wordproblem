
/**
 * Write a description of class Rectangle_Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle_Driver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Rectangle_Driver
     */
    public Rectangle_Driver()
    {
        // initialise instance variables
        x = 0;
    }

    public static void main(String [] args)
    {
        Rectangle test = new Rectangle(1, 80, 3, 16);
        System.out.println("Area: " + test.getArea());
        System.out.println("Perimeter: " + test.getPerimeter());
    }
}
