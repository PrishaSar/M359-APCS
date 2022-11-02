package Unit5WritingClasses.HeroVillian;

public class Power {
    private String power;
    private double powerStrength;

    /**
     * Full constructor for Power objects
     * @param power - This is the name of the superpower
     * @param powerStrength - This is the strength of the superpower (1-10)
     */
    public Power(String power, double powerStrength) {
        this.power = power;
        this.powerStrength = powerStrength;
    }

    public String toString(){
        String output = "";
        output += "Name of the superpower: " + this.power;
        output += "\nPower strength: " + this.powerStrength;
        return output;
    }

    public String getPowerName() {return power;}

    public void setPowerName(String powerName) {this.power = powerName;}

    public double getPowerStrength() {return powerStrength;}

    public void setPowerStrength(double powerStrength) {this.powerStrength = powerStrength;}
}
