package Unite4_loops.PigLatinLab;

public class PigLatin {

    /**
     * This takes one word and translates it to pig latin
     * @param word This is a string parameter
     * @return This returns the translated word in string form
     */
    public static String translateWordToPigLatin(String word){
        char first = word.charAt(0);
        if(PigLatin.startsWithVowel(first)){
            word += "yay";
        }
        else{
            String prefix = "";
            while(!PigLatin.startsWithVowel(first)){
                prefix += first;
                word = word.substring(1);
                first = word.charAt(0);
            }
            if (Character.isUpperCase(prefix.charAt(0))){
                first = prefix.charAt(0);
                first = Character.toLowerCase(first);
                if(prefix.length() != 0){
                    prefix = first + prefix.substring(1);
                }
                else{
                    prefix = "";
                }
            }
            word = word + prefix + "ay";
        }
        return word;
    }

    /**
     * This fuction checks if the checks if the vowel rule applies to a word
     * @param letter This takes in a character to check
     * @return This returns a boolean
     */
    private static boolean startsWithVowel(char letter){
        letter = Character.toLowerCase(letter);
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            return true;
        }
        return false;
    }

    /**
     * This translates a whole phrase to Pig Latin
     * @param phrase This is the full phrase that can be translated to Pig Latin
     * @return This is the phrase translated to Pig Latin
     */
    public static String toPigLatin(String phrase){
        String out = "";
        int loc = phrase.indexOf(" ");
        String word = "";
        while (loc != -1){
            word = phrase.substring(0,loc);
            out += PigLatin.translateWordToPigLatin(word) + " ";
            phrase = phrase.substring(loc + 1);
            loc = phrase.indexOf(" ");
        }
        out += PigLatin.translateWordToPigLatin(phrase);
        char capLet = out.charAt(0);
        out = Character.toUpperCase(capLet) + out.substring(1);
        return out;
    }


}
