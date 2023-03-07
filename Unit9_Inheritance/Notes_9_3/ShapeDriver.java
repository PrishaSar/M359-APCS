package Unit9_Inheritance.Notes_9_3;
public class ShapeDriver {
    public static void main(String[] args) {
        Shape myShape = new Shape("red", 5);
        System.out.println(myShape);

        Circle myCircle = new Circle(5, "white" );
        System.out.println(myCircle);

        Rectangle myRect = new Rectangle(2, 8, "pink");
        System.out.println(myRect);

        Square mySquare = new Square(2, "rainbow");
        System.out.println(mySquare);

        System.out.println();

        System.out.println("Circle Area: " + myCircle.findArea());
        System.out.println(("Rectangle Area: " + myRect.findArea()));

        System.out.println();

        myRect.scaleSize(0.5);
        System.out.println("New Rectangle => " + myRect);
    }
}
