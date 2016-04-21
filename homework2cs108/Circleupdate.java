





import java.awt.*;


public class Circleupdate {

    private double radius;

    public Circleupdate() {

        radius = 1;
    }

    public Circleupdate(double x, double y, double r) {
        
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}