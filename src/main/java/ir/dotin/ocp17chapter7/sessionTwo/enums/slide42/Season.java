package ir.dotin.ocp17chapter7.sessionTwo.enums.slide42;

public enum Season implements Weather {
    WINTER("Low") {
        public String getHours() {
            return "10am-3pm";
        }

        public int getAverageTemperature() {
            return 4;
        }
    },

    SPRING("Medium") {
        public String getHours() {
            return "9am-5pm";
        }

        public int getAverageTemperature() {
            return 20;
        }
    },

    SUMMER("High") {
        public String getHours() {
            return "9am-7pm";
        }

        public int getAverageTemperature() {
            return 40;
        }
    },

    FALL("Medium") {
        public String getHours() {
            return "9am-5pm";
        }

        public int getAverageTemperature() {
            return 19;
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

    /*
    public int getAverageTemperature() {
        return 30;
    }
    */
}
