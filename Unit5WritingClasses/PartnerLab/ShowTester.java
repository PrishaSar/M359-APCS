package Unit5WritingClasses.PartnerLab;

public class ShowTester {

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
    Show catAnddog = new Show(catGymnastics, musical, danceMash, true, false);

    // concert, magic
}
