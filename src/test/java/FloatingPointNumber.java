import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.math.BigDecimal;

public class FloatingPointNumber {


    @Test
    public void floatTest(){

        Double expected = 0.1;
        Double actual = 0.0;

        for (int i = 0; i < 100; i++) {
            actual += 0.001;
        }

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertFalse(expected == actual);
        Assert.assertEquals(expected, actual, 0.0001);
    }




}
