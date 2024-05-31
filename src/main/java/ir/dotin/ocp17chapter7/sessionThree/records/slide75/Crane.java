package ir.dotin.ocp17chapter7.sessionThree.records.slide75;

public record Crane(int numberEggs, String name) {

    @Override public int numberEggs() { return 10; }
    @Override public String toString() { return name; }
}
