package Unit9_Inheritance.FairyTale_Lab;

public class Character {
    private String name;
    private String skill;

    public Character(String name, String skill){
        this.name = name;
        this.skill = skill;
    }

    public Character(){
        name = "Unknown";
        skill = "none";
    }

    /**
     * The function attack() backtracks a MainCharacter by taking away 1% of their progress.
     * This is a weak function as the MainCharacter can easily overcome the setback, and there is a
     * 50% chance that the function won't do anything and will print so.
     *
     * @param m - the MainCharacter being affected.
     */
    public void attack(MainCharacter m){
        if(Math.random() < 0.5){
            m.setProgress(m.getProgress() - 0.01);
        }
        else{
            System.out.println("Attack failed.");
        }
    }

    /**
     * This function gives the Character a 9% chance of uncovering the antagonist & making the protagonist aware
     * of the antagonist.
     * If the antagonist has a skill level greater than 5, the Character will not be able to uncover the antagonist.
     *
     * @param a - the antagonist being (possibly) uncovered
     * @param p - the protagonist being (possibly) made aware of the villain.
     */
    public void uncoverAntagonist(Antagonist a, Protagonist p){
        if(Math.random() < 0.09 && a.getSkillLevel() <= 5){
            a.setUndercover(false);
            p.setAwareOfVillain(true);
        }
    }

    /**
     * This function returns the character's name and skill.
     *
     * @return - a String containing information about the character.
     */
    public String toString(){
        return "This character's name is " + name + " and they can " + skill + ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
