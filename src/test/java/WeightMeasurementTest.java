import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Conversion;
import quantitymeasurement.Weight;

public class WeightMeasurementTest {
    @Test
    public void givenOf0GMAnd0GMShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.GRAM, 0.0);
        Weight weight2 = new Weight(Conversion.Unit.GRAM, 0.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0GMAnd1GMShouldReturnFalse() {
        Weight weight1 = new Weight(Conversion.Unit.GRAM, 0.0);
        Weight weight2 = new Weight(Conversion.Unit.GRAM, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1GMAnd1GMShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.GRAM, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.GRAM, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GMAnd1KgShouldReturnFalse() {
        Weight weight1 = new Weight(Conversion.Unit.GRAM, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.KG, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1GMAnd1QuintalShouldReturnFalse() {
        Weight weight1 = new Weight(Conversion.Unit.GRAM, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1000GMAnd1KgShouldReturnFalse() {
        Weight weight1 = new Weight(Conversion.Unit.GRAM, 1000.0);
        Weight weight2 = new Weight(Conversion.Unit.KG, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GMAnd1000KgShouldReturnFalse() {
        Weight weight1 = new Weight(Conversion.Unit.GRAM, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.KG, 1000.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf100000GMAnd1QuintalShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.GRAM, 100000.0);
        Weight weight2 = new Weight(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GMAnd10000QuintalShouldReturnFalse() {
        Weight weight1 = new Weight(Conversion.Unit.GRAM, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.QUINTAL, 10000.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1KGAnd1KGShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.KG, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.KG, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0KGAnd0KGShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.KG, 0.0);
        Weight weight2 = new Weight(Conversion.Unit.KG, 0.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0KGAnd1KGShouldReturnFalse() {
        Weight weight1 = new Weight(Conversion.Unit.KG, 0.0);
        Weight weight2 = new Weight(Conversion.Unit.KG, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1KGAnd1000GRAMShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.KG, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.GRAM, 1000.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1KGAnd0Point1QuintalShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.KG, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.QUINTAL, 0.01);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf100KGAnd1QuintalShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.KG, 100.0);
        Weight weight2 = new Weight(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0QuintalAnd0Point0QuintalShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.QUINTAL, 0.0);
        Weight weight2 = new Weight(Conversion.Unit.QUINTAL, 0.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0QuintalAnd0Point1QuintalShouldReturnFalse() {
        Weight weight1 = new Weight(Conversion.Unit.QUINTAL, 0.0);
        Weight weight2 = new Weight(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1QuintalAnd0Point1QuintalShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.QUINTAL, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.QUINTAL, 1.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1QuintalAnd0Point10000GramShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.QUINTAL, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.GRAM, 100000.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1QuintalAnd0Point100KGShouldReturnTrue() {
        Weight weight1 = new Weight(Conversion.Unit.QUINTAL, 1.0);
        Weight weight2 = new Weight(Conversion.Unit.KG, 100.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }
    //--------------

    @Test
    public void givenAdditionOf1KGAnd1KGInchEquals2000Gram_shouldReturnTrue() {
        double weight = Weight.addWeight(1.0, 1.0);
        Weight weight1 = new Weight(Conversion.Unit.KG, weight);
        Weight weight2 = new Weight(Conversion.Unit.GRAM, 2000.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf1KGAnd500GramInchEquals1500Gram_shouldReturnTrue() {
        double weight = Weight.addWeight(1.0, 0.500);
        Weight weight1 = new Weight(Conversion.Unit.KG, weight);
        Weight weight2 = new Weight(Conversion.Unit.GRAM, 1500.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf1KGAnd1QuintalEquals2000Gram_shouldReturnTrue() {
        double weight = Weight.addWeight(1.0, 10.0);
        Weight weight1 = new Weight(Conversion.Unit.KG, weight);
        Weight weight2 = new Weight(Conversion.Unit.GRAM, 11000.0);
        boolean compare = weight1.compare(weight2);
        Assert.assertTrue(compare);
    }

}
