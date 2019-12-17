public class Length {

    private static final double FEET_TO_INCH = 12.0;
    enum Unit {FEET, INCH}

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(unit.FEET) && that.unit.equals(unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(unit.INCH) && that.unit.equals(unit.INCH))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(unit.FEET) && that.unit.equals(unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(unit.INCH) && that.unit.equals(unit.FEET)) {
            return Double.compare(this.value, that.value * Math.round(FEET_TO_INCH)) == 0;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length inch = (Length) o;
        return Double.compare(inch.value, value) == 0;
    }
}
