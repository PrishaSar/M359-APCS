package Unit5WritingClasses.PartnerLab;

public class People {
    // instance variables
    private String skill;
    private String name;
    private boolean backstage;

    // constructors
    public People(String skill, String name, boolean backstage) {
        this.skill = skill;
        this.name = name;
        this.backstage = backstage;
    }

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
