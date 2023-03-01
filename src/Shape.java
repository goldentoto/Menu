public abstract class    Shape {
    private double xorigin, yorigin;
    private Point origin = new Point(xorigin,yorigin);

    public Shape(Point origin){
        origin.setXY();
    }
    public Shape(double xorigin, double yorigin){
        this.xorigin = xorigin;
        this.yorigin = yorigin;
    }
    public void setorigin (double x,double y){
        this.xorigin = x;
        this.yorigin = y;
    }
    public Point getorigin(){
        return origin;
    }
    public void move(double delta_x, double delta_y){
        origin.move(delta_x,delta_y);
    }
    public double distance(Point s){
        double shape_dist = origin.distance(s);
        return shape_dist;
    }
    public abstract double area();
    public abstract double circumference();
    public abstract String toString();
}
