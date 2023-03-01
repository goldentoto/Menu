import java.lang.Math;
public class Circle extends Shape {
    private double radius;
    private Point origin;
    public Circle( double rad, double xorigin, double yorigin){
        super(xorigin, yorigin);
        radius = rad;
    }
    public Circle(){
        this(0,0,0);
    }

    public void setRadius(double rad) {
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        System.out.println(Math.pow(radius,2)*Math.PI);
    }

    @Override
    public double circumference() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
