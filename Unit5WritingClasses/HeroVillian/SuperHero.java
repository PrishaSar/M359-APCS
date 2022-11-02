package Unit5WritingClasses.HeroVillian;

public class SuperHero {
    private String name;
    private Power power;

    public SuperHero(String hero, Power power) {
        this.name = hero;
        this.power = new Power (power.getPowerName(), power.getPowerStrength());
    }

    public String toString(){
        String output = "";
        output += "Name of hero: " + name;
        output += "\n" +
                "" + power;
        return output;
    }

    public String getHero() {return name;}

    public void setHero(String hero) {this.name = hero;}

    public Power getPower() {return power;}

    public void setPower(Power power) {
        this.power = new Power (power.getPowerName(), power.getPowerStrength());
    }
}
