import java.lang.Math;

/**
 * Extended subclass from Shape to make a circle
 */
public class Circle extends Shape {
    /**
     * Instance variable
     */
    private double radius;

    /**
     * Constructor for initializing the parameters for the object
     * @param rad double
     * @param xorigin double
     * @param yorigin double
     */
    public Circle( double rad, double xorigin, double yorigin){
        setorigin(xorigin,yorigin);
        this.radius = rad;
    }

    /**
     * Constructor to initialize the parameters to 0.0
     */
    public Circle(){
        this(0,0,0);
    }

    /**
     * Method to set radius
     * @param rad double
     */
    public void setRadius(double rad) {
        radius = rad;
    }

    /**
     * Method to get radius
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Method to calculate area for a circle
     * @return area
     */
    @Override
    public double area() {
        return Math.pow(radius,2)*Math.PI ;
    }

    /**
     * Method to calculate circumference for a rectangle*
     * @return circumference
     */
    @Override
    public double circumference() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Current state of object are as follows \n 1. The radius of the circle is -"+ getRadius() +
                "\n 2. The origin is "+ getorigin() + "\n 3. The area is "+ area() + "\n 4. The circumference is " + circumference();
    }
}
