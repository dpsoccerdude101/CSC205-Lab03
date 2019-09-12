
/**
 * Write a description of class Sphere here.
 *
 * @author (Dennis Pavlyuk & Kurt Mueller)
 * @version (9/12/19)
 */
public class Sphere extends AbstractShape
{
    private double radius;
    private static int numSpheresCreated = 0;

    public Sphere(double rad) //constructor
    {
        radius = rad;
        incrementNumSpheresCreated();
        incrementNumShapesCreated();
    }

    public double area()
    {
        double area = 4.0 * Math.PI * radius * radius;
        return area;
    } 

    public double perimeter()
    {
        return 0.0;
    }

    public double volume()
    {
        double volume = (4.0 * Math.PI * radius * radius * radius) / 3.0
        return volume;
    }

    public void incrementNumSpheresCreated()
    {
        numSpheresCreated++;
    }

    public void incrementNumShapesCreated()
    {
        numShapesCreated++;
    }

}
