package Unit9_Inheritance.Notes_9_3;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String color){
        super(color, 1);
        this.radius = radius;
    }

    public Circle(){
        super();
        radius = 0;
    }

    @Override
    public String toString(){
        return (super.toString() + "\t\tRadius: " + radius);
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }


}
