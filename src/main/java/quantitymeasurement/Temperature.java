package quantitymeasurement;

public class Temperature {

    private final double value;
    private final Conversion.Unit unit;

    public Temperature(Conversion.Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Temperature that) {
        Double firstValue = this.unit.converter(this.value);
        Double secondValue = that.unit.converter(that.value);
        return firstValue.compareTo(secondValue) == 0;
    }

    public double addition(Temperature that) {
        double firstValue = this.unit.converter(this.value);
        double secondValue = that.unit.converter(that.value);
        return firstValue + secondValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }
}
