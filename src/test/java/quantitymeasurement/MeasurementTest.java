package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class MeasurementTest {

    @Test
    public void givenOf0FeetAnd0Feet_shouldReturnEqual() {
        Measurement feet1 = new Measurement(Unit.FEET, 0.0);
        Measurement feet2 = new Measurement(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenOf0FeetAnd1Feet_shouldReturnNotEqual() {
        Measurement feet1 = new Measurement(Unit.FEET, 0.0);
        Measurement feet2 = new Measurement(Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOf_0InchAnd1Inch_shouldReturnFalse() {
        try {
            Measurement inch1 = new Measurement(Unit.INCH, 0.0);
            Measurement inch2 = new Measurement(Unit.INCH, 1.0);
            boolean equals = inch1.compare(inch2);
            Assert.assertFalse(equals);
        } catch (UnitsMismatchException e) {
        }
    }

    @Test
    public void givenOf1InchAnd1Inch_shouldReturnEqual() {
        Measurement inch1 = new Measurement(Unit.INCH, 1.0);
        Measurement inch2 = new Measurement(Unit.INCH, 1.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf0FeetAnd0Inch_shouldReturnEqualLength() {
        Measurement feet1 = new Measurement(Unit.FEET, 0.0);
        Measurement inch2 = new Measurement(Unit.INCH, 0.0);
        boolean compare = feet1.equals(inch2);
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0FeetAnd1Inch_shouldReturnNotEqualLength() {
        Measurement feet1 = new Measurement(Unit.FEET, 0.0);
        Measurement inch2 = new Measurement(Unit.INCH, 1.0);
        boolean compare = false;
        try {
            compare = feet1.compare(inch2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1FeetAnd12Inch_shouldReturnEqualLength() {
        Measurement feet1 = new Measurement(Unit.FEET, 1.0);
        Measurement inch2 = new Measurement(Unit.INCH, 12.0);
        boolean equals = false;
        try {
            equals = feet1.compare(inch2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf12FeetAnd1Inch_shouldReturnFalse() {
        Measurement feet1 = new Measurement(Unit.FEET, 12.0);
        Measurement inch2 = new Measurement(Unit.INCH, 1.0);
        boolean compare = false;
        try {
            compare = feet1.compare(inch2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1FeetAnd1Feet_shouldReturnEqualLength() {
        Measurement feet1 = new Measurement(Unit.FEET, 1.0);
        Measurement feet2 = new Measurement(Unit.FEET, 1.0);
        boolean compare = false;
        try {
            compare = feet1.compare(feet2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0InchAnd0Feet_shouldReturnTrue() {
        Measurement inch1 = new Measurement(Unit.INCH, 0.0);
        Measurement feet2 = new Measurement(Unit.FEET, 0.0);
        boolean compare = false;
        try {
            compare = inch1.compare(feet2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1InchAnd0Feet_shouldReturnFalse() {
        Measurement inch1 = new Measurement(Unit.INCH, 1.0);
        Measurement feet2 = new Measurement(Unit.FEET, 0.0);
        boolean compare = false;
        try {
            compare = inch1.compare(feet2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1InchAnd12Feet_shouldReturnFalse() {
        Measurement inch1 = new Measurement(Unit.INCH, 1.0);
        Measurement feet2 = new Measurement(Unit.FEET, 12.0);
        boolean compare = false;
        try {
            compare = inch1.compare(feet2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf12InchAnd1Feet_shouldReturnTrue() {
        Measurement inch1 = new Measurement(Unit.INCH, 12.0);
        Measurement feet2 = new Measurement(Unit.FEET, 1.0);
        boolean compare = false;
        try {
            compare = inch1.compare(feet2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf24InchAnd2Feet_shouldReturnTrue() {
        Measurement inch1 = new Measurement(Unit.INCH, 24.0);
        Measurement feet2 = new Measurement(Unit.FEET, 2.0);
        boolean compare = false;
        try {
            compare = inch1.compare(feet2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0YardAnd0Yard_shouldReturnTrue() {
        Measurement Yard1 = new Measurement(Unit.YARD, 0.0);
        Measurement Yard2 = new Measurement(Unit.YARD, 0.0);
        boolean compare = false;
        try {
            compare = Yard1.compare(Yard2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1YardAnd0Yard_shouldReturnFalse() {
        Measurement Yard1 = new Measurement(Unit.YARD, 1.0);
        Measurement Yard2 = new Measurement(Unit.YARD, 0.0);
        boolean compare = false;
        try {
            compare = Yard1.compare(Yard2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1YardAnd1Yard_shouldReturnTrue() {
        Measurement Yard1 = new Measurement(Unit.YARD, 1.0);
        Measurement Yard2 = new Measurement(Unit.YARD, 1.0);
        boolean compare = false;
        try {
            compare = Yard1.compare(Yard2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1YardAnd1Feet_shouldReturnFalse() {
        Measurement Yard1 = new Measurement(Unit.YARD, 1.0);
        Measurement feet1 = new Measurement(Unit.FEET, 1.0);
        boolean compare = false;
        try {
            compare = Yard1.compare(feet1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1YardAnd3Feet_shouldReturnTrue() {
        Measurement Yard1 = new Measurement(Unit.YARD, 1.0);
        Measurement feet1 = new Measurement(Unit.FEET, 3.0);
        boolean compare = false;
        try {
            compare = Yard1.compare(feet1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf3FeetAnd1Yard_shouldReturnTrue() {
        Measurement feet1 = new Measurement(Unit.FEET, 3.0);
        Measurement Yard1 = new Measurement(Unit.YARD, 1.0);
        boolean compare = false;
        try {
            compare = feet1.compare(Yard1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1FeetAnd3Yard_shouldReturnFalse() {
        Measurement feet1 = new Measurement(Unit.FEET, 1.0);
        Measurement Yard1 = new Measurement(Unit.YARD, 3.0);
        boolean compare = false;
        try {
            compare = feet1.compare(Yard1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf0YardAnd0Inch_shouldReturnTrue() {
        Measurement feet1 = new Measurement(Unit.YARD, 0.0);
        Measurement Yard1 = new Measurement(Unit.INCH, 0.0);
        boolean compare = false;
        try {
            compare = feet1.compare(Yard1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1YardAnd0Inch_shouldReturnFalse() {
        Measurement feet1 = new Measurement(Unit.YARD, 1.0);
        Measurement Yard1 = new Measurement(Unit.INCH, 0.0);
        boolean compare = false;
        try {
            compare = feet1.compare(Yard1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1YardAnd1Inch_shouldReturnFalse() {
        Measurement feet1 = new Measurement(Unit.YARD, 1.0);
        Measurement Yard1 = new Measurement(Unit.INCH, 1.0);
        boolean compare = false;
        try {
            compare = feet1.compare(Yard1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1YardAnd36Inch_shouldReturnTrue() {
        Measurement Yard1 = new Measurement(Unit.YARD, 1.0);
        Measurement inch1 = new Measurement(Unit.INCH, 36.0);
        boolean compare = false;
        try {
            compare = Yard1.compare(inch1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf36YardAnd1Inch_shouldReturnFalse() {
        Measurement Yard1 = new Measurement(Unit.YARD, 36.0);
        Measurement inch1 = new Measurement(Unit.INCH, 1.0);
        boolean compare = false;
        try {
            compare = Yard1.compare(inch1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf36InchAnd1Yard_shouldReturnTrue() {
        Measurement inch1 = new Measurement(Unit.INCH, 36.0);
        Measurement Yard1 = new Measurement(Unit.YARD, 1.0);
        boolean compare = false;
        try {
            compare = inch1.compare(Yard1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0CMAnd0CM_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Unit.CM, 0.0);
        Measurement centiMeter2 = new Measurement(Unit.CM, 0.0);
        boolean compare = false;
        try {
            compare = centiMeter1.compare(centiMeter2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1InchAnd2_54CM_shouldReturnTrue() {
        Measurement inch1 = new Measurement(Unit.INCH, 1.0);
        Measurement centiMeter1 = new Measurement(Unit.CM, 2.54);
        boolean compare = false;
        try {
            compare = inch1.compare(centiMeter1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf2_54CMAnd1Inch_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Unit.CM, 2.54);
        Measurement inch1 = new Measurement(Unit.INCH, 1.0);
        boolean compare = false;
        try {
            compare = centiMeter1.compare(inch1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1FeetAnd130_48CM_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Unit.CM, 30.48);
        Measurement feet1 = new Measurement(Unit.FEET, 1.0);
        boolean compare = false;
        try {
            compare = centiMeter1.compare(feet1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1YARDAnd1CM_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Unit.CM, 91.44);
        Measurement yard1 = new Measurement(Unit.YARD, 1.0);
        boolean compare = false;
        try {
            compare = yard1.compare(centiMeter1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1CMAnd1Yard_shouldReturnTrue() {
        Measurement centiMeter1 = new Measurement(Unit.CM, 182.88);
        Measurement yard1 = new Measurement(Unit.YARD, 2.0);
        boolean compare = false;
        try {
            compare = centiMeter1.compare(yard1);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }
    //--------------------addition length--------------

    @Test
    public void givenAdditionOf1INCHAnd1INCH_shouldReturn24INCH() {
        Measurement length1 = new Measurement(Unit.INCH, 1.0);
        Measurement length2 = new Measurement(Unit.INCH, 1.0);
        double compare = 0;
        try {
            compare = length1.addition(length2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(2.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1FeetAnd12INCH_shouldReturn24INCH() {
        Measurement length1 = new Measurement(Unit.FEET, 1.0);
        Measurement length2 = new Measurement(Unit.INCH, 12.0);
        double compare = 0;
        try {
            compare = length1.addition(length2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(24.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1FeetAnd1Feet_shouldReturn24INCH() {
        Measurement length1 = new Measurement(Unit.FEET, 1.0);
        Measurement length2 = new Measurement(Unit.FEET, 1.0);
        double compare = 0;
        try {
            compare = length1.addition(length2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(24.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf2InchAnd2_5CM_shouldReturn24INCH() {
        Measurement length1 = new Measurement(Unit.INCH, 2.0);
        Measurement length2 = new Measurement(Unit.CM, 2.5);
        double compare = 0;
        try {
            compare = length1.addition(length2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(3.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1YardAnd1feet_shouldReturn48INCH() {
        Measurement length1 = new Measurement(Unit.YARD, 1.0);
        Measurement length2 = new Measurement(Unit.FEET, 1.0);
        double compare = 0;
        try {
            compare = length1.addition(length2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(48.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1YardAnd5CM_shouldReturn38INCH() {
        try {
            Measurement length1 = new Measurement(Unit.YARD, 1.0);
            Measurement length2 = new Measurement(Unit.CM, 5.0);
            double compare = length1.addition(length2);
            Assert.assertEquals(38.0, compare, 0.0);
        } catch (UnitsMismatchException e) {
        }

    }

    @Test
    public void givenAdditionOf1FeetAnd10CM_shouldReturn16INCH() {
        Measurement length1 = new Measurement(Unit.FEET, 1.0);
        Measurement length2 = new Measurement(Unit.CM, 10.0);
        double compare = 0;
        try {
            compare = length1.addition(length2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(16.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf5CMAnd10Inch_shouldReturn12INCH() {
        Measurement length1 = new Measurement(Unit.CM, 5.0);
        Measurement length2 = new Measurement(Unit.INCH, 10.0);
        double compare = 0;
        try {
            compare = length1.addition(length2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(12.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1YardAnd1Yard_shouldReturn72INCH() {
        Measurement length1 = new Measurement(Unit.YARD, 1.0);
        Measurement length2 = new Measurement(Unit.YARD, 1.0);
        double compare = 0;
        try {
            compare = length1.addition(length2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(72.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf12CmAnd12Cm_shouldReturn10INCH() {
        Measurement length1 = new Measurement(Unit.CM, 12.0);
        Measurement length2 = new Measurement(Unit.CM, 12.0);
        double compare = 0;
        try {
            compare = length1.addition(length2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(10.0, compare, 0.0);
    }

    //------------Temperature-----------
    @Test
    public void givenOf0FARADAnd0FARAD_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.FARAD, 0.0);
        Measurement Measurement2 = new Measurement(Unit.FARAD, 0.0);
        Assert.assertEquals(Measurement1, Measurement2);
    }

    @Test
    public void givenOf1FARADAnd1FARAD_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.FARAD, 1.0);
        Measurement Measurement2 = new Measurement(Unit.FARAD, 1.0);
        Assert.assertEquals(Measurement1, Measurement2);
    }

    @Test
    public void givenOf1FARADAnd0FARAD_shouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.FARAD, 1.0);
        Measurement Measurement2 = new Measurement(Unit.FARAD, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf0CELSIUSAnd0CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.CELSIUS, 0.0);
        Measurement Measurement2 = new Measurement(Unit.CELSIUS, 0.0);
        Assert.assertEquals(Measurement1, Measurement2);
    }

    @Test
    public void givenOf1CELSIUSAnd1CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.CELSIUS, 1.0);
        Measurement Measurement2 = new Measurement(Unit.CELSIUS, 1.0);
        Assert.assertEquals(Measurement1, Measurement2);
    }

    @Test
    public void givenOf1CELSIUSAnd0CELSIUS_shouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.CELSIUS, 1.0);
        Measurement Measurement2 = new Measurement(Unit.CELSIUS, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf33_8FARADAnd1CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.FARAD, 33.8);
        Measurement Measurement2 = new Measurement(Unit.CELSIUS, 1.0);
        boolean equals = false;
        try {
            equals = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf1FARADAnd17CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.FARAD, 1.0);
        Measurement Measurement2 = new Measurement(Unit.CELSIUS, -17.0);
        boolean equals = false;
        try {
            equals = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf100FARADAnd38CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.FARAD, 100.0);
        Measurement Measurement2 = new Measurement(Unit.CELSIUS, 38.0);
        boolean equals = false;
        try {
            equals = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf212FARADAnd100CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.FARAD, 212.0);
        Measurement Measurement2 = new Measurement(Unit.CELSIUS, 100.0);
        boolean equals = false;
        try {
            equals = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf50FARADAnd10CELSIUS_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.FARAD, 50.0);
        Measurement Measurement2 = new Measurement(Unit.CELSIUS, 10.0);
        boolean equals = false;
        try {
            equals = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf1CELCIUSAnd33_8FARAD_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.FARAD, 33.8);
        Measurement Measurement2 = new Measurement(Unit.CELSIUS, 1.0);
        boolean equals = false;
        try {
            equals = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOf10CELCIUSAnd50FARAD_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.FARAD, 50);
        Measurement Measurement2 = new Measurement(Unit.CELSIUS, 10);
        boolean equals = false;
        try {
            equals = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(equals);
    }

    //--------------Volume--------
    @Test
    public void givenOf0MLAnd0MlShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.ML, 0.0);
        Measurement Measurement2 = new Measurement(Unit.ML, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1MLAnd1MlShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.ML, 1.0);
        Measurement Measurement2 = new Measurement(Unit.ML, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1MLAnd0MlShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.ML, 1.0);
        Measurement Measurement2 = new Measurement(Unit.ML, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf0LITREAnd0LITREShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.LITRE, 0.0);
        Measurement Measurement2 = new Measurement(Unit.LITRE, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1LITREAnd1LITREShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.LITRE, 1.0);
        Measurement Measurement2 = new Measurement(Unit.LITRE, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1LITREAnd0LITREShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.LITRE, 1.0);
        Measurement Measurement2 = new Measurement(Unit.LITRE, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf0GALLONAnd0GALLONShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GALLON, 0.0);
        Measurement Measurement2 = new Measurement(Unit.GALLON, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GALLONAnd1GALLONShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GALLON, 1.0);
        Measurement Measurement2 = new Measurement(Unit.GALLON, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GALLONAnd0GALLONShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.GALLON, 1.0);
        Measurement Measurement2 = new Measurement(Unit.GALLON, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1000mlAnd1litShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.ML, 1000.0);
        Measurement Measurement2 = new Measurement(Unit.LITRE, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000mlAnd1GallonShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.ML, 1.0);
        Measurement Measurement2 = new Measurement(Unit.GALLON, 0.000264172);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000litAnd1mlShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.LITRE, 1.0);
        Measurement Measurement2 = new Measurement(Unit.GALLON, 0.264172);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000litAnd1GallonShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.ML, 1000.0);
        Measurement Measurement2 = new Measurement(Unit.LITRE, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GALLONAnd1mlShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GALLON, 0.000264172);
        Measurement Measurement2 = new Measurement(Unit.ML, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1000GALLONAnd1litShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GALLON, 0.264172);
        Measurement Measurement2 = new Measurement(Unit.LITRE, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }
    //------------------addition volume--------

    @Test
    public void givenAdditionOf10mlAnd10mlShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Unit.ML, 10.0);
        Measurement Measurement2 = new Measurement(Unit.ML, 10.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(20.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10litAnd10litShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Unit.LITRE, 10.0);
        Measurement Measurement2 = new Measurement(Unit.LITRE, 10.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(20000.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10GallonAnd10GallonShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Unit.GALLON, 10.0);
        Measurement Measurement2 = new Measurement(Unit.GALLON, 10.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(75708, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1000mlAnd10litShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Unit.ML, 10.0);
        Measurement Measurement2 = new Measurement(Unit.LITRE, 10.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(10010, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1000mlAnd1GallonShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Unit.ML, 10.0);
        Measurement Measurement2 = new Measurement(Unit.GALLON, 10.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(37864, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10litAnd100mlShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Unit.LITRE, 10.0);
        Measurement Measurement2 = new Measurement(Unit.ML, 100.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(10100, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10litAnd1GallonShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Unit.LITRE, 10.0);
        Measurement Measurement2 = new Measurement(Unit.GALLON, 1.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(13785, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1GallonAnd10000mlShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Unit.GALLON, 1.0);
        Measurement Measurement2 = new Measurement(Unit.ML, 10000.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(13785, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1GallonAnd10litShouldReturnEqualsReturn() {
        Measurement Measurement1 = new Measurement(Unit.GALLON, 1.0);
        Measurement Measurement2 = new Measurement(Unit.LITRE, 10.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(13785, compare, 0.0);
    }

    //-----------------Weight----------
    @Test
    public void givenOf0GMAnd0GMShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 0.0);
        Measurement Measurement2 = new Measurement(Unit.GRAM, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0GMAnd1GMShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 0.0);
        Measurement Measurement2 = new Measurement(Unit.GRAM, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1GMAnd1GMShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Unit.GRAM, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GMAnd1KgShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1GMAnd1QuintalShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1000GMAnd1KgShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 1000.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GMAnd1000KgShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 1000.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf100000GMAnd1QuintalShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 100000.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1GMAnd10000QuintalShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 10000.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1KGAnd1KGShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0KGAnd0KGShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.KG, 0.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0KGAnd1KGShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.KG, 0.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1KGAnd1000GRAMShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Unit.GRAM, 1000.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1KGAnd0Point1QuintalShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 0.01);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf100KGAnd1QuintalShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.KG, 100.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0QuintalAnd0Point0QuintalShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.QUINTAL, 0.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf0QuintalAnd0Point1QuintalShouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.QUINTAL, 0.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenOf1QuintalAnd0Point1QuintalShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.QUINTAL, 1.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1QuintalAnd0Point10000GramShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.QUINTAL, 1.0);
        Measurement Measurement2 = new Measurement(Unit.GRAM, 100000.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenOf1QuintalAnd0Point100KGShouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.QUINTAL, 1.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 100.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd1Tonne_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Unit.TONNE, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf0TonneAnd0Tonne_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.TONNE, 0.0);
        Measurement Measurement2 = new Measurement(Unit.TONNE, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd0Tonne_shouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Unit.TONNE, 0.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd1Quintal_shouldReturnFalse() {
        Measurement Measurement1 = new Measurement(Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 1.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertFalse(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd10Quintal_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 10.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd1000KG_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 1000.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }

    @Test
    public void givenAdditionOf1TonneAnd10000GM_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Unit.GRAM, 1000000.0);
        boolean compare = false;
        try {
            compare = Measurement1.compare(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertTrue(compare);
    }
    //--------------addition weight----------------

    @Test
    public void givenAdditionOf1GramAnd1GramInchEquals2Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Unit.GRAM, 1.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(2.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1KGAnd9KgEquals10000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 9.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(10000.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1TonneAnd1TonneInchEquals2000000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.TONNE, 1.0);
        Measurement Measurement2 = new Measurement(Unit.TONNE, 1.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(2000000.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1QuintalAnd1QuintalInchEquals200000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.QUINTAL, 1.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 1.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(200000.0, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1GmAnd1QuintalInchEquals100001Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 1.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(100001, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1GmAnd1KgInchEquals1001Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 1.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(1001, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10000GmAnd1TonneInchEquals1010000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 10000.0);
        Measurement Measurement2 = new Measurement(Unit.TONNE, 1.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(1010000, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1KgAnd1QuintalInchEquals101000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Unit.QUINTAL, 1.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(101000, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1KgAnd1TonneInchEquals1000001Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.GRAM, 1.0);
        Measurement Measurement2 = new Measurement(Unit.TONNE, 1.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(1000001, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1KgAnd9KgEquals2000Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.KG, 1.0);
        Measurement Measurement2 = new Measurement(Unit.KG, 1.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(2000, compare, 0.0);
    }

    @Test
    public void givenAdditionOf10KgAnd1000GramInchEquals1_00001E9Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.KG, 10.0);
        Measurement Measurement2 = new Measurement(Unit.TONNE, 1000.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(1.00001E9, compare, 0.0);
    }

    @Test
    public void givenAdditionOf1QuintalAnd10TonneInchEquals1_01E7Gram_shouldReturnTrue() {
        Measurement Measurement1 = new Measurement(Unit.QUINTAL, 1.0);
        Measurement Measurement2 = new Measurement(Unit.TONNE, 10.0);
        double compare = 0;
        try {
            compare = Measurement1.addition(Measurement2);
        } catch (UnitsMismatchException e) {
        }
        Assert.assertEquals(1.01E7, compare, 0.0);
    }

    //----------------different units--------------
    @Test
    public void givenMethodFor1FAnd10Tonne_ShouldReturnFalse() {
        Measurement measurement1 = new Measurement(Unit.FEET, 1.0);
        Measurement measurement2 = new Measurement(Unit.TONNE, 10.0);
        boolean compare = false;
        try {
            compare = measurement1.compare(measurement2);
            Assert.assertFalse(compare);
        } catch (UnitsMismatchException e) {
            Assert.assertEquals(UnitsMismatchException.ExceptionType.TYPE_MISMATCH, e.type);
        }

    }

    @Test
    public void givenMethodFor1cmAnd1gmShouldReturnFalse() {
        Measurement measurement1 = new Measurement(Unit.CM, 1.0);
        Measurement measurement2 = new Measurement(Unit.GRAM, 1000.0);
        boolean compare = false;
        try {
            compare = measurement1.compare(measurement2);
            Assert.assertFalse(compare);
        } catch (UnitsMismatchException e) {
            Assert.assertEquals(UnitsMismatchException.ExceptionType.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void givenMethodFor1cmAndCelsiusShould_return() {
        Measurement measurement1 = new Measurement(Unit.CM, 1.0);
        Measurement measurement2 = new Measurement(Unit.CELSIUS, 1000.0);
        boolean compare = false;
        try {
            compare = measurement1.compare(measurement2);
            Assert.assertFalse(compare);
        } catch (UnitsMismatchException e) {
            Assert.assertEquals(UnitsMismatchException.ExceptionType.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void givenMethodFor1TonneAnd10GallonShould_returnFalse() {
        try {
            Measurement measurement1 = new Measurement(Unit.TONNE, 1.0);
            Measurement measurement2 = new Measurement(Unit.CELSIUS, 1000.0);
            measurement1.compare(measurement2);
        } catch (UnitsMismatchException e) {
            Assert.assertEquals(UnitsMismatchException.ExceptionType.TYPE_MISMATCH, e.type);
        }
    }
    @Test
    public void givenMethodFor1FeetAnd12KGShould_returnFalse() {
        try {
            Measurement measurement1 = new Measurement(Unit.FEET, 1.0);
            Measurement measurement2 = new Measurement(Unit.KG, 0.0);
            measurement1.compare(measurement2);
        } catch (UnitsMismatchException e) {
            Assert.assertEquals(UnitsMismatchException.ExceptionType.TYPE_MISMATCH, e.type);
        }
    }
}
