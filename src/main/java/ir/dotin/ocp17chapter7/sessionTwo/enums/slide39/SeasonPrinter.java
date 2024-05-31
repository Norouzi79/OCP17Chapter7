package ir.dotin.ocp17chapter7.sessionTwo.enums.slide39;

public class SeasonPrinter {
    public static void main(String[] args) {
        for (var season : Season.values()) {
            System.out.printf(season.name() + " expected visitors: ");
            season.printExpectedVisitors();
        }
    }
}
