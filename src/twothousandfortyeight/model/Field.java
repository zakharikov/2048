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
//                        System.out.println("можно двигать влево");
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = 0; j < this.digitArray[i].length; j++) {

                if (j + 1 < this.digitArray[i].length && this.digitArray[i][j] == this.digitArray[i][j + 1]
                        && this.digitArray[i][j] != 0
                        && this.digitArray[i][j + 1] != 0) {
                    x = true;
//                    System.out.println("можно складывать влево");
                    break exitPoint2;
                }
            }
        }
//        System.out.println("checkLeftAbility2Move вернул " + x);
        return x;
    }

    public boolean checkUpAbility2Move() {

        boolean x = false;

        exitPoint: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = 0; j <= this.digitArray[i].length; j++) {
                for (int k = 1; k < this.digitArray.length - j; k++) {

                    if (this.digitArray[j][i] == 0 && this.digitArray[j + k][i] != 0) {
                        x = true;
//                        System.out.println("можно двигать вверх");
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = 0; j <= this.digitArray[i].length; j++) {

                if (j + 1 < this.digitArray[i].length && this.digitArray[j][i] == this.digitArray[j + 1][i]
                        && this.digitArray[j][i] != 0
                        && this.digitArray[j + 1][i] != 0) {
                    x = true;
//                    System.out.println("можно складывать вверх");
                    break exitPoint2;
                }

            }
        }
//        System.out.println("checkUpAbility2Move вернул " + x);
        return x;
    }

    public boolean checkRightAbility2Move() {

        boolean x = false;

        exitPoint: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = this.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (this.digitArray[i][j] == 0 && this.digitArray[i][j - k] != 0) {
                        x = true;
//                        System.out.println("можно двигать вправо");
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = this.digitArray[i].length - 1; j >= 0; j--) {

                if (j - 1 >= 0 && this.digitArray[i][j] == this.digitArray[i][j - 1]
                        && this.digitArray[i][j] != 0
                        && this.digitArray[i][j - 1] != 0) {
                    x = true;
//                    System.out.println("можно складывать вправо");
                    break exitPoint2;
                }
            }
        }
//        System.out.println("checkRightAbility2Move вернул " + x);
        return x;
    }

    public boolean checkDownAbility2Move()  {

        boolean x = false;

        exitPoint: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = this.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (this.digitArray[j][i] == 0 && this.digitArray[j - k][i] != 0) {
                        x = true;
//                        System.out.println("можно двигать вниз");
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < this.digitArray.length; i++) {
            for (int j = this.digitArray[i].length - 1; j >= 0; j--) {

                if (j - 1 >= 0 && this.digitArray[j][i] == this.digitArray[j - 1][i]
                        && this.digitArray[j][i] != 0
                        && this.digitArray[j - 1][i] != 0) {
                    x = true;
//                    System.out.println("можно складывать вниз");
                    break exitPoint2;
                }
            }
        }
//        System.out.println("checkDownAbility2Move вернул " + x);
        return x;
    }


    public boolean moveIsAvailable() {

        boolean x = false;

        if (this.checkLeftAbility2Move()) {
            x = true;
        }
        if (this.checkUpAbility2Move()) {
            x = true;
        }
        if (this.checkRightAbility2Move()) {
            x = true;
        }
        if (this.checkDownAbility2Move()) {
            x = true;
        }
//        System.out.println("moveIsAvailable вернул " + x);
        return x;
    }


    public boolean cellIsOccupied(int a, int b) {

        return this.digitArray[a][b] != 0;

    }


    public boolean ifThereAnyFreeCells () {

        boolean b = false;

        for (int i = 0; i < this.digitArray.length; i++) {
            for (int j = 0; j < this.digitArray.length; j++) {
                if (this.digitArray[i][j] == 0) {
                    b = true;
                    break;
                }
            }
        }

        return b;
    }

//    public boolean ability2MoveWhenAllCellsAreOccupied () {
//
//        int counter = 0;
//
//        boolean b = false;
//
//        for (int i = 0; i < this.digitArray.length; i++) {
//            for (int j = 0; j < this.digitArray[i].length; j++) {
//                if (this.digitArray[i][j] != 0 ) { // && this.digitArray[i][j] < 2048
//                    counter++;
//                }
//            }
//        }
//
//        if (counter == this.digitArray.length * this.digitArray.length) {
//            System.out.println("все ячейки заняты");
//            if (!this.checkAllDirections()) {
//                b = true;
//                System.out.println("ходить некуда!");
//
//            } else {
//                b = false;
//                System.out.println("есть возможность походить!");
//            }
//        }
//
//        return b;
//    }
}
