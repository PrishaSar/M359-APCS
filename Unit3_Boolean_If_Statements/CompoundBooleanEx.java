package Unit3_Boolean_If_Statements;

public class CompoundBooleanEx {
    public static void main(String[] args) {
        String day = "Saturday";
        int numHwAssignments = 2;

        //1. Alice loves video games. She plays video games if it's Saturday or if no hw,

        if(day.equals("Saturday") || numHwAssignments == 0){
            System.out.println("Yay, video games!");
        }
        else{
            System.out.println("I guess I'll have to wait :(");
        }

        //2.
        if(day.equals("Monday") && numHwAssignments <= 2){
            System.out.println("Yay, coding club!");
        }
        else{
            System.out.println("Today is a sad day :(");
        }

        //3.
       double prob = Math.random();
        if (day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("exercise");
        }
        else if (numHwAssignments == 0){
            if (prob <=0.8){
                System.out.println("exercise");
            }
            else{
                System.out.println("no exercise");
            }
        }
        else{
            if(prob <=0.3){
                System.out.println("exercise");
            }
            else{
                System.out.println("no exercise");
            }
        }
    }
}
