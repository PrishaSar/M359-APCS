package Unit5WritingClasses.HeroVillian;

public class Villain {
    private String name;
    private Power power;

    public Villain(String villain, Power power){
        this.name = villain;
        this.power = new Power (power.getPowerName(), power.getPowerStrength());
    }

    public String toString(){
        String output = "";
        output += "Name of villain: " + name;
        output += "\n" + power;
        return output;
    }

    public String getVillain() {return name;}

    public void setVillain(String villain) {this.name = villain;}

    public Power getPower() {return power;}

    public void setPower(Power power) {
        this.power = new Power (power.getPowerName(), power.getPowerStrength());
    }
}
