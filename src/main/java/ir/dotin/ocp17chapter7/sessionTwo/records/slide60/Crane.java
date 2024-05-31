package ir.dotin.ocp17chapter7.sessionTwo.records.slide60;

public final class Crane {
    private final int numberEggs;
    private final String name;

    public Crane(int numberEggs, String name) {
        if (numberEggs >= 0) this.numberEggs = numberEggs;
        else throw new IllegalArgumentException();
        this.name = name;
    }

    public int getNumberEggs() {
        return numberEggs;
    }

    public String getName() {
        return name;
    }
}
