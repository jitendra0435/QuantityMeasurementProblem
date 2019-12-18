package quantitymeasurement;

public class Length {

    private final double value;
    private final Conversion.Unit unit;

    public Length(Conversion.Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length that) {
        Double firstValue = this.unit.converter(this.value);
        Double secondValue = that.unit.converter(that.value);
        return firstValue.equals(secondValue);
    }

    public double addition(Length that) {
        double firstValue = this.unit.converter(this.value);
        double secondValue = that.unit.converter(that.value);
        return firstValue + secondValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length inch = (Length) o;
        return Double.compare(inch.value, value) == 0;
    }
}