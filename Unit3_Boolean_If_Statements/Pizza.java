package Unit3_Boolean_If_Statements;

public class Pizza {
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    public Pizza(String store, int inches, int numToppings, boolean isDeepDish){
        //YOU CAN HAVE THE SAME VAR NAME IF YOU USE THE THIS.VAR TECHNIQUE
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }
    public Pizza(String store, int inches, boolean isDeepDish){
        //YOU CAN HAVE THE SAME VAR NAME IF YOU USE THE THIS.VAR TECHNIQUE
        this.store = store;
        this.inches = inches;
        this.numToppings = 0;
        this.isDeepDish = isDeepDish;
    }

    //methods
    //printInfo method: prints all of its info
    public void printInfo(){
        System.out.print("Store: " + store + "\nToppings: " + numToppings + "\n");
        System.out.println("Deep dish pizza? " + isDeepDish + "\n" + inches + " inch pizza \n");
    }

    //toString() returns (not prints) the pizza in a string/text format
    public String toString(){
        String output = "Store: " + store + "\nToppings: " + numToppings + "\n";
        output += "Deep dish pizza? " + isDeepDish + "\n" + inches + " inch pizza\n";
        return output;
    }
    //returns true if both Pizzas are the same, else returns false
    public boolean equals(Pizza other){
        if(this.inches == other.inches){
            return true;
        }
        else{
            return false;
        }
    }

    //compareTo() returns - if 'this' comes before 'other'
    // return 0 if same
    //return positive if 'this' comes after "other"
    public int compareTo(Pizza other){
        if(this.inches > other.inches){
            return -1;
        }
        else if (this.inches < other.inches){
            return 1;
        }
        else{
            return 0;
        }
    }

    public String getStore(){return store;}
    public void setStore(String store){this.store = store;}
    public boolean isDeepDish() {return isDeepDish;}
    public void setDeepDish(boolean deepDish) {isDeepDish = deepDish;}
    public int getInches() {return inches;}
    public void setInches(int inches) {this.inches = inches;}
    public int getNumToppings() {return numToppings;}
    public void setNumToppings(int numToppings) {this.numToppings = numToppings;}
}
