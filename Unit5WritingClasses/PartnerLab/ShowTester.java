//Isabella Chen, Prisha Saraiya, Mr. Moon, period 7
//Purpose of Class:
package Unit5WritingClasses.PartnerLab;

public class ShowTester {

    public static void main(String[] args) {
        People none = new People();

        //creating act 1
        People trainer = new People("Trainer", "Isabella", false);
        Acts catGymnastics = new Acts("Acrobatics", 15, 8, trainer, none, none);

        //creating act 2
        People mainLeadF = new People("Main Lead Female", "Stara", false);
        People props = new People("Handling Props and Music", "Joe", true);
        People secondLead = new People("Second Lead Male", "Jerry Moon", false);
        Acts musical = new Acts("Musical", 30, 7, mainLeadF, props, secondLead);

        //creating act 3
        People primaBallerina = new People("Lead Dancer", "Christina", false);
        People hipHoper = new People("Lead Hip Hop Dancer", "Split", false);
        People jazzDancer = new People("Lead Jazz Dancer and Music Player", "Darl", false);
        Acts danceMash = new Acts("Dance", 45, 5, primaBallerina, hipHoper, jazzDancer);

        //creating show
        Show mixAndMatch = new Show(catGymnastics, musical, danceMash, true, false);
        
        // concert, magic
        //act 1 - disapearing ppl: 2
        //act 2 - ghost thing ppl: 1 & 2 backstage
        //act 3 - card tricks ppl: 1 
        //interact w/ static variable and method
        //Java documentation
    }

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

    //one other static method (param = objects)
    //both change instance var??
    //fire person??/change --> parameters - act object, digit(or var name), replace person object
  



}
