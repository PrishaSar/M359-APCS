package Unit9_Inheritance.FairyTale_Lab;

public class PersonInPower extends Character{
    private String title;

    public PersonInPower(String name, String skill, String title){
        super(name, skill);
        this.title = title;
    }

    @Override
    public String toString(){
        return getName() + "is a " + title + " who can " + getSkill();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
