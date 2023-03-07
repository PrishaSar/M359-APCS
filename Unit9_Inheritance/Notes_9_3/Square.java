package Unit9_Inheritance.Notes_9_3;

public class Square extends Rectangle{

    public Square (int side, String color){
        super(side, side, color);
    }

    public Square(){
        super();
    }

    @Override
    public String toString(){
        return "Color: " + this.getColor() + "\t\tNumber of sides: 4\t\tSide Length: " + super.getLength();
    }

}
