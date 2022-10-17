package Unite4_loops;

public class Notes_4_3_String {
    public static void main(String[] args) {
        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line

        for(int i = 0; i < mySchool.length(); i+=2){
            System.out.print(mySchool.substring(i, i+1));
        }

        System.out.println("");
        // print the String mySchool in reverse (all characters on the same line)

        for(int i = mySchool.length() - 1; i >= 0; i--){
            System.out.print(mySchool.substring(i, i+1));
        }

        System.out.println();

         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey

        */

        String animal = "monkey";

        for(int i = 0; i <= animal.length(); i++){
            System.out.println(animal.substring(0,i));
        }


        System.out.println();


        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        // Print the amount of times the word "little" appears within phrase?
        //solution that will take less time:
//        int count = 0;
//        for(int i = 0; i < phrase.length(); i++){
//            if (i < phrase.length() - 5){
//                if(phrase.substring(i, i+6).equals("little")){
//                    count += 1;
//                }
//            }
//        }
//        System.out.println("The word 'little' appears " + count + " times.");
        int count = 0;
        int index = -1;
        int loc = -1;
        String findPhrase = "little";
        while (index < phrase.length()){
            phrase = phrase.substring(index +1);
            loc = phrase.indexOf(findPhrase);
            if(loc != -1){
                count ++;
                index = loc;
            }
            else{
                index++;
            }
        }

        System.out.println("The word 'little' appears " + count + " times.");

        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
//    String output = "";
//
//        for(int i = 0; i < phrase.length(); i++){
//            if (i < phrase.length() - 5){
//                if(phrase.substring(i, i+6).equals("little")){
//                    i += 6;
//                }
//            }
//            output += phrase.substring(i, i+1);
//        }

        loc = -1;
        phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";
        boolean isDone = false;
        while (!isDone){
            loc = phrase.indexOf("little");
            if(loc != -1){
                phrase = phrase.substring(0, loc) + phrase.substring(loc + 7);
            }
            else{
                isDone = true;
            }
        }

        System.out.println(phrase);

        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"
        phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        isDone = false;
        while (!isDone){
            loc = phrase.indexOf("little");
            if(loc != -1){
                phrase = phrase.substring(0, loc) + "BIG" + phrase.substring(loc + 6);
            }
            else{
                isDone = true;
            }
        }

//        String big = "";
//
//        for(int i = 0; i < phrase.length(); i++){
//            if (i < phrase.length() - 5){
//                if(phrase.substring(i, i+6).equals("little")){
//                    i += 6;
//                    big += "BIG";
//                }
//            }
//            big += phrase.substring(i, i+1);
//        }

        System.out.println(phrase);

    }
}
