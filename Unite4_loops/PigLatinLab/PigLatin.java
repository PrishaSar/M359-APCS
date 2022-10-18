package Unite4_loops.PigLatinLab;

public class PigLatin {
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

    private static boolean startsWithVowel(char letter){
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            return true;
        }
        return false;
    }

    public static String toPigLatin(String phrase){
        String out = "";
        int loc = phrase.indexOf(" ");
        while (loc != -1){
            String word = phrase.substring(0,loc);
            out += PigLatin.translateWordToPigLatin(word) + " ";
            phrase = phrase.substring(loc + 1);
            loc = phrase.indexOf(" ");
        }
        return out;
    }
}
