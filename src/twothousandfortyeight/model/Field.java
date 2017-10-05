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

}
