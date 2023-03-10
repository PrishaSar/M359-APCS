package Unit9_Inheritance.FairyTale_Lab;

import java.util.ArrayList;

public class FairyTaleDriver {
    public static void main(String[] args) {

    }

    /**
     *
     * @param c
     */
    public static void allAttack(ArrayList<Character> c){
        for(int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).toString());
        }
    }
}
