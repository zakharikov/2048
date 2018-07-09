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
    public boolean checkLeftAbility2Move() {

        boolean x = false;

        exitPoint: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = 0; j <= this.digitArray[i].length; j++) {
                for (int k = 1; k < this.digitArray.length - j; k++) {

                    if (this.digitArray[i][j] == 0 && this.digitArray[i][j + k] != 0) {
                        x = true;
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = 0; j <= this.digitArray[i].length; j++) {
                for (int k = 1; k < this.digitArray.length - j; k++) {

                    if (this.digitArray[i][j] == this.digitArray[i][j + k]
                            && this.digitArray[i][j] != 0
                            && this.digitArray[i][j + k] != 0) {
                        x = true;
                        break exitPoint2;
                    }
                }
            }
        }
        return x;
    }

    public boolean checkUpAbility2Move() {

        boolean x = false;

        exitPoint: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = 0; j <= this.digitArray[i].length; j++) {
                for (int k = 1; k < this.digitArray.length - j; k++) {

                    if (this.digitArray[j][i] == 0 && this.digitArray[j + k][i] != 0) {
                        x = true;
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = 0; j <= this.digitArray[i].length; j++) {
                for (int k = 1; k < this.digitArray.length - j; k++) {

                    if (this.digitArray[j][i] == this.digitArray[j + k][i]
                            && this.digitArray[j][i] != 0
                            && this.digitArray[j + k][i] != 0) {
                        x = true;
                        break exitPoint2;
                    }
                }
            }
        }
        return x;
    }

    public boolean checkRightAbility2Move() {

        boolean x = false;

        exitPoint: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = this.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (this.digitArray[i][j] == 0 && this.digitArray[i][j - k] != 0) {
                        x = true;
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = this.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (this.digitArray[i][j] == this.digitArray[i][j - k]
                            && this.digitArray[i][j] != 0
                            && this.digitArray[i][j - k] != 0) {
                        x = true;
                        break exitPoint2;
                    }
                }
            }
        }
        return x;
    }

    public boolean checkDownAbility2Move()  {

        boolean x = false;

        exitPoint: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = this.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (this.digitArray[j][i] == 0 && this.digitArray[j - k][i] != 0) {
                        x = true;
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = this.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (this.digitArray[j][i] == this.digitArray[j - k][i]
                            && this.digitArray[j][i] != 0
                            && this.digitArray[j - k][i] != 0) {
                        x = true;
                        break exitPoint2;
                    } else {
                        break;
                    }
                }
            }
        }
        return x;
    }

    public boolean checkAllAbilities() {

        boolean x = false;

        if (this.checkLeftAbility2Move() && this.checkUpAbility2Move() && this.checkRightAbility2Move() && this.checkDownAbility2Move()) x = true;
        else x = false;
        return x;
    }

    public boolean cellIsOccupied(int a, int b) {

        return this.digitArray[a][b] != 0;

    }
}
