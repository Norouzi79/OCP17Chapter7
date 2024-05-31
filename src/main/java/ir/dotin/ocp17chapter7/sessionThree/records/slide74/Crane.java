package ir.dotin.ocp17chapter7.sessionThree.records.slide74;

public record Crane(int numberEggs, String name) {
    /**
     * You can only transform the data on the first line.
     * After the first line, all the fields will already be assigned, and the object is immutable.
     * you also can’t declare two record constructors that call each other infinitely or as a cycle.
     * @param firstName
     * @param lastName
     */
    public Crane(Integer numberOfEggs, String firstName, String lastName) {
        this(numberOfEggs, firstName + " " + lastName);
        numberOfEggs = 10; // No effect (applies to parameter, not instance field)
//        this.numberEggs = 20; //DOES NOT COMPILE
    }
}
