package U2objects;

public class WrapperExample {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

        //created a wrapped integer
        Integer wrappedInt = new Integer(6);
        System.out.println(wrappedInt.intValue());

        //create a wrapped integer using AUTOBOXING
        Integer wrappedInt2 = 12;
        //UNBOXING
        System.out.println(wrappedInt2);

        //create a wrapped double
        Double doub = 23.4;
        System.out.println(doub);

        //display the mininum/maximum integer value
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
