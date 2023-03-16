package Unit9_Inheritance.FairyTale_Lab;

public class PersonInPower extends Character{
    private String title;

    public PersonInPower(String name, String skill, String title){
        super(name, skill);
        this.title = title;
    }

    /**
     * This function gives the PersonInPower a 46% chance to uncover the antagonist if the antagonist
     * has a skill level less than full power (10).
     *
     * @param a - the antagonist being (possibly) uncovered
     * @param p - the protagonist being (possibly) made aware of the villain.
     */
    @Override
    public void uncoverAntagonist(Antagonist a, Protagonist p){
        if(Math.random() < 0.78 && a.getSkillLevel() < 10){
            a.setUndercover(false);
            p.setAwareOfVillain(true);
        }
    }

    /**
     * This function either takes down the skill level or progress of the main character. The higher skill level
     * the MainCharacter has, the less of a chance there is for the PersonInPower to detrement their skills.
     * Their progress setback doesn't depend on their skill level and stays at a 5%.
     *
     * @param m - the MainCharacter being affected
     */
    public void attack(MainCharacter m){
        if(Math.random() < 0.5){
            m.setProgress(m.getProgress() + 0.15);
        }
        else {
            int newSkillLev = (int) (Math.random() * 5) + m.getSkillLevel() * 2;
            m.setSkillLevel(newSkillLev);
        }
    }

    /**
     * This function returns information about the PersonInPower
     *
     * @return - a String containing the name, title, and skill of the PersonInPower.
     */
    @Override
    public String toString(){
        return getName() + " is a " + title + " who can " + getSkill() + ".";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
