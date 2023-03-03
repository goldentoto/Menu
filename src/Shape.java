/**
 * Abstract Parent Class to make shape objects
 */
public abstract class Shape {
    /**
     * instance variables for the x and y co-ordinate of the orgin
     */
    private double xorigin, yorigin;
    private final Point origin = new Point(xorigin,yorigin);

    /**
     * Constructor to initialize the values
     * @param xorigin double
     * @param yorigin double
     */

    public Shape(double xorigin, double yorigin){
        this.xorigin = xorigin;
        this.yorigin = yorigin;

    }

    /**
     * Constructor to initialize the parameters to 0
     */
    public Shape(){
        this(0,0);
    }

    /**
     * Method to set the origin point
     * @param x double
     * @param y double
     */
    public void setorigin (double x, double y){
        this.xorigin = x;
        this.yorigin = y;
        origin.setXY(xorigin,yorigin);
    }

    /**
     * Method to get the origin point
     * @return origin
     */
    public Point getorigin(){
        return origin;
    }

    /**
     * Method used to change the coordinates of the origin by the values entered
     * @param delta_x double
     * @param delta_y double
     */
    public void move(double delta_x, double delta_y){
        origin.move(delta_x,delta_y);
    }

    /**
     * Distance between two shapes
     * @param s Shape
     * @return shape_dist
     */
    public double distance(Shape s){
        double shape_dist = origin.distance(s.getorigin());
        return shape_dist;
    }

    /**
     * Abstract method to calculate area
     * @return area
     */
    public abstract double area();

    /**
     * Abstract method to calculate circumference
     * @return circumference
     */
    public abstract double circumference();

    /**
     * Abstract method to calculate area
     * @return
     */
//    public String toString();
}
