# CSC205-Lab03
Department of Computing Sciences
The College at Brockport, State University of New York

CSC 205 (Fundamentals of Data Structures)

Partner 1 Name: Kurt Mueller

Partner 2 Name: Dennis Pavlyuk

Lab Exercise 3
										
Programming Exercises

Objective: OOP Concepts: Interfaces, Abstract classes, Inheritance, Polymorphism

Create a package called Shape and write these classes in it:

(1)	Define a public interface called Shape – it must have a public double method called area().

(2)	Define another interface called TwoDShape that extends the Shape and has a public double method called perimeter().

(3)	Define another interface called ThreeDShape that extends Shape and has a public double method called volume();

(4)	Define an abstract class called AbstractShape that implements both TwoDShape and ThreeDShape interfaces: It will have 

a.	a private static double instance variable called numShapesCreated;  
b.	a void method called “incrementNumShapesCreated()” that increments the instance variable “numShapesCreated” by 1; 
c.	a “getNumShapesCreated()” method (i.e., an accessor method) that returns the value of instance variable “numShapesCreated”.
d.	public abstract methods called “area()”, “perimeter()” and “volume()”

(5)	Define the following classes: Rectangle, Circle, Cuboid and Sphere that extend AbstractShape. Each of these should have a static instance variable that represents the number of objects of that kind created. These instance variables should be called: “numRectanglesCreated”, “numCirclesCreated”, “numCuboidsCreated”, and “numSpheresCreated”. The constructor of each of these classes should increment the appropriate one of these instance variables of the object being created, and it should also increment the parent class’ static instance variable “numShapesCreated”.  Here is the code for Rectangle class, to use as a model:

public class Rectangle extends AbstractShape
{
    private double length;
    private double width; 
    private static int numRectanglesCreated = 0;

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

Similarly write the Circle, Cuboid and Sphere classes:
•	Circle – has a radius (which should be of type ‘double’), and two methods called area() and perimeter(). (area = pi* radius * radius; perimeter = 2 * pi * radius; volume is zero) (Note: ‘pi’ here refers to Math.PI (available in Java))

•	Cuboid – has length, width and height (all of which should be of type ‘double’) and methods area() perimeter() and volume(). Note that area() here means the surface area of the cuboid = 2 * (length * width + width * height + height * length); perimeter is assumed to be always zero and volume is (length * width * height).

•	Sphere – has a radius (of type ‘double’) and has area() and volume() methods. (area =  4.0 * pi * radius * radius; perimeter is zero and  volume = (4.0 * pi * radius * radius * radius) / 3.0) (Note: again, ‘pi’ here refers to Math.PI)

(6)	Write a ShapeTester class that has only the main method that does the following things:
•	Declares an array: AbstractShape[ ] myShapes = new AbstractShape[16];
•	Creates 16 Shape objects and fills them in the array: 4 objects of each type using the data given below.
•	

Shape	Length	width	height	radius
Rectangle	10	5	-	-
Rectangle	20	30	-	-
Rectangle	50	10	-	-
Rectangle	-10	-20		
Circle	-	-	-	20
Circle	-	-	-	10
Circle	-	-	-	30
Circle	-	-	-	-20
Cuboid	20	10	6	-
Cuboid	40	5	50	-
Cuboid	30	20	20	-
Cuboid	-20	30	-10	
Sphere	-	-	-	15
Sphere	-	-	-	25
Sphere	-	-	-	12
Sphere	-	-	-	-10

•	In a loop: prints the area, perimeter and volume of each shape. You should ensure that each double value is printed to exactly two decimal places – you can use formatted printing (System.out.printf) to do that (or google for some other solution).
•	After the loop, it should also print the totals (something like this:
Total number of Rectangle objects = ____
Total number of Circle objects = ____
Total number of Cuboid objects = ____
Total number of Sphere objects = ____
Total number of Shape objects = ____


SUBMIT ALL THE CODE AND OUTPUT FOR THIS PROGRAM
