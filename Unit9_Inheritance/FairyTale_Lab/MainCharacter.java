package Unit9_Inheritance.FairyTale_Lab;

public class MainCharacter extends Character{
    private int skillLevel;
    private double progress;

    public MainCharacter(String name, String skill, int skillLevel){
        super(name, skill);
        this.skillLevel = skillLevel;
        this.progress = 0;
    }

    public MainCharacter(String name, String skill){
        super(name, skill);
        this.skillLevel = 0;
        this.progress = 0;
    }

    /**
     * This function attack() simulates an attack between MainCharacter objects
     * It overrides the attack() method in the Character class, and is more powerful
     * If the attacker has a SkillLevel higher than five, they can deal more damage
     *
     * @param m - the MainCharacter being affected
     */
    @Override
    public void attack(MainCharacter m){
        if (this.getSkillLevel() > 5){
            m.setProgress(m.getProgress() - 0.08);
            m.setSkillLevel(m.getSkillLevel() - 1);
        }
        else{
            m.setProgress(m.getProgress() - 0.05);
        }
    }

    /**
     * This function simulates the surrender of a MainCharacter,
     * setting their progress to one and stating that they won
     *
     * @param m - the MainCharacter being affected
     */
    public void surrender(MainCharacter m){
        System.out.println(this.getName() + " has surrendered, being " + progress*100 + "% of the way" +
                " to their goal.\n" + m.getName() + " is "+ m.getProgress()*100 + "% of the way to her goal.");
        m.setProgress(1);
    }

    /**
     * Simulates a random increase in a character's progress
     * based on their SkillLevel
     */
    public void makeProgress(){
        double moreProgress = skillLevel*Math.random() + 0.25;
        if(skillLevel < 0){
            moreProgress = 0.05;
        }
        progress += moreProgress;
        System.out.println(getName() + " is now " + (progress*100) + "% of the way to their goal!");
    }

    public int getSkillLevel(){
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
        if(progress >= 1){
            System.out.println(getName() + " has won!");
        }
    }
}
