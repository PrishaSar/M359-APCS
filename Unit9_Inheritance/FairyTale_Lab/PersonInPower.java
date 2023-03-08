package Unit9_Inheritance.FairyTale_Lab;

public class PersonInPower extends Character{
    private String title;

    public PersonInPower(String name, String skill, String title){
        super(name, skill);
        this.title = title;
    }

    /**
     *
     * @param a
     * @param p
     */
    @Override
    public void uncoverAntagonist(Antagonist a, Protagonist p){
        if(Math.random() < 0.46 && a.getSkillLevel() < 10){
            a.setUndercover(false);
            p.setAwareOfVillain(true);
        }
    }

    /**
     *
     * @return
     */
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
