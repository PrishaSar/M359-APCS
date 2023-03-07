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

    public int getSkillLevel(){
        return getSkillLevel();
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }
}
