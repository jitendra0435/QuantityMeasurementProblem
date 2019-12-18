package quantitymeasurement;

public class Conversion {
    public enum Unit {
        FEET {
            public Double converter(double value) {
                return value * 12;
            }
        },
        INCH {
            public Double converter(double value) {
                return value;
            }
        },
        YARD {
            public Double converter(double value) {
                return value * 36;
            }
        };

        public Double converter(double value) {
            return 0.0;
        }
    }
}

