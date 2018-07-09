package twothousandfortyeight.controller;


import twothousandfortyeight.model.Digit;
import twothousandfortyeight.model.Field;

import java.util.Random;

public class DigitGenerator {

     public Field generateDigit(Field field) {

        Random random = new Random();
        Digit digit = new Digit();
        int generated = digit.getDigit(random);
        int horizontal = random.nextInt(field.digitArray.length);
        int vertical = random.nextInt(field.digitArray.length);

        if (!field.cellIsOccupied(horizontal, vertical)) {

            field.digitArray[horizontal][vertical] = generated;
            System.out.println("generated = " + generated);

        } else {
            System.out.println("not generated");
            generateDigit(field);
        }

        return field;
    }
}
