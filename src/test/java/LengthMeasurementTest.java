import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Conversion;
import quantitymeasurement.Measurement;

public class LengthMeasurementTest {

    @Test
    public void givenOf0FeetAnd0Feet_shouldReturnEqual() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 0.0);
        Measurement feet2 = new Measurement(Conversion.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenOf0FeetAnd1Feet_shouldReturnNotEqual() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 0.0);
        Measurement feet2 = new Measurement(Conversion.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOf_0FeetAnd1Feet_shouldReturnFalse() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 0.0);
        Measurement feet2 = new Measurement(Conversion.Unit.FEET, 1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenOf_0FeetAnd_1Feet_shouldReturnFalse() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 0.0);
        Measurement feet2 = new Measurement(Conversion.Unit.FEET, 1.0);
        boolean equals = feet1.compare(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenOf0InchAnd0Inch_shouldReturnEqual() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 0.0);
        Measurement inch2 = new Measurement(Conversion.Unit.INCH, 0.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf0InchAnd1Inch_shouldReturnFalse() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 0.0);
        Measurement inch2 = new Measurement(Conversion.Unit.INCH, 1.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenOf_0InchAnd1Inch_shouldReturnFalse() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 0.0);
        Measurement inch2 = new Measurement(Conversion.Unit.INCH, 1.0);
        boolean equals = inch1.compare(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenOf1InchAnd1Inch_shouldReturnEqual() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 1.0);
        Measurement inch2 = new Measurement(Conversion.Unit.INCH, 1.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf0FeetAnd0Inch_shouldReturnEqualLength() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 0.0);
        Measurement inch2 = new Measurement(Conversion.Unit.INCH, 0.0);
        boolean compare = feet1.equals(inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0FeetAnd1Inch_shouldReturnNotEqualLength() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 0.0);
        Measurement inch2 = new Measurement(Conversion.Unit.INCH, 1.0);
        boolean compare = feet1.equals(inch2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1FeetAnd12Inch_shouldReturnEqualLength() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 1.0);
        Measurement inch2 = new Measurement(Conversion.Unit.INCH, 12.0);
        boolean equals = feet1.compare(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf2FeetAnd24Inch_shouldReturnEqualLength() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 2.0);
        Measurement inch2 = new Measurement(Conversion.Unit.INCH, 24.0);
        boolean equals = feet1.compare(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf12FeetAnd1Inch_shouldReturnFalse() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 12.0);
        Measurement inch2 = new Measurement(Conversion.Unit.INCH, 1.0);
        boolean compare = feet1.compare(inch2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1FeetAnd1Feet_shouldReturnEqualLength() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 1.0);
        Measurement feet2 = new Measurement(Conversion.Unit.FEET, 1.0);
        boolean compare = feet1.compare(feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0InchAnd0Feet_shouldReturnTrue() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 0.0);
        Measurement feet2 = new Measurement(Conversion.Unit.FEET, 0.0);
        boolean compare = inch1.compare(feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1InchAnd0Feet_shouldReturnFalse() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 1.0);
        Measurement feet2 = new Measurement(Conversion.Unit.FEET, 0.0);
        boolean compare = inch1.compare(feet2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1InchAnd12Feet_shouldReturnFalse() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 1.0);
        Measurement feet2 = new Measurement(Conversion.Unit.FEET, 12.0);
        boolean compare = inch1.compare(feet2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf12InchAnd1Feet_shouldReturnTrue() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 12.0);
        Measurement feet2 = new Measurement(Conversion.Unit.FEET, 1.0);
        boolean compare = inch1.compare(feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf24InchAnd2Feet_shouldReturnTrue() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 24.0);
        Measurement feet2 = new Measurement(Conversion.Unit.FEET, 2.0);
        boolean compare = inch1.compare(feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0YardAnd0Yard_shouldReturnTrue() {
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 0.0);
        Measurement Yard2 = new Measurement(Conversion.Unit.YARD, 0.0);
        boolean compare = Yard1.compare(Yard2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1YardAnd0Yard_shouldReturnFalse() {
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 1.0);
        Measurement Yard2 = new Measurement(Conversion.Unit.YARD, 0.0);
        boolean compare = Yard1.compare(Yard2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1YardAnd1Yard_shouldReturnTrue() {
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 1.0);
        Measurement Yard2 = new Measurement(Conversion.Unit.YARD, 1.0);
        boolean compare = Yard1.compare(Yard2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1YardAnd1Feet_shouldReturnFalse() {
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 1.0);
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 1.0);
        boolean compare = Yard1.compare(feet1);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1YardAnd3Feet_shouldReturnTrue() {
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 1.0);
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 3.0);
        boolean compare = Yard1.compare(feet1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf3FeetAnd1Yard_shouldReturnTrue() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 3.0);
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 1.0);
        boolean compare = feet1.compare(Yard1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1FeetAnd3Yard_shouldReturnFalse() {
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 1.0);
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 3.0);
        boolean compare = feet1.compare(Yard1);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf0YardAnd0Inch_shouldReturnTrue() {
        Measurement feet1 = new Measurement(Conversion.Unit.YARD, 0.0);
        Measurement Yard1 = new Measurement(Conversion.Unit.INCH, 0.0);
        boolean compare = feet1.compare(Yard1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1YardAnd0Inch_shouldReturnFalse() {
        Measurement feet1 = new Measurement(Conversion.Unit.YARD, 1.0);
        Measurement Yard1 = new Measurement(Conversion.Unit.INCH, 0.0);
        boolean compare = feet1.compare(Yard1);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1YardAnd1Inch_shouldReturnFalse() {
        Measurement feet1 = new Measurement(Conversion.Unit.YARD, 1.0);
        Measurement Yard1 = new Measurement(Conversion.Unit.INCH, 1.0);
        boolean compare = feet1.compare(Yard1);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1YardAnd36Inch_shouldReturnTrue() {
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 1.0);
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 36.0);
        boolean compare = Yard1.compare(inch1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf2YardAnd72Inch_shouldReturnTrue() {
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 2.0);
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 72.0);
        boolean compare = Yard1.compare(inch1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf36YardAnd1Inch_shouldReturnFalse() {
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 36.0);
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 1.0);
        boolean compare = Yard1.compare(inch1);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf36InchAnd1Yard_shouldReturnTrue() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 36.0);
        Measurement Yard1 = new Measurement(Conversion.Unit.YARD, 1.0);
        boolean compare = inch1.compare(Yard1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0CMAnd0CM_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Conversion.Unit.CM, 0.0);
        Measurement centiMeter2 = new Measurement(Conversion.Unit.CM, 0.0);
        boolean compare = centiMeter1.compare(centiMeter2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1InchAnd2_54CM_shouldReturnTrue() {
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 1.0);
        Measurement centiMeter1 = new Measurement(Conversion.Unit.CM, 2.54);
        boolean compare = inch1.compare(centiMeter1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf2_54CMAnd1Inch_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Conversion.Unit.CM, 2.54);
        Measurement inch1 = new Measurement(Conversion.Unit.INCH, 1.0);
        boolean compare = centiMeter1.compare(inch1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1FeetAnd130_48CM_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Conversion.Unit.CM, 30.48);
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 1.0);
        boolean compare = centiMeter1.compare(feet1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1CMAnd1Feet_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Conversion.Unit.CM, 60.96);
        Measurement feet1 = new Measurement(Conversion.Unit.FEET, 2.0);
        boolean compare = feet1.compare(centiMeter1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1YARDAnd1CM_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Conversion.Unit.CM, 91.44);
        Measurement yard1 = new Measurement(Conversion.Unit.YARD, 1.0);
        boolean compare = yard1.compare(centiMeter1);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1CMAnd1Yard_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Conversion.Unit.CM, 182.88);
        Measurement yard1 = new Measurement(Conversion.Unit.YARD, 2.0);
        boolean compare = centiMeter1.compare(yard1);
        Assert.assertTrue(compare);
    }
    //--------------------addition--------------

    @Test
    public void givenAdditionOf1INCHAnd1INCH_shouldReturn24INCH() {
        Measurement length1 = new Measurement(Conversion.Unit.INCH, 1.0);
        Measurement length2 = new Measurement(Conversion.Unit.INCH, 1.0);
        double compare = length1.addition(length2);
        Assert.assertEquals(2.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1FeetAnd12INCH_shouldReturn24INCH() {
        Measurement length1 = new Measurement(Conversion.Unit.FEET, 1.0);
        Measurement length2 = new Measurement(Conversion.Unit.INCH, 12.0);
        double compare = length1.addition(length2);
        Assert.assertEquals(24.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1FeetAnd1Feet_shouldReturn24INCH() {
        Measurement length1 = new Measurement(Conversion.Unit.FEET, 1.0);
        Measurement length2 = new Measurement(Conversion.Unit.FEET, 1.0);
        double compare = length1.addition(length2);
        Assert.assertEquals(24.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf2InchAnd2_5CM_shouldReturn24INCH() {
        Measurement length1 = new Measurement(Conversion.Unit.INCH, 2.0);
        Measurement length2 = new Measurement(Conversion.Unit.CM, 2.5);
        double compare = length1.addition(length2);
        Assert.assertEquals(3.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1YardAnd1feet_shouldReturn48INCH() {
        Measurement length1 = new Measurement(Conversion.Unit.YARD, 1.0);
        Measurement length2 = new Measurement(Conversion.Unit.FEET, 1.0);
        double compare = length1.addition(length2);
        Assert.assertEquals(48.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1YardAnd5CM_shouldReturn38INCH() {
        Measurement length1 = new Measurement(Conversion.Unit.YARD, 1.0);
        Measurement length2 = new Measurement(Conversion.Unit.CM, 5.0);
        double compare = length1.addition(length2);
        Assert.assertEquals(38.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1FeetAnd10CM_shouldReturn16INCH() {
        Measurement length1 = new Measurement(Conversion.Unit.FEET, 1.0);
        Measurement length2 = new Measurement(Conversion.Unit.CM, 10.0);
        double compare = length1.addition(length2);
        Assert.assertEquals(16.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf5CMAnd10Inch_shouldReturn12INCH() {
        Measurement length1 = new Measurement(Conversion.Unit.CM, 5.0);
        Measurement length2 = new Measurement(Conversion.Unit.INCH, 10.0);
        double compare = length1.addition(length2);
        Assert.assertEquals(12.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1YardAnd1Yard_shouldReturn72INCH() {
        Measurement length1 = new Measurement(Conversion.Unit.YARD, 1.0);
        Measurement length2 = new Measurement(Conversion.Unit.YARD, 1.0);
        double compare = length1.addition(length2);
        Assert.assertEquals(72.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf12CmAnd12Cm_shouldReturn10INCH() {
        Measurement length1 = new Measurement(Conversion.Unit.CM, 12.0);
        Measurement length2 = new Measurement(Conversion.Unit.CM, 12.0);
        double compare = length1.addition(length2);
        Assert.assertEquals(10.0, compare, 0.0);
    }
}
