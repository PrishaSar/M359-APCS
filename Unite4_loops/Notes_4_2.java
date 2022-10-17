package Unite4_loops;

public class Notes_4_2 {
    public static void main(String[] args) {
        // print even #'s from 0 - 20 (same line)
        for(int i = 0; i < 21; i+=2){
                System.out.print(i + " ");
        }

        System.out.println("\n");

        //print the multiples of 5 from 5 to 100
        for(int i = 0; i <= 100; i+=5){
            System.out.print(i + " ");
        }

        //print all characters of S with a space
        String str = "FremdHS";
        String out = "\n\n";
        for(int i = 0; i < str.length(); i++){
            out += str.substring(i,i+1) + " ";
        }
        System.out.println(out + "\n");


        String outs = "";
        for(int i = str.length()-1; i >= 0; i--){
            outs += str.substring(i,i+1);
        }
        System.out.println(outs + "\n");

    }
}
