import java.util.*;
public class Triangle
{
// instance variables - replace the example below with your own
public double a;
public double b;
private double c;
private List<String> btsarr;

public Triangle()
{
a = 3;
b = 4;
c = 5;

btsarr = new ArrayList<String>();
btsarr.add(btsarr.size(),c+"");
numMade++;
}
public Triangle(double sideA, double sideB, double sideC)
{
this.a = sideA;
this.b = sideB;
this.c = sideC;

btsarr = new ArrayList<String>();
btsarr.add(btsarr.size(),c+"");
numMade++;
}

public double setC(double changec)
{
if (changec <=0)
{
c = c;
}
else
{
c = changec;
btsarr.add(btsarr.size(),c+"");
}
return c;
}

public double getC()
{
return c;
}

public List<String> showAllCs()
{
return btsarr; 
}

public boolean isRightTriange()
{
if(a*a + b*b == c*c)
{return true;
}
else 
{return false;
}
}

//class variable
private static int numMade = 0;

//class method
public static int getNumMade()
{
return numMade;
}

}