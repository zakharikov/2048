package twothousandfortyeight.controller;


import twothousandfortyeight.model.Digit;
import twothousandfortyeight.model.Field;

import java.util.Random;

public class DigitGenerator {

     public Field generateDigit(Field field) {

        Random random = new Random();
        Digit digit = new Digit();

        int horizontal = random.nextInt(field.digitArray.length);
        int vertical = random.nextInt(field.digitArray.length);

//        if (field.ifFieldIsFull()) {return field;}

        if (field.digitArray[horizontal][vertical] == 0) {
            field.digitArray[horizontal][vertical] = digit.getDigit(random);

        } return field;
//        else {
//            generateDigit(field);
//            return field;
//        }

    }



}
