import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Conversion;
import quantitymeasurement.Measurement;


public class TemperatureMeasurementTest {

    @Test
    public void givenOf0FARADAnd0FARAD_shouldReturnTrue() {
        Measurement Measurement2 = new Measurement(Conversion.Unit.FARAD, 0.0);
        Measurement Measurement1 = new Measurement(Conversion.Unit.FARAD, 0.0);
        Assert.assertEquals(Measurement1, Measurement2);
    }

    @Test
    public void givenOf1FARADAnd1FARAD_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.FARAD, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.FARAD, 1.0);
        Assert.assertEquals(Measurement1, Measurement2);
    }

    @Test
    public void givenOf1FARADAnd0FARAD_shouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.FARAD, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.FARAD, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf0CELSIUSAnd0CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.CELSIUS, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.CELSIUS, 0.0);
        Assert.assertEquals(Measurement1, Measurement2);
    }

    @Test
    public void givenOf1CELSIUSAnd1CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.CELSIUS, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.CELSIUS, 1.0);
        Assert.assertEquals(Measurement1, Measurement2);
    }

    @Test
    public void givenOf1CELSIUSAnd0CELSIUS_shouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.CELSIUS, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.CELSIUS, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf33_8FARADAnd1CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.FARAD, 33.8);
        Measurement Measurement2 = new Measurement(Conversion.Unit.CELSIUS, 1.0);
        boolean equals = Measurement1.compare(Measurement2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf1FARADAnd17CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.FARAD, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.CELSIUS, -17.0);
        boolean equals = Measurement1.compare(Measurement2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf100FARADAnd38CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.FARAD, 100.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.CELSIUS, 38.0);
        boolean equals = Measurement1.compare(Measurement2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf212FARADAnd100CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.FARAD, 212.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.CELSIUS, 100.0);
        boolean equals = Measurement1.compare(Measurement2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf50FARADAnd10CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.FARAD, 50.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.CELSIUS, 10.0);
        boolean equals = Measurement1.compare(Measurement2);
        Assert.assertTrue(equals);
    }
}
