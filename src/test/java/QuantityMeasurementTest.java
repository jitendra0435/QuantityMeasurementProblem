import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenOf0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenOf0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOf_0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenOf0InchAnd0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf0InchAnd1Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenOf_0InchAnd1Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        boolean equals = inch1.compare(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenOf1InchAnd1Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf0FeetAnd0Inch_shouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        boolean compare = feet1.equals(inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0FeetAnd1Inch_shouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        boolean compare = feet1.equals(inch2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1FeetAnd12Inch_shouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, 12.0);
        boolean equals = feet1.compare(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf2FeetAnd24Inch_shouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 2.0);
        Length inch2 = new Length(Length.Unit.INCH, 24.0);
        boolean equals = feet1.compare(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf12FeetAnd1Inch_shouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 12.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        boolean compare = feet1.compare(inch2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1FeetAnd1Feet_shouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compare = feet1.compare(feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0InchAnd0Feet_shouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        boolean compare = inch1.compare(feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1InchAnd0Feet_shouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        boolean compare = inch1.compare(feet2);
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1InchAnd12Feet_shouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 12.0);
        boolean compare = inch1.compare(feet2);
        Assert.assertFalse(compare);
    }


    @Test
    public void givenOf12InchAnd1Feet_shouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compare = inch1.compare(feet2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf24InchAnd2Feet_shouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 24.0);
        Length feet2 = new Length(Length.Unit.FEET, 2.0);
        boolean compare = inch1.compare(feet2);
        Assert.assertTrue(compare);
    }
}
