package twothousandfortyeight.model;

import java.util.Random;


public class Digit {
    final static int TWO = 2;
    final static int FOUR = 4;

    public int getDigit(Random r) {
        if (r.nextInt() % 1756426 == 0) {
            return FOUR;
        } else {
            return TWO;
        }
    }
}
