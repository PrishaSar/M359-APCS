package Unit9_Inheritance.Notes_9_3;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle (double length, double width, String color){
        super(color, 4);
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        super();
        this.length = 0;
        this.width = 0;
    }

    @Override
    public String toString(){
        return super.toString() + "\t\tDimensions: " + length + " X " + width;
    }

    public void scaleSize(double scale){
        length *= scale;
        width *= scale;
    }

    public double findArea(){
        return (length*width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
