//Isabella Chen, Prisha Saraiya, Mr. Moon, period 7
//Purpose of Class:
package Unit5WritingClasses.PartnerLab;

public class ShowTester {

    public static void main(String[] args) {
        People none = new People();

        // creating first show

        // act 1
        People trainer = new People("Trainer", "Isabella", false);
        Acts catGymnastics = new Acts("Acrobatics", 15, 8, trainer, none, none);

        // act 2
        People mainLeadF = new People("Main Lead Female", "Stara", false);
        People props = new People("Handling Props and Music", "Joe", true);
        People secondLead = new People("Second Lead Male", "Jerry Moon", false);
        Acts musical = new Acts("Musical", 30, 7, mainLeadF, props, secondLead);

        // act 3
        People primaBallerina = new People("Lead Dancer", "Christina", false);
        People hipHoper = new People("Lead Hip Hop Dancer", "Split", false);
        People jazzDancer = new People("Lead Jazz Dancer and Music Player", "Darl", false);
        Acts danceMash = new Acts("Dance", 45, 5, primaBallerina, hipHoper, jazzDancer);

        // show
        Show mixAndMatch = new Show(catGymnastics, musical, danceMash, true, false);

        // creating second show

        // act 1
        People magician = new People("Magician", "Reflecta", false);
        People disappearer = new People("Fake Volunteer", "Louie", false);

        Acts apparation = new Acts("Magic", 11, 2, magician, disappearer, none);

        // act 2
        People ghostActor = new People("Mimics The Actions of a Ghost", "Prisha", false);
        People specialEffects = new People("Handles Special Effects", "Dorothy", true);
        People voice = new People("Handles Voices and Sounds", "Carl", true);
        Acts ghost = new Acts ("Magic", 10, 5, ghostActor, specialEffects, voice);

        // act 3
        People cardMagician = new People ("Card Tricks", "Macio", false);
        Acts cards = new Acts ("Magic", 20, 8, cardMagician, none, none);

        // show
        Show magicMania = new Show(apparation, ghost, cards, true, true);

        //interact w/ static variable and method
        //Java documentation
    }

    /**This function takes two shows and estimates their revenue. The show that has a higher
     * revenue leads to the increase of all of its acts by 0.5. If both shows are equal, one show is randomly picked.
     *
     * @param a - the first show being simulated
     * @param b - the second show being simulated
     * @return - the show that has a higher revenue
     */
    public static Show compareShows(Show a, Show b){
        int aRev = a.calcRevenue();
        int bRev = b.calcRevenue();

        if(aRev > bRev){
            a.getAct1().setPopularity(a.getAct1().getPopularity() + 0.5);
            a.getAct2().setPopularity(a.getAct2().getPopularity() + 0.5);
            a.getAct3().setPopularity(a.getAct3().getPopularity() + 0.5);
            return a;
        }
        else if (bRev > aRev){
            b.getAct1().setPopularity(b.getAct1().getPopularity() + 0.5);
            b.getAct2().setPopularity(b.getAct2().getPopularity() + 0.5);
            b.getAct3().setPopularity(b.getAct3().getPopularity() + 0.5);
            return b;
        }
        else{
            if(Math.random() >= 0.5){
                a.getAct1().setPopularity(a.getAct1().getPopularity() + 0.5);
                a.getAct2().setPopularity(a.getAct2().getPopularity() + 0.5);
                a.getAct3().setPopularity(a.getAct3().getPopularity() + 0.5);
                return a;
            }
            b.getAct1().setPopularity(b.getAct1().getPopularity() + 0.5);
            b.getAct2().setPopularity(b.getAct2().getPopularity() + 0.5);
            b.getAct3().setPopularity(b.getAct3().getPopularity() + 0.5);
            return b;
        }
    }

    /**
     * This function takes an act and a person number and will fire and hire that person.
     * The old person will be replaced with a new person.
     * @param a - the act that is being simulated
     * @param x - the person number that is being simulated
     * @param newPerson - the new person that is replacing the old person
     */
    public static void fireAndHirePerson(Acts a, int x, People newPerson){
        if(x == 1){
            a.setPerson1(newPerson);
        }
        else if(x == 2){
            a.setPerson2(newPerson);
        }
        else{
            a.setPerson3(newPerson);
        }
    }
}
