package Unit3_Boolean_If_Statements;

public class PizzaDriver {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Lou Malnati's", 14, 2, true);
        Pizza p2 = new Pizza("Papa John's", 12, false);

        p1.printInfo();
        p2.printInfo();

        String p1Desc = p1.toString();
        System.out.println(p1Desc);

        System.out.println(p1.equals(p2));
    }
}
