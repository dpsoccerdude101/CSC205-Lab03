/**
 * Abstract class AbstractShape - a skeleton for all of the shapes.
 *
 * @author (Kurt Mueller & Dennis Pavlyuk)
 * @version (9/12/2019)
/**
 * Rectangle is a child of AbstractShape and Shape.
 *
 * @author (Kurt Mueller & Dennis Pavlyuk)
 * @version (9/12/2019)
 */
public class Rectangle extends AbstractShape
{
    private double length;
    private double width; 
    protected static int numRectanglesCreated = 0;

    public Rectangle(double len, double wid) //constructor
    {
        length = len;
        width  = wid;
        incrementNumRectanglesCreated();
        incrementNumShapesCreated();
    }

    public double area()
    {
        double area = length * width;
        return area;
    } 

    public double perimeter()
    {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    public double volume()
    {
        return 0.0;
    }

    public void incrementNumRectanglesCreated()
    {
        numRectanglesCreated++;
    }

    public void incrementNumShapesCreated()
    {
        numShapesCreated++;
    }
}