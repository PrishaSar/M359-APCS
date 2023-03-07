package Unit9_Inheritance.FairyTale_Lab;

import com.sun.tools.javac.Main;

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

    public void attack(MainCharacter m){
        m.getSkillLevel() -= 1;

    }
    public void uncoverAntagonist(Antagonist a){
        if(Math.random() < 0.09){
            a.setUndercover(true);
        }
    }

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
