package ir.dotin.ocp17chapter7.sessionTwo.enums.slide39;

public enum Season {
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium");

    private final String expectedVisitors;

    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.printf(expectedVisitors + "\n");
    }
}
