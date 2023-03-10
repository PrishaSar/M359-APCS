package Unit9_Inheritance.FairyTale_Lab;

public class Protagonist extends MainCharacter{
    private boolean awareOfVillain;

    public Protagonist(String name, String skill, int skillLevel, boolean awareOfVillain){
        super(name, skill, skillLevel);
        this.awareOfVillain = awareOfVillain;
    }

    public Protagonist(String name, String skill, boolean awareOfVillain){
        super(name, skill);
        this.awareOfVillain = awareOfVillain;
    }

    /**
     * This function returns information about the protagonist
     *
     * @return a String containing the protagonist's skill level, progress,
     * and if they are aware of the villain
     */
    @Override
    public String toString(){
        String output = getName() + " is the protagonist. They are ";
        if (!awareOfVillain){
            output += " not ";
        }
        output += " aware of the villain.\n";
        output += " They can " + getSkill() + " and are at skill level " + getSkillLevel() + ".\n";
        output += getProgress()*100 + "% of the way to their goal.";
        return output;
    }

    public boolean isAwareOfVillain() {
        return awareOfVillain;
    }

    public void setAwareOfVillain(boolean awareOfVillain) {
        this.awareOfVillain = awareOfVillain;
    }
}
