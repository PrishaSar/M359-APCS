package Unit9_Inheritance.FairyTale_Lab;

public class Animal extends Character{
    private MainCharacter onSide;

    public Animal(String name, String skill, MainCharacter onSide){
        super(name, skill);
        this.onSide = onSide;
    }

    /**
     * The function attack() helps a MainCharacter and increases their progress
     */
    public void attack(){
       onSide.setProgress(onSide.getProgress() + 0.05);
    }


    /**
     * This function returns information about the Animal
     *
     * @return a String containing the animal's name, skill,
     * and which MainCharacter they support
     */
    @Override
    public String toString(){
        return getName() + " is an Animal who can " + getSkill() + " and is on the side of " + onSide + ".";
    }

    public MainCharacter getOnSide() {
        return onSide;
    }

    public void setOnSide(MainCharacter onSide) {
        this.onSide = onSide;
    }
}
