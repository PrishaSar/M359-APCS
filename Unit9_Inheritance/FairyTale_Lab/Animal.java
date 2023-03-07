package Unit9_Inheritance.FairyTale_Lab;

public class Animal extends Character{
    private String onSide;

    public Animal(String name, String skill, String onSide){
        super(name, skill);
        this.onSide = onSide;
    }

    @Override
    public String toString(){
        return getName() + " is an Animal who can " + getSkill() + " and is on the side of " + onSide + ".";
    }

    public String getOnSide() {
        return onSide;
    }

    public void setOnSide(String onSide) {
        this.onSide = onSide;
    }
}
