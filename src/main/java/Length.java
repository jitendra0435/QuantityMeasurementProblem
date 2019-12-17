public class Length {

    enum Unit {FEET, INCH}

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length inch = (Length) o;
        return Double.compare(inch.value, value) == 0;
    }
}
