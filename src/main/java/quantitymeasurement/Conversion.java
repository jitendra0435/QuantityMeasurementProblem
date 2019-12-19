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
        },
        TONNE {
            public double converter(double value) {
                return value * 1000000;
            }
        },
        ML {
            public double converter(double value) {
                return value;
            }
        },
        LITRE {
            public double converter(double value) {
                return value * 1000;
            }
        },
        GALLON {
            public double converter(double value) {
                return Math.round(value * 3785.41);
            }
        },
        FARAD {
            public double converter(double value) {
                double c1 = Math.round((value - 32) * 5 / 9);
                return c1;
            }
        },
        CELSIUS {
            public double converter(double value) {
                return value;
            }
        };

        public double converter(double value) {
            return 0.0;
        }
    }
}

