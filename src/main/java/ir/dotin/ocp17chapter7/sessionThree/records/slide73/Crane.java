package ir.dotin.ocp17chapter7.sessionThree.records.slide73;

public record Crane(int numberEggs, String name) {
    /**
     * You can also create overloaded constructors that take a completely different list of parameters.
     * @param firstName
     * @param lastName
     */
    public Crane(String firstName, String lastName) {
        this(0, firstName + " " + lastName);
    }
}
