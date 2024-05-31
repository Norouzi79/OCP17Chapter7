package ir.dotin.ocp17chapter7.sessionTwo.records.slide63;

import ir.dotin.ocp17chapter7.sessionTwo.records.slide61.Crane;

public class CranePrinter {
    public static void main(String[] args) {
        var mommy = new Crane(4, "Nok Tala");
        System.out.println(mommy.numberEggs());
        System.out.println(mommy.name());

        /*
        var mommy1 = new Crane("Nok Tala", 4 ); //DOES NOT COMPILE
        var mommy2 = new Crane("Nok Tala"); //DOES NOT COMPILE
        */
    }
}
