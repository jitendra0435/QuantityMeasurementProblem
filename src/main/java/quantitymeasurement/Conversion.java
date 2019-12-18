package quantitymeasurement;

public class Conversion {
    public enum Unit {
        FEET {
            public double converter(double value) {
                return value * 12;
            }
        },
        INCH {
            public double converter(double value) {
                return value;
            }
        },
        YARD {
            public double converter(double value) {
                return value * 36;
            }
        },
        CM {
            public double converter(double value) {
                return (Math.round(value / 2.54));
            }
        },
        KG {
            public double converter(double value) {
                return value * 1000;
            }
        },
        GRAM {
            public double converter(double value) {
                return value;
            }
        },
        QUINTAL {
            public double converter(double value) {
                return value * 100000;
            }
        };

        public double converter(double value) {
            return 0.0;
        }
    }
}

