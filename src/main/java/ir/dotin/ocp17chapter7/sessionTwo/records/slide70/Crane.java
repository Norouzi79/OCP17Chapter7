package ir.dotin.ocp17chapter7.sessionTwo.records.slide70;

public record Crane(int numberEggs, String name) {
    public Crane {
        if (numberEggs < 0) throw new IllegalArgumentException();
        name = name.toUpperCase();
    }
}
