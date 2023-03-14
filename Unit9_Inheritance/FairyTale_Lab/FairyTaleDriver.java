package Unit9_Inheritance.FairyTale_Lab;

import java.util.ArrayList;

public class FairyTaleDriver {
    public static void main(String[] args) {
        Character BlackWidow = new Protagonist("Black Widow", "spy", false);
        Character SnowWhite = new Antagonist("Snow White", "manipulate", 7, true);
    }

    /**
     * DO THIS FUNCTION LATER IF TIME
     *This function takes an ArrayList of Character objects and calls the attack function on all of them on a random pr
     * - animal objects don't take a side at the beginning
     * @param c
     * @param p
     * @param a
     */
    public static void allAttack(ArrayList<Character> c, Protagonist p, Antagonist a){
        for(int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).toString());
        }
    }
}
