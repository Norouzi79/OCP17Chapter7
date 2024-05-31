package ir.dotin.ocp17chapter7.sessionTwo.enums.slide37;

import ir.dotin.ocp17chapter7.sessionTwo.enums.slide35.Season;

public class SeasonPrinter {
    public static void main(String[] args) {
        for (var season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

//        if (Season.SUMMER == 2) {} //DOES NOT COMPILE
    }
}
