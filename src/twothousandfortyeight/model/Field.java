package twothousandfortyeight.model;

import twothousandfortyeight.view.View;
import java.util.Random;
import java.util.Scanner;


public class Field {

    public int size;

    public int quaontity;

    public int[][] digitArray;

    public Field(int size) {
        this.size = size;
        this.digitArray = new int[size][size];
    }

    public int getSize() {
        return size;
    }

    public int[][] getBoard() {
       return digitArray;
    }

//    public int[][] putDigit(int[][] digitArray) {
//
//    }

//    public boolean ifFieldIsFull() {
//        for (int i = 0; i < digitArray.length; i++) {
//            for (int j = 0; j < digitArray.length; j++) {
//                if (digitArray[i][j] != 0) {
//                    quaontity++;
//                }
//            }
//        }
//        if (quaontity != size) {
//            return true;
//        } else { return false; }
//    }

}
