package Unit9_Inheritance.FairyTale_Lab;

import java.util.ArrayList;

public class FairyTaleDriver {
    public static void main(String[] args) {
        Character blackWidow = new Protagonist("Black Widow", "spy", false);
        Character snowWhite = new Antagonist("Snow White", "manipulate", 7, true);
        Character spider = new Animal ("Charlotte", "trap people", (MainCharacter) blackWidow);
        Character dwarf = new Animal("Happy", "kidnap people", (MainCharacter) snowWhite);
        Character queenOfHearts = new PersonInPower("Queen of Hearts", "behead people", "Queen");
        Character alice = new Character("Alice", "be very curious");

        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add(blackWidow);
        characters.add(snowWhite);
        characters.add(spider);
        characters.add(dwarf);
        characters.add(queenOfHearts);
        characters.add(alice);

        for(Character c: characters){
            System.out.println(c.toString());
            System.out.println();
        }

        System.out.println();

        allAttack(characters, (Protagonist) blackWidow, (Antagonist) snowWhite);
        System.out.println(blackWidow);
        System.out.println();
        System.out.println(snowWhite);
        System.out.println();
        ((Protagonist) blackWidow).makeProgress();

        alice.uncoverAntagonist((Antagonist) snowWhite, (Protagonist) blackWidow);
        snowWhite.attack((MainCharacter) blackWidow);
        blackWidow.attack((MainCharacter) snowWhite);

        ((Animal)dwarf).attack();

        queenOfHearts.uncoverAntagonist((Antagonist) snowWhite, (Protagonist) blackWidow);

        System.out.println();

        System.out.println(blackWidow + "\n\n" + snowWhite);

    }

    /**
     * This function takes an ArrayList of Character objects and calls the attack function on all of them with either the
     * protagonist of antagonist
     * Animal objects can only help the side they support
     * Main Characters can attack themselves.
     * @param c - the list of Characters
     * @param p - the Protagonist being possibly attacked
     * @param a - the Antagonist being possibly attacked
     */
    public static void allAttack(ArrayList<Character> c, Protagonist p, Antagonist a){
        for(int i = 0; i < c.size(); i++){
            if(c.get(i) instanceof Animal){
                ((Animal) c.get(i)).attack();
            }
            else{
                if(Math.random() < 0.5){
                    c.get(i).attack(p);
                }
                else {
                    c.get(i).attack(a);
                }
            }
        }
    }
}
