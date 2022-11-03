package Unit5WritingClasses.PartnerLab;

public class People {
    // instance variables
    private String skill;
    private String name;
    private boolean backstage;

    /**
     * Full constructor for a person
     * @param skill A string that describes the skill a person has.
     * @param name A string that describes the name of the person.
     * @param backstage A boolean that is true if the person is backstage.
     */
    public People(String skill, String name, boolean backstage) {
        this.skill = skill;
        this.name = name;
        this.backstage = backstage;
    }

    /**
     * A constructor for if the person is not performing.
     * Sets the string skill and name as N/A, and the boolean backstage as false.
      */
    public People() {
        this.skill = "N/A";
        this.name = "N/A";
        this.backstage = false;
    }

    // getters and setters
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBackstage() {
        return backstage;
    }

    public void setBackstage(boolean backstage) {
        this.backstage = backstage;
    }
}
