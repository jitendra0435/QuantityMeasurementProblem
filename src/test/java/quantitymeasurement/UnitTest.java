package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
    @Test
    public void givenMethodFor1FeetShould_return12Inch() {
        double convertedValue = Unit.FEET.converter(1);
        Assert.assertEquals(12, convertedValue,0.0);
    }

    @Test
    public void givenMethodFor12InchShould_return12Inch() {
        double convertedValue = Unit.INCH.converter(12);
        Assert.assertEquals(12, convertedValue,0.0);
    }

    @Test
    public void givenMethodFor1YardShould_return36Inch() {
        double convertedValue = Unit.YARD.converter(1);
        Assert.assertEquals(36, convertedValue,0.0);
    }

    @Test
    public void givenMethodFor1KGShould_return1000gm() {
        double convertedValue = Unit.KG.converter(1.0);
        Assert.assertEquals(1000, convertedValue,0.0);
    }

    @Test
    public void givenMethodFor1QuintalShould_return100000() {
        double convertedValue = Unit.QUINTAL.converter(1.0);
        Assert.assertEquals(100000, convertedValue,0.0);
    }

    @Test
    public void givenMethodFor1TonneShould_return10000000() {
        double convertedValue = Unit.TONNE.converter(1.0);
        Assert.assertEquals(1000000.0, convertedValue,0.0);
    }

    @Test
    public void givenMethodFor1000gmShould_return1000gm() {
        double convertedValue = Unit.TONNE.converter(1.0);
        Assert.assertEquals(1000000.0, convertedValue,0.0);
    }

    @Test
    public void givenMethodFor1LitreShould_return1000ml() {
        double convertedValue = Unit.LITRE.converter(1.0);
        Assert.assertEquals(1000.0, convertedValue,0.0);
    }

    @Test
    public void givenMethodFor1GallonShould_return3785ml() {
        double convertedValue = Unit.GALLON.converter(1.0);
        Assert.assertEquals(3785.0, convertedValue,0.0);
    }

    @Test
    public void givenMethodFor1000mlShould_return1000ml() {
        double convertedValue = Unit.ML.converter(1000.0);
        Assert.assertEquals(1000.0, convertedValue,0.0);
    }

    @Test
    public void givenMethodFor1FShould_return_17Celsius() {
        double convertedValue = Unit.FARAD.converter(1.0);
        Assert.assertEquals(-17.0, convertedValue,0.0);
    }
}
