
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    private double x;
    private double y;
    private double width;
    private double height;
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(double x1, double y1, double width1, double height1)
    {
        x = x1;
        y = y1;
        height = height1;
        width = width1;
    }

    public double getPerimeter()
    {
        return (2 * height) + (2 * width);
    }
    
    public double getArea()
    {
        return height * width; 
    }
    
    public double gety()
    {
        return y; 
    }
    
    public void sety(double newy)
    {
        
    }
    
    public double getx()
    {
        return x; 
    }
    
    public void setx(double newx)
    {
        
    }
    
    public double getwidth()
    {
        return width; 
    }
    
    public void setwidth(double newwidth)
    {
        
    }  
    
    public double getheight()
    {
        return height; 
    }
    
    public void setheight(double newheight)
    {
      
    }
}    
