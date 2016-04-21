import java.awt.*;


public class Circle 
{
    private double xcoordinate;   //instance variables
    private double ycoordinate;
    private double radius;

    public Circle(double x, double y, double r) //default constructor
    {
        xcoordinate = x;
        ycoordinate = y;
        radius = r;
    }
 
    public double whatsMyArea() //calculate area for a specific circle
    {
        return Math.PI * radius * radius;
    }
    public static double calcAreaForThisRadius(double R) //calculate area of circle with provided radius
    {
        double Area = Math.PI * R * R;
        return Area;
    }
}
