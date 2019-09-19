/**
 * Abstract class AbstractShape - write a description of the class here
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
