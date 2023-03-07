package Unit9_Inheritance.Notes_9_3;

public class Shape {
    private String color;
    private int numSides;

    public Shape(String color, int numSides){
        this.color = color;
        this.numSides = numSides;
    }

    public Shape(){
        color = "no color";
        numSides = -1;
    }

    public String toString(){
        return "Color: " + color + "\t\tNumber of sides: " + numSides;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
}
