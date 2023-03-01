public class Rectangle extends Shape{
    private double width, length;
    public Rectangle(double length, double width, double xorigin, double yorigin){
        super(xorigin,yorigin);
        this.width = width;
        this.length = length;
    }
    public Rectangle(){
        this(0,0,0,0);
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setDimensions(){
        setWidth(this.width);
        setLength(this.length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double area() {
        return getWidth()*getLength();
    }

    @Override
    public double circumference() {
         return 2*getLength() + 2* getWidth();
    }

    @Override
    public String toString() {

    }
}
