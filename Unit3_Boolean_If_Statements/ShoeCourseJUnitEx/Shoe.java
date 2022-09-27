package Unit3_Boolean_If_Statements.ShoeCourseJUnitEx;

public class Shoe {
    //private instance variables
    private String brand;
    private String style;
    private double size;
    private double price;

    //constructor
    public Shoe(String brand, String style, double size, double price) {
        this.brand = brand;
        this.style = style;
        this.size = size;
        this.price = price;
    }

    //getters and setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //methods
    public boolean equals(Shoe other){
        if(this.brand.equals(other.brand) && this.style.equals(other.style)){
            return true;
        }
        else{
            return false;
        }
    }

    //compareTo method returns a negative number if the calling shoe is less expensive
    //a positive number if the calling shoe is more expensive
    //a 0 if they are the same
    public int compareTo(Shoe other){
        double result = this.price - other.price;
        if (result < 0){
            return (int)result -1;
        }
        else if(result > 0){
            return (int)result + 1;
        }
        else{
            return 0;
        }
    }



}
