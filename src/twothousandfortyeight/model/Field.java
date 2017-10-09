package twothousandfortyeight.model;

import twothousandfortyeight.view.View;
import java.util.Random;
import java.util.Scanner;


public class Field {

    public int size;

    public int[][] digitArray;

    public Field(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int[][] createBoard() {
       digitArray = new int[size][size];
       return digitArray;
    }

//    public int[][] putDigit(int[][] digitArray) {
//
//    }

    public void generateDigit() {

        Random random = new Random();
        Digit digit = new Digit();

        int horizontal = random.nextInt(digitArray.length);
        int vertical = random.nextInt(digitArray.length);

        if (digitArray[horizontal][vertical] == 0) {
            digitArray[horizontal][vertical] = digit.getDigit(random);
        } else {
            generateDigit();
        }

    }

}
