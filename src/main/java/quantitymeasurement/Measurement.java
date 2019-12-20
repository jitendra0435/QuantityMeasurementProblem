package quantitymeasurement;

public class Measurement {

    private final double value;
    private final Unit unit;

    public Measurement(Unit unit, double value) {
        this.value = value;
         this.unit = unit;
    }

    public boolean compare(Measurement that) throws UnitsMismatchException {
        if (this.unit.typeOfUnit.equals(that.unit.typeOfUnit)) {
            Double firstValue = this.unit.converter(this.value);
            Double secondValue = that.unit.converter(that.value);
            return firstValue.equals(secondValue);
        }
        throw new UnitsMismatchException(UnitsMismatchException.ExceptionType.TYPE_MISMATCH);
    }

    public double addition(Measurement that) throws UnitsMismatchException {
        if (this.unit.typeOfUnit.equals(that.unit.typeOfUnit)) {
            double firstValue = this.unit.converter(this.value);
            double secondValue = that.unit.converter(that.value);
            return firstValue + secondValue;
        }
        throw new UnitsMismatchException(UnitsMismatchException.ExceptionType.TYPE_MISMATCH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement inch = (Measurement) o;
        return Double.compare(inch.value, value) == 0;
    }
}