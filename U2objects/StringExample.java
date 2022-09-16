package U2objects;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";
        //.toUpperCase returns the same string but in all caps
        System.out.println(s1.toUpperCase());
        //just prints out s1 -- .toUpperCase() didn't convert s1 to all caps, just printed it
        System.out.println(s1);
        //says FIRST instance of letter | -1 if not found
        System.out.println(s2.indexOf("u"));
        System.out.println(s2.indexOf("x"));
        //from index specified to END if only one number (inclusive)
        System.out.println(s1.substring(4));
        //from index specified to BEFORE the last index (inclusive, exclusive)
        System.out.println(s1.substring(2,5));
        //.length returns # of characters in a string
        System.out.println(s1.length());
        System.out.println(s2.length());
        //.equals() is true if strings are equal
        boolean isEqual = s1.equals("VACATION");
        System.out.println(isEqual);

        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";
        //caps matter in comparing too!
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s3));
        System.out.println(s4.compareTo(s3));
    }
}
