/**
 * Write a description of interface ShapeTester here.
 *
 * @author (Kurt Mueller & Dennis Pavlyuk)
 * @version (9/12/2019)
 */
public class ShapeTester {
    public static void main(String[] args) {
         AbstractShape[] myShapes = new AbstractShape[16];
         
         //Create 16 Shape objects and fill them into the array
         myShapes[0] = new Rectangle(10, 5);
         myShapes[1] = new Rectangle(20, 30); 
         myShapes[2] = new Rectangle(50, 10);
         myShapes[3] = new Rectangle(-10, -20);
         myShapes[4] = new Circle(20);
         myShapes[5] = new Circle(10);
         myShapes[6] = new Circle(30);
         myShapes[7] = new Circle(-20);
         myShapes[8] = new Cuboid(20, 10, 6);
         myShapes[9] = new Cuboid(40, 5, 50);
         myShapes[10] = new Cuboid(30, 20, 20);
         myShapes[11] = new Cuboid(-20, 30, -10);
         myShapes[12] = new Sphere(15);
         myShapes[13] = new Sphere(25);
         myShapes[14] = new Sphere(12);
         myShapes[15] = new Sphere (-10);
         
         for (int count = 0; count < 16; count++) {
             if (myShapes[count].getClass() == Rectangle.class) {
                 System.out.print(myShapes[count].area());
                 System.out.print(myShapes[count].perimeter());
                 System.out.print(myShapes[count].volume());
                }
             else if (myShapes[count].getClass() == Circle.class) {
                 System.out.print(myShapes[count].area());
                 System.out.print(myShapes[count].perimeter());
                 System.out.print(myShapes[count].volume());
                }
             else if (myShapes[count].getClass() == Cuboid.class) {
                 System.out.print(myShapes[count].area());
                 System.out.print(myShapes[count].perimeter());
                 System.out.print(myShapes[count].volume());
                }
             else {
             System.out.print(myShapes[count].area());
             System.out.print(myShapes[count].perimeter());
             System.out.print(myShapes[count].volume());
            }
         }
    }
}