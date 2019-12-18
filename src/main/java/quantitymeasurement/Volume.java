package quantitymeasurement;

public class Volume {

    private final double value;
    private final Conversion.Unit unit;

    public Volume(Conversion.Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Volume that) {
        Double firstValue = this.unit.converter(this.value);
        Double secondValue = that.unit.converter(that.value);
        return firstValue.equals(secondValue);
    }

    public double addition(Volume that) {
        double firstValue = this.unit.converter(this.value);
        double secondValue = that.unit.converter(that.value);
        return firstValue + secondValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 &&
                unit == volume.unit;
    }
}
