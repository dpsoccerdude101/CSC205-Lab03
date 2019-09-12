
/**
 * Write a description of class Cuboid here.
 *
 * @author (Dennis Pavlyuk Kurt Mueller)
 * @version (9/12/19)
 */
public class Cuboid extends AbstractShape
{
    private double length, width, height;
    
    //constructor
    public cuboid(double len, double wid, double hi){
        length = len;
        width = wid;
        height = hi;
    }
    
    //calculate the surface area
    public double area(){
        double area = 2*(length*width + width*height + height*length);
        return area;
    }
    
    //assume perimeter to be always 0.0
    public double perimeter(){
        return 0.0;
    }
    
    //calculate the volume
    public double volume(){
        double volume = length*width*height;
        return volume;
    }
    
    
}
