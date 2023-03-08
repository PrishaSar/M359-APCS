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

    public void surrender(MainCharacter m){
        m.setProgress(1);
        System.out.println(m.getName() + " has won!");
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
