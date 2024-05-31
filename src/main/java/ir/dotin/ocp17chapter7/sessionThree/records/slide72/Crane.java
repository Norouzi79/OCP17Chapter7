package ir.dotin.ocp17chapter7.sessionThree.records.slide72;

public record Crane(int numberEggs, String name) {
    /**
     * While compact constructors can modify the constructor parameters,
     * they cannot modify the fields of the record.
     */

    /*
    public Crane {
        this.numberEggs = 10; //DOES NOT COMPILE
    }
    */
}
