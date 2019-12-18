import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Conversion;
import quantitymeasurement.Volume;

public class VolumeMeasurementTest {
    @Test
    public void givenOf0MLAnd0MlShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.ML, 0.0);
        Volume volume2 = new Volume(Conversion.Unit.ML, 0.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1MLAnd1MlShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.ML, 1.0);
        Volume volume2 = new Volume(Conversion.Unit.ML, 1.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1MLAnd0MlShouldReturnFalse() {
        Volume volume1 = new Volume(Conversion.Unit.ML, 1.0);
        Volume volume2 = new Volume(Conversion.Unit.ML, 0.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf0LITREAnd0LITREShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.LITRE, 0.0);
        Volume volume2 = new Volume(Conversion.Unit.LITRE, 0.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1LITREAnd1LITREShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.LITRE, 1.0);
        Volume volume2 = new Volume(Conversion.Unit.LITRE, 1.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1LITREAnd0LITREShouldReturnFalse() {
        Volume volume1 = new Volume(Conversion.Unit.LITRE, 1.0);
        Volume volume2 = new Volume(Conversion.Unit.LITRE, 0.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf0GALLONAnd0GALLONShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.GALLON, 0.0);
        Volume volume2 = new Volume(Conversion.Unit.GALLON, 0.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GALLONAnd1GALLONShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.GALLON, 1.0);
        Volume volume2 = new Volume(Conversion.Unit.GALLON, 1.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GALLONAnd0GALLONShouldReturnFalse() {
        Volume volume1 = new Volume(Conversion.Unit.GALLON, 1.0);
        Volume volume2 = new Volume(Conversion.Unit.GALLON, 0.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1000mlAnd1litShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.ML, 1000.0);
        Volume volume2 = new Volume(Conversion.Unit.LITRE, 1.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000mlAnd1GallonShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.ML, 1.0);
        Volume volume2 = new Volume(Conversion.Unit.GALLON, 0.000264172);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000litAnd1mlShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.LITRE, 1.0);
        Volume volume2 = new Volume(Conversion.Unit.GALLON, 0.264172);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000litAnd1GallonShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.ML, 1000.0);
        Volume volume2 = new Volume(Conversion.Unit.LITRE, 1.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GALLONAnd1mlShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.GALLON, 0.000264172);
        Volume volume2 = new Volume(Conversion.Unit.ML, 1.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000GALLONAnd1litShouldReturnTrue() {
        Volume volume1 = new Volume(Conversion.Unit.GALLON, 0.264172);
        Volume volume2 = new Volume(Conversion.Unit.LITRE, 1.0);
        boolean compare = volume1.compare(volume2);
        Assert.assertTrue(compare);
    }
    //------------------addition--------

    @Test
    public void givenAdditionOf10mlAnd10mlShouldReturnEqualsReturn() {
        Volume volume1 = new Volume(Conversion.Unit.ML, 10.0);
        Volume volume2 = new Volume(Conversion.Unit.ML, 10.0);
        double compare = volume1.addition(volume2);
        Assert.assertEquals(20.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10litAnd10litShouldReturnEqualsReturn() {
        Volume volume1 = new Volume(Conversion.Unit.LITRE, 10.0);
        Volume volume2 = new Volume(Conversion.Unit.LITRE, 10.0);
        double compare = volume1.addition(volume2);
        Assert.assertEquals(20000.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10GallonAnd10GallonShouldReturnEqualsReturn() {
        Volume volume1 = new Volume(Conversion.Unit.GALLON, 10.0);
        Volume volume2 = new Volume(Conversion.Unit.GALLON, 10.0);
        double compare = volume1.addition(volume2);
        Assert.assertEquals(75708, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1000mlAnd10litShouldReturnEqualsReturn() {
        Volume volume1 = new Volume(Conversion.Unit.ML, 10.0);
        Volume volume2 = new Volume(Conversion.Unit.LITRE, 10.0);
        double compare = volume1.addition(volume2);
        Assert.assertEquals(10010, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1000mlAnd1GallonShouldReturnEqualsReturn() {
        Volume volume1 = new Volume(Conversion.Unit.ML, 10.0);
        Volume volume2 = new Volume(Conversion.Unit.GALLON, 10.0);
        double compare = volume1.addition(volume2);
        Assert.assertEquals(37864, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10litAnd100mlShouldReturnEqualsReturn() {
        Volume volume1 = new Volume(Conversion.Unit.LITRE, 10.0);
        Volume volume2 = new Volume(Conversion.Unit.ML, 100.0);
        double compare = volume1.addition(volume2);
        Assert.assertEquals(10100, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10litAnd1GallonShouldReturnEqualsReturn() {
        Volume volume1 = new Volume(Conversion.Unit.LITRE, 10.0);
        Volume volume2 = new Volume(Conversion.Unit.GALLON, 1.0);
        double compare = volume1.addition(volume2);
        Assert.assertEquals(13785, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1GallonAnd10000mlShouldReturnEqualsReturn() {
        Volume volume1 = new Volume(Conversion.Unit.GALLON, 1.0);
        Volume volume2 = new Volume(Conversion.Unit.ML, 10000.0);
        double compare = volume1.addition(volume2);
        Assert.assertEquals(13785, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1GallonAnd10litShouldReturnEqualsReturn() {
        Volume volume1 = new Volume(Conversion.Unit.GALLON, 1.0);
        Volume volume2 = new Volume(Conversion.Unit.LITRE, 10.0);
        double compare = volume1.addition(volume2);
        Assert.assertEquals(13785, compare, 0.0);
    }
}