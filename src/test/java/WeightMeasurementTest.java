import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Conversion;
import quantitymeasurement.Measurement;


public class WeightMeasurementTest {
    @Test
    public void givenOf0GMAnd0GMShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GRAM, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0GMAnd1GMShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GRAM, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1GMAnd1GMShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GRAM, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GMAnd1KgShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1GMAnd1QuintalShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1000GMAnd1KgShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 1000.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GMAnd1000KgShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 1000.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf100000GMAnd1QuintalShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 100000.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GMAnd10000QuintalShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 10000.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1KGAnd1KGShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0KGAnd0KGShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.KG, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0KGAnd1KGShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.KG, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1KGAnd1000GRAMShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GRAM, 1000.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1KGAnd0Point1QuintalShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 0.01);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf100KGAnd1QuintalShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.KG, 100.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0QuintalAnd0Point0QuintalShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.QUINTAL, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0QuintalAnd0Point1QuintalShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.QUINTAL, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1QuintalAnd0Point1QuintalShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1QuintalAnd0Point10000GramShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GRAM, 100000.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1QuintalAnd0Point100KGShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 100.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd1Tonne_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.TONNE, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf0TonneAnd0Tonne_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.TONNE, 0.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.TONNE, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd0Tonne_shouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.TONNE, 0.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd1Quintal_shouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd10Quintal_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 10.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd1000KG_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 1000.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd10000GM_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GRAM, 1000000.0);
        boolean compare = Measurement1.compare(Measurement2);
        Assert.assertTrue(compare);
    }
    //--------------addition----------------

    @Test
    public void givenAdditionOf1GramAnd1GramInchEquals2Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.GRAM, 1.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(2.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1KGAnd9KgEquals10000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 9.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(10000.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1TonneAnd1TonneInchEquals2000000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.TONNE, 1.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(2000000.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1QuintalAnd1QuintalInchEquals200000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(200000.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1GmAnd1QuintalInchEquals100001Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(100001, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1GmAnd1KgInchEquals1001Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 1.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(1001, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10000GmAnd1TonneInchEquals1010000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 10000.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.TONNE, 1.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(1010000, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1KgAnd1QuintalInchEquals101000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(101000, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1KgAnd1TonneInchEquals1000001Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.TONNE, 1.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(1000001, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1KgAnd9KgEquals2000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.KG, 1.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(2000, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10KgAnd1000GramInchEquals1_00001E9Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.KG, 10.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.TONNE, 1000.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(1.00001E9, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1QuintalAnd10TonneInchEquals1_01E7Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Conversion.Unit.QUINTAL, 1.0);
        Measurement Measurement2 = new Measurement(Conversion.Unit.TONNE, 10.0);
        double compare = Measurement1.addition(Measurement2);
        Assert.assertEquals(1.01E7, compare, 0.0);
    }
}
