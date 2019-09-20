/**
 * Abstract class AbstractShape - a skeleton for all of the shapes.
 *
 * @author (Kurt Mueller & Dennis Pavlyuk)
 * @version (9/12/2019)
 */
public abstract class AbstractShape implements TwoDShape, ThreeDShape {
    protected static double numShapesCreated;
    public void incrementNumShapesCreated(){numShapesCreated++;}

    public double getNumShapesCreated() {return numShapesCreated;}

    public abstract double area();

    public abstract double perimeter();

    public abstract double volume();
}
