package ir.dotin.ocp17chapter7.sessionTwo.enums.slide41;

public class SeasonPrinter {
    public static void main(String[] args) {
        for (var season : Season.values()) {
            System.out.printf(season.name() + " expected visitors: ");
            season.printExpectedVisitors();
            System.out.println("Hours: " + season.getHours() + "\n");
        }
    }
}
