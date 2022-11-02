package Unit5WritingClasses.HeroVillian;

public class MarvelMovieTester {
    public static void main(String[] args) {
        // create a super power object for Super speed
        Power p1 = new Power ("Super speed", 10);
        Power p2 = new Power ("Flight", 8);

        //Java automatically gets toString method!
        SuperHero superMan = new SuperHero("Superman", p2);
        System.out.println(superMan);
        System.out.println();
        Villain reverseFlash = new Villain ("Reverse Flash", p1);
        System.out.println(reverseFlash);

        //reduce reverse Flash's power from 10 to 6;
        reverseFlash.getPower().setPowerStrength(6);

        System.out.println();
        System.out.println();

        //Have these two battle each other
        battle(superMan, reverseFlash);
    }

    /**
     * Simulates a battle between hero and villain.The won with more power wins.
     *  At the end of each battle: (if power levels are equal, flip a coin)
     *         1. The winner will gain 10% of the loser's power level
     *         2. The loser loses between 5-35% of their own power level (random)
     * @param h - This is the superhero object
     * @param v - This is the villain object
     */
    public static void battle(SuperHero h, Villain v){
        double hPow = h.getPower().getPowerStrength();
        double vPow = v.getPower().getPowerStrength();
        double loss = (int)(Math.random() * 31) + 5;

//        If you want to actually have a separate if statement:
//        int winner = 0;
//        if(hPow - vPow == 0){
//            winner = (int)(Math.random()*2) + 1;
//        }

        if(hPow - vPow > 0 || Math.random() < 0.5){
            System.out.println("Hero won!");
          h.getPower().setPowerStrength(hPow + vPow*0.1);
          v.getPower().setPowerStrength(vPow - (vPow * loss * 0.01));
        }
        else{
            System.out.println("Villain won!");
            v.getPower().setPowerStrength(vPow + hPow*0.1);
            h.getPower().setPowerStrength(hPow - (hPow * loss * 0.01));
        }
    }



}
