package twothousandfortyeight.view;

import java.util.Arrays;
import java.util.Scanner;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.controller.DirectionCalculatorController;
import twothousandfortyeight.controller.GameController;


public class View {

    public int inputSize;

    public String inputDirection = "";

    public void askForSize() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер поля:");
        inputSize = sc.nextInt();
//        sc.close();
        System.out.println("Вы выбрали размер поля: " + inputSize + " x " + inputSize);
    }

    public void askForDirection(DirectionCalculatorController dcc, Field field, GameController gc) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Давай, ходи! (WASD - стрелки, блеать!)");
        switch (sc.next()) {
            case "w" : gc.moveUp(dcc, field); break;
            case "a" : gc.moveLeft(dcc, field); break;
            case "s" : gc.moveDown(dcc, field); break;
            case "d" : gc.moveRight(dcc, field); break;
            default : System.out.println("Смотри куда жмешь!"); break;
        }
//        sca.close();
//        System.out.println(inputDirection);
    }

    public Field printBoard(Field field) {

        System.out.println();

        printSeparator(inputSize);
        System.out.println();
        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < field.digitArray[i].length; j++) {

                if (field.digitArray[i][j] <= 9) {
                    if (field.digitArray[i][j] == 0) {
                        System.out.print("|      ");
                    } else {
                        System.out.print("|  " + field.digitArray[i][j] + "   ");
                    }
                    if (j + 1 == inputSize) System.out.print("|");
                }
                else if (field.digitArray[i][j] <= 99) {
                    System.out.print("|  " + field.digitArray[i][j] + "  ");
                    if (j + 1 == inputSize) System.out.print("|");
                }
                else if (field.digitArray[i][j] <= 999) {
                    System.out.print("|  " + field.digitArray[i][j] + " ");
                    if (j + 1 == inputSize) System.out.print("|");
                }
                else if (field.digitArray[i][j] <= 9999) {
                    System.out.print("| " + field.digitArray[i][j] + " ");
                    if (j + 1 == inputSize) System.out.print("|");
                }
                else if (field.digitArray[i][j] <= 99999) {
                    System.out.print("| " + field.digitArray[i][j]);
                    if (j + 1 == inputSize) System.out.print("|");
                }

            }
            System.out.println();
            printSeparator(inputSize);
            System.out.println();
        }
        return field;
    }

    void printSeparator(int boardSize) {
        for (int i = 0; i < boardSize; i++) {
            System.out.print("-------");
        } System.out.print("-");
    }

    public Field initializeBoardA (Field field) {
        for(int h = 0; h < field.digitArray.length; h++) {
            for (int g = 0; g < field.digitArray[h].length; g++) {
                field.digitArray[h][g] = 64;
            }
        }
        return field;
    } // вспомогательный метод

    public Field initializeBoardB (Field field) {
        for (int g = 0; g < field.digitArray.length; g++) {
            field.digitArray[0][g] = 1;
        }
        for (int g = 0; g < field.digitArray.length; g++) {
            field.digitArray[1][g] = 4;
        }
        for (int g = 0; g < field.digitArray.length; g++) {
            field.digitArray[2][g] = 8;
        }
        for (int g = 0; g < field.digitArray.length; g++) {
            field.digitArray[3][g] = 32;
        }
        for (int g = 0; g < field.digitArray.length; g++) {
            field.digitArray[4][g] = 2;
        }
        for (int g = 0; g < field.digitArray.length; g++) {
            field.digitArray[5][g] = 2;
        }
        for (int g = 0; g < field.digitArray.length; g++) {
            field.digitArray[6][g] = 0;
        }

//        for (int g = 0; g < field.digitArray.length; g++) {
//            field.digitArray[1][g] = 0;
//        }
//        for (int g = 0; g < field.digitArray.length; g++) {
//            field.digitArray[2][g] = 0;
//        }
//        for (int g = 0; g < field.digitArray.length; g++) {
//            field.digitArray[3][g] = 0;
//        }

        return field;
    } // вспомогательный метод

    public Field initializeBoardC (Field field) {
        for (int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < field.digitArray[i].length; j++) {
                field.digitArray[i][j] = i + j*2 + 1;
            }
        }
        return field;
    } // вспомогательный метод
}