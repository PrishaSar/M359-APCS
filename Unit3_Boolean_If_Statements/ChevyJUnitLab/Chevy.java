package Unit3_Boolean_If_Statements.ChevyJUnitLab;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelEf;
    private double basePrice;
    private String model;
    private String color;
    private boolean luxPack;
    private boolean fourWDPack;
    private boolean sportsPack;
    private double upgradePrice;
    private double totalPrice;

    private final String MAKE = "Chevrolet";
    private final double TAX_RATE = 0.122;
    private final double LUXPACK_INC = 0.2;
    private final double SPORTPACK_INC = 0.15;
    private final int FWDPACK_INC = 3500;
    private final double FUEL_DEC = 0.20;

    public Chevy(int year, int mileage, double fuelEf, double basePrice, String model, String color, boolean luxPack, boolean fourWDPack, boolean sportsPack) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEf = fuelEf;
        this.basePrice = basePrice;
        this.model = model;
        this.color = color;
        this.luxPack = luxPack;
        this.fourWDPack = fourWDPack;
        this.sportsPack = sportsPack;
        calcPrice();
    }

    public Chevy(){
        this.year = 2021;
        this.mileage = 0;
        this.fuelEf = 35;
        this.basePrice = 16000;
        this.model = "Trax";
        this.color = "White";
        this.luxPack = false;
        this.fourWDPack = false;
        this.sportsPack = false;
        calcPrice();
    }

    public int compareTo(Chevy other){
        return this.mileage - other.mileage;
    }

    private boolean isNew(Chevy chev){
        if(chev.mileage < 200){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(Chevy other){

        if (this.model.equals(other.model) && this.color.equals(other.color) && isNew(other) == isNew(this)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        String output;
        output = "**************************************************\n";
        output += year + " " + MAKE + " " + model + " (" + color + ")\n";
        output += "\tBASE PRICE:\t\t\t\t\t$" + basePrice;
        output += "\n\tMILES:\t\t\t\t\t\t" + mileage;
        output += "\n\tFUEL EFFICIENCY:\t\t\t" + fuelEf + " mpg";
        output += "\n\tPACKAGES:\n";

        if(luxPack || sportsPack || fourWDPack){
            if(luxPack){
                output += "\t\t - Luxury Package\n";
            }
            if(sportsPack){
                output += "\t\t - Sports Package\n";
            }
            if(fourWDPack){
                output += "\t\t - 4WD Package\n";
            }
        }
        else{
            output += "- None";
        }

        output += "\n\n\tPRICE WITH UPGRADES:\t\t$" + (upgradePrice + basePrice);
        output += "\n\tFINAL PRICE WITH TAX:\t\t$" + totalPrice;
        output += "\n**************************************************";
        return output;
    }

    public void calcPrice(){
        if (luxPack == true){
            upgradePrice += basePrice*LUXPACK_INC;
        }
        if(fourWDPack == true){
            upgradePrice += FWDPACK_INC;
        }
        if(sportsPack ==true){
            upgradePrice += basePrice*SPORTPACK_INC;
            fuelEf -= fuelEf*FUEL_DEC;
        }
        totalPrice = (upgradePrice + basePrice)*(TAX_RATE + 1);
    }

    ///getters and setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return mileage;
    }

    public void setMiles(int mileage) {
        this.mileage = mileage;
    }

    public double getMpg() {
        return fuelEf;
    }

    public void setMpg(double fuelEf) {
        this.fuelEf = fuelEf;
        calcPrice();
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
        calcPrice();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getLuxuryPkg() {
        return luxPack;
    }

    public void setLuxuryPkg(boolean luxPack) {
        this.luxPack = luxPack;
        calcPrice();
    }

    public boolean get4WDPkg() {
        return fourWDPack;
    }

    public void set4WDPkg(boolean fourWDPack) {
        this.fourWDPack = fourWDPack;
        calcPrice();
    }

    public boolean getSportsPkg() {
        return sportsPack;
    }

    public void setSportsPkg(boolean sportsPack) {
        this.sportsPack = sportsPack;
        calcPrice();
    }

    public double getPriceWithUpgrades() {
        return upgradePrice + basePrice;
    }

    public String getMake() {
        return MAKE;
    }

    public void setPriceWithUpgrades(double upgradePrice) {
        this.upgradePrice = upgradePrice;
        this.totalPrice = basePrice + upgradePrice;
    }

    public void setGrandTotal(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getGrandTotal() {
        return totalPrice;
    }
}
