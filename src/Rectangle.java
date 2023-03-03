/**
 * Extended subclassto make Rectangle objects
 */
public class Rectangle extends Shape{
    /**
     * Instance variables for width and length of the object
     */
    private double width, length;

    /**
     * Constructor to initialize the parameters
     * @param length double
     * @param width double
     * @param xorigin double
     * @param yorigin double
     */
    public Rectangle(double length, double width, double xorigin, double yorigin){
        super(xorigin,yorigin);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor to initialize the parameters to 0.0
     */
    public Rectangle(){
        this(0,0,0,0);
    }

    /**
     * Method to set length
     * @param length double
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Method to set width
     * @param width double
     */
    public void setWidth(double width){
        this.width = width;
    }

    /**
     * Method to set both width and length
     * @param length double
     * @param width double
     */
    public void setDimensions(double length,double width ){
        this.width = width;
        this.length = length;
    }

    /**
     * Method to get the width
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Method to get length
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * Method to calculate area for a rectangle
     * @return area
     */
    @Override
    public double area() {
        return getWidth()*getLength();
    }

    /**
     * Method to calculate circumference for a rectangle
     * @return circumference
     */
    @Override
    public double circumference() {
         return 2*getLength() + 2* getWidth();
    }

    /**
     * Method to display the current state for a rectangle
     * @return State
     */
    @Override
    public String toString() {
        return "Current state of object are as follows \n 1. The dimensions of the rectangle are -"+ getWidth() + ","+getLength() +"" +
                "\n 2. The origin is "+ getorigin() + "\n 3. The area is "+ area() + "\n 4. The circumference is " + circumference();
    }
}
