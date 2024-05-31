package ir.dotin.ocp17chapter7.sessionTwo.enums.slide38;

import ir.dotin.ocp17chapter7.sessionTwo.enums.slide35.Season;

public class SeasonPrinter {
    public static void main(String[] args) {
        Season s = Season.valueOf("SUMMER"); //SUMMER
        System.out.println(s);
        try {
            Season t = Season.valueOf("summer"); //IllegalArgumentException
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
