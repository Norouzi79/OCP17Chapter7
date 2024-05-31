package ir.dotin.ocp17chapter7.sessionThree.records.slide71;

public record Crane(int numberEggs, String name) {
    public Crane {
        if (numberEggs < 0) throw new IllegalArgumentException();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
