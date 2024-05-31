package ir.dotin.ocp17chapter7.sessionTwo.records.slide65;

import ir.dotin.ocp17chapter7.sessionTwo.records.slide61.Crane;

public class CranePrinter {
    public static void main(String[] args) {
        var father = new Crane(0, "Agha Tala");
        System.out.println(father); // Crane[numberEggs=0, name=Agha Tala]

        var copy = new Crane(0, "Agha Tala");
        System.out.println(copy); // Crane[numberEggs=0, name=Agha Tala]
        System.out.println(copy.equals(father)); // true
        System.out.println(copy.hashCode() + ", " + father.hashCode()); // -1779303293, -1779303293
    }
}
