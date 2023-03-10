package Unit9_Inheritance.FairyTale_Lab;

public class Antagonist extends MainCharacter{
    private boolean isUndercover;

    public Antagonist(String name, String skill, int skillLevel, boolean isUndercover){
        super(name, skill, skillLevel);
        this.isUndercover = isUndercover;
    }

    public Antagonist(String name, String skill, boolean isUndercover){
        super(name, skill);
        this.isUndercover = isUndercover;
    }

    /**
     * This function returns information about the Antagonist.
     *
     * @return - a String containing the villain's skill level, progress,
     * and if they are undercover or not.
     */
    @Override
    public String toString(){
        String output =  getName() + " is the villain. They are ";
        if(!isUndercover){
            output += "not";
        }
        output += " undercover.\n";
        output += "They can " + getSkill() + " and are at skill level " + getSkillLevel() + ".\n";
        output += getProgress()*100 + "% of the way to their goal.";
        return output;
    }

    public boolean isUndercover() {
        return isUndercover;
    }

    public void setUndercover(boolean undercover) {
        isUndercover = undercover;
    }

}
