package Unit3_Boolean_If_Statements.ChevyJUnitLab;

public class Chevy_Driver {
    public static void main(String[] args) {
        Chevy bluesilverado = new Chevy(1990, 15000, 16.5, 37850, "Silverado",
                "Blue", true, true, false);
        System.out.println(bluesilverado.getGrandTotal());
        System.out.println(bluesilverado.toString());
    }
}
