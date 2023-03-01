import java.lang.Math;

/**
 * Class to make objects with the given behavior
 */
public class Point {
    /**
     * instance variables for x and y coordinates
     */
    private double x,y;
    /**
     * class variables for the pointID and the number of active instances
     */
    private static int pointID = 0;
    private static int instances = 0;
    /**
     * Constructor initializes the values that are entered as parameters
     * @param x double
     * @param y double
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        pointID += 1;
        instances +=1;
    }
    /**
     * Constructor initializes the co-ordinates to (0.0, 0.0)
     */
    public Point(){
        pointID += 1;
        instances +=1;
        x = 0.0;
        y = 0.0;
    }
    /**
     * Set method for the variable x
     * @param x double
     */
    public void setX(double x) {
        this.x = x;
    }
    /**
     * Set method for the variable y
     * @param y double
     */
    public void setY(double y) {
        this.y = y;
    }
    /**
     * Set method for the variable x and y
     */
    public void setXY() {
        setX(this.x) ;
        setY(this.y); ;
    }

    /**
     * Method used to obtain the value of x
     * @return x
     */
    public double getX() {
        return this.x;
    }
    /**
     * Method used to obtain the value of x
     * @return y
     */
    public double getY() {
        return this.y;
    }

    /**
     * Method used to change the coordinates of the point by the values entered
     * @param delta_x double
     * @param delta_y double
     */
    public void move(double delta_x, double delta_y){
        this.x = this.x + delta_x;
        this.y = this.y + delta_y;
    }

    /**
     * Calculating the distance between the entered point and the initial point
     * @param p Point
     * @return dist
     */
    public double distance(Point p){
        double dist = Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2);
        return Math.sqrt(dist);
    }

    /**
     * Method used to get the pointID of the point object created
     * @return pointID
     */
    public int pointID(){
        return pointID;
    }

    /**
     * Calculating the distance between two points entered using the above distance method
     * @param p1 Point
     * @param p2 Point
     * @return finaldist
     */
    public static double distance (Point p1, Point p2){
        double finalDist = p1.distance(p2);
        return finalDist;
    }

    /**
     * Used to override the finalize method in Object Class and decrease the number of instances
     * @throws Throwable
     */
    protected void finalize() throws Throwable{
        super.finalize ();
        instances -= 1 ;
    }

    /**
     * Method helps in returning the value of active objects at that moment
     * @return instances
     */
    public static int activeInst(){
        return instances;
    }

}

