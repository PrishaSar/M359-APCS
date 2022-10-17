package Unite4_loops;

public class Notes_4_5 {
    public static void main(String[] args) {

        outputBreak("Challenge 1: Number Pyramid 1 to 5");
        for(int i = 5; i>0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        outputBreak("Challenge 2:");
        for(int i = 5; i>0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        outputBreak("Challenge 3:");
        everyOtherLetterPyramid("FremdVikings");

        outputBreak("Challenge 4:");
        everyOtherWordBackwards("Boy these loops are tricky!");

    }

    public static void outputBreak(String title){
        System.out.println();
        System.out.println();
        System.out.println(title);
        System.out.println();
    }

    public static void everyOtherLetterPyramid(String str){
        System.out.println(str);
        boolean isDone = false;
        while(!isDone){
            String temp = "";
            for(int i = 0; i < str.length(); i+=2){
                temp += str.charAt(i);
            }
            if(temp.length() == 1){
                isDone = true;
            }
            str = temp;
            System.out.println(str);
        }
    }
    
    public static void everyOtherWordBackwards(String str){
        String out = "";
        int loc = str.indexOf(" ");
        while(loc != -1){
            String temp = str.substring(0, loc);
            for(int i = temp.length()-1; i >= 0; i--){
                out += temp.substring(i, i+1);
            }
            out += " ";
            str = str.substring(loc +1);
            loc = str.indexOf(" ");
        }
    }
}
