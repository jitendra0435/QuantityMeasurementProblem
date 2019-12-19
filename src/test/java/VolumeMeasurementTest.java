import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Conversion;
import quantitymeasurement.Measurement;

public class VolumeMeasurementTest {
    @Test
    public void givenOf0MLAnd0MlShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.ML, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.ML, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1MLAnd1MlShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.ML, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.ML, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1MLAnd0MlShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.ML, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.ML, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf0LITREAnd0LITREShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.LITRE, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.LITRE, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1LITREAnd1LITREShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.LITRE, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.LITRE, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1LITREAnd0LITREShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.LITRE, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.LITRE, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf0GALLONAnd0GALLONShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GALLON, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GALLON, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GALLONAnd1GALLONShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GALLON, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GALLON, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GALLONAnd0GALLONShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GALLON, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GALLON, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1000mlAnd1litShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.ML, 1000.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.LITRE, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000mlAnd1GallonShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.ML, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GALLON, 0.000264172);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000litAnd1mlShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.LITRE, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GALLON, 0.264172);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000litAnd1GallonShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.ML, 1000.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.LITRE, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GALLONAnd1mlShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GALLON, 0.000264172);
        Measurement Measurement2 = new Measurement(Conversion.Unit.ML, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000GALLONAnd1litShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GALLON, 0.264172);
        Measurement Measurement2 = new Measurement(Conversion.Unit.LITRE, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }
    //------------------addition--------

    @Test
    public void givenAdditionOf10mlAnd10mlShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.ML, 10.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.ML, 10.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(20.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10litAnd10litShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.LITRE, 10.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.LITRE, 10.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(20000.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10GallonAnd10GallonShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GALLON, 10.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GALLON, 10.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(75708, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1000mlAnd10litShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.ML, 10.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.LITRE, 10.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(10010, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1000mlAnd1GallonShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.ML, 10.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GALLON, 10.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(37864, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10litAnd100mlShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.LITRE, 10.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.ML, 100.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(10100, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10litAnd1GallonShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.LITRE, 10.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GALLON, 1.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(13785, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1GallonAnd10000mlShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GALLON, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.ML, 10000.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(13785, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1GallonAnd10litShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GALLON, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.LITRE, 10.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(13785, compare, 0.0);
    }
}