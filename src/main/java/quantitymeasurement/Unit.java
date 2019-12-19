package quantitymeasurement;

    public enum Unit {
        FEET (TypeOfUnit.Length){
            public double converter(double value) {
                return value * 12;
            }
        },
        INCH (TypeOfUnit.Length){
            public double converter(double value) {
                return value;
            }
        },
        YARD (TypeOfUnit.Length){
            public double converter(double value) {
                return value * 36;
            }
        },
        CM (TypeOfUnit.Length){
            public double converter(double value) {
                return (Math.round(value / 2.54));
            }
        },
        KG (TypeOfUnit.Weight){
            public double converter(double value) {
                return value * 1000;
            }
        },
        GRAM (TypeOfUnit.Weight){
            public double converter(double value) {
                return value;
            }
        },
        QUINTAL (TypeOfUnit.Weight){
            public double converter(double value) {
                return value * 100000;
            }
        },
        TONNE (TypeOfUnit.Weight){
            public double converter(double value) {
                return value * 1000000;
            }
        },
        ML (TypeOfUnit.Volume){
            public double converter(double value) {
                return value;
            }
        },
        LITRE(TypeOfUnit.Volume) {
            public double converter(double value) {
                return value * 1000;
            }
        },
        GALLON (TypeOfUnit.Volume){
            public double converter(double value) {
                return Math.round(value * 3785.41);
            }
        },
        FARAD (TypeOfUnit.Temperature){
            public double converter(double value) {
                double c1 = Math.round((value - 32) * 5 / 9);
                return c1;
            }
        },
        CELSIUS(TypeOfUnit.Temperature) {
            public double converter(double value) {
                return value;
            }
        };

        private final TypeOfUnit typeOfUnit;
        Unit(TypeOfUnit typeOfUnit) {
            this.typeOfUnit=typeOfUnit;
        }
        public double converter(double value) {
            return 0.0;
        }
    }


