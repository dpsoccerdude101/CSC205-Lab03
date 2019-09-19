/**
 * Write a description of class Circle here.
 *
 * @author (Dennis Pavlyuk & Kurt Mueller)
 * @version (9/12/19)
 */
public class Circle extends AbstractShape
{
    private double radius;
    protected static int numCirclesCreated = 0;

    public Circle(double rad) //constructor
    {
        radius = rad;
        incrementNumCirclesCreated();
        incrementNumShapesCreated();
    }

    public double area()
    {
        double area = Math.PI * radius * radius;
        return area;
    } 

    public double perimeter()
    {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double volume()
    {
        return 0.0;
    }

    public void incrementNumCirclesCreated()
    {
        numCirclesCreated++;
    }

    public void incrementNumShapesCreated()
    {
        numShapesCreated++;
    }

}
