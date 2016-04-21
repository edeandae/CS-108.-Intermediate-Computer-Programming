import java.util. *;

public class RectangleE
{
    
    public double xcoordinate;
    public double ycoordinate;
    private double length;
    private double width;
    
    
    
    public RectangleE()
    {
        this.xcoordinate = 1;
        this.ycoordinate = 2;
        this.length = 0;
        this.width = 0;
    }
    
    public RectangleE(double xpoint, double ypoint, double sidelength, double sidewidth )
    {
        this.xcoordinate = xpoint;
        this.ycoordinate = ypoint;
        this.length = sidelength;
        this.width = sidewidth;
    }
    
    public void setLength(double x)
    {
        if (x <=0 )
         {
             System.out.println("Invalid input! Number value cannot be a negative number or less than zero");
         }
         else
         {
          this.length = x;  
            
            
            }
    }
   
    public double getLength ()
    {
        return this.length;
    }
   
    public void setWidth(double y)
    {
   
        if (y <= 0)
     {
         System.out.println("Invalid input! Number value cannot be a negative number or less than zero");
         
     }
     else
     {
         this.width = y;
        }
    }
    public double shiftHorrizontal(double xx)
    {
        return this.length + xx;
    }
    public double getWidth ()
    {
        return this.width;
    }
    public double shiftVertical(double yy)
    {
        return this.length + yy;
    }
    public double whatsMyArea()
    {
        return this.length*this.width;
    }
    
    public double calcArea(double len, double wdt)
    {
        this.length = len;
        this.width = wdt;
        
        return len * wdt;
    }
   
    public void speak ()
    {
        System.out.println("Hi, I'm a rectangle");
    }
}