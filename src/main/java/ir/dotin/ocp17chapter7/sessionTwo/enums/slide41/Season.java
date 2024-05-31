package ir.dotin.ocp17chapter7.sessionTwo.enums.slide41;

public enum Season {
    WINTER("Low") {
        public String getHours() {
            return "10am-3pm";
        }
    },

    SPRING("Medium") {
        public String getHours() {
            return "9am-5pm";
        }
    },

    SUMMER("High") {
        public String getHours() {
            return "9am-7pm";
        }
    },

    FALL("Medium") {
        public String getHours() {
            return "9am-5pm";
        }
    };

    private final String expectedVisitors;

    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.printf(expectedVisitors + "\n");
    }

    public abstract String getHours();
}
