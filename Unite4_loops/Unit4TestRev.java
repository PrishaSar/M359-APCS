package Unite4_loops;

import java.util.Scanner;

public class Unit4TestRev {
    public static void main(String[] args) {
        System.out.println(doubleChar("hello"));
        System.out.println(repeatFront("helloAgain", 6));

        String str = "hello everyone!";
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.substring(i, i+1) + "\n");
        }

        System.out.println();
        System.out.println(reverseRemove(str));
        System.out.println(removeChar(str, 'e'));

        str = "HocusPocus";
        for(int i = 1; i < str.length(); i+=2){
            System.out.println(str.substring(0, i + 1));
        }

        System.out.println(buildPhrase());
        System.out.println();

        for(int i = 1; i <=5; i++){
            for(int j = 1; j <=i; j++){
                int num = j*i;
                System.out.print(num + "\t\t");
            }
            System.out.println();
        }

        System.out.println();
        findFactors(40);

    }

    public static String doubleChar(String str){
        String newString = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            newString += c;
            newString += c;
        }
        return newString;
    }

    public static String repeatFront(String str, int n){
        String out = "";
        for(int i = n; i >= 0; i--){
            out += str.substring(0, i);
        }
        return out;
    }

    public static String reverseRemove(String str){
        String out = "";
        for(int i = str.length()-1; i >= 0; i-=2){
            out += str.substring(i,i+1);
        }
        return out;
    }

    public static String removeChar(String str, char c){
        while(str.indexOf(c) != -1){
            int loc = str.indexOf(c);
            str = str.substring(0, loc) + str.substring(loc+1);
        }
        return str;
    }

    public static String buildPhrase(){
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word of your phrase (-1 to quit)");
        String word = input.nextLine();

        while(!word.equals("-1")){
            str += word + " ";
            System.out.println("Enter the next word of your phrase (-1 to quit)");
            word = input.nextLine();
        }
        return str;
    }

    public static void findFactors(int num){
        for(int i = num; i >= 1; i--){
            if (40%i == 0){
                System.out.print(i + " ");
            }
        }
    }

}
