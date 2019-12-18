package quantitymeasurement;

public class Weight {

    private final Conversion.Unit unit;
    private final double value;

    public Weight(Conversion.Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static double addWeight(double value1, double value2) {
        return value1 + value2;
    }

    public boolean compare(Weight that) {
        Double firstValue = this.unit.converter(this.value);
        Double secondValue = that.unit.converter(that.value);
        return firstValue.equals(secondValue);
    }

    public double addition(Weight that) {
        Double firstValue = this.unit.converter(this.value);
        Double secondValue = that.unit.converter(that.value);
        return firstValue + secondValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 &&
                unit == weight.unit;
    }
}
