package twothousandfortyeight.model;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Sigma on 05/10/2017.
 */
public class DigitTest {
    @Test
    public void getDigit() throws Exception {

        final Random r = new Random();
        final Digit digit = new Digit();
        final int expectedValue = 2;
        final int actualValue = digit.getDigit(r);

        if (actualValue == 4) {
            System.out.println(actualValue);
            return;
        } else {
            System.out.println(actualValue);
            assertEquals(expectedValue, actualValue);
        }

    }

}