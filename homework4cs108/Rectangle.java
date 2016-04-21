import java.util.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Rectangle
{
public double x;
public double y;
private double length;
private double width;
 
 
    //Instance Methods
	public void shiftHorizontal(double xx)
	{
	x = x + xx;
	}
 
	public void shiftVertical(double yy)
	{
	y = y + yy;
	}
 
 
	public void talk()
	{
	System.out.println("Hi, I'm a rectangle");
	}
 
	public double getlength()
	{
	return length;
	}
 
	public double getWidth()
	{
	return width;
	}
 
	public void setlength(double x)
	{
	if(x<0)
	{
		System.out.println("length cannot be less than 0");
	}
	else
	{
		length = x;
	}
	}
 
	public void setWidth(double x)
	{
		if(x<0)
		{
			System.out.println("width cannot be less than 0");
		}
		else
		{
			width = x;
		}
	}
 
 
	public double getArea()
	{
	return length * width;
	}
 
 
	//Constructors:
 
	public Rectangle()
	{
	x = 0;
	y = 0;
	length = 3;
	width = 4;
	}
 
	public Rectangle(double xCoordinate, double yCoordinate, double lengthGiven, double widthGiven)
	{
		x = xCoordinate;
		y = yCoordinate;
		if (lengthGiven <0)
		{
			length = 0;
		}
		else
		{
			length = lengthGiven;
		}
		if (widthGiven <0)
		{
			width = 0;
		}
		else
		{
			width = widthGiven;
		}
	}
 
 
	//Class Variable
	public static double PI = 3.14;
 
	//Class Method
	public static double calcArea(double len, double wdt)
	{
	return len * wdt;
	}
 
}