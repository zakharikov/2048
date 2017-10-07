package twothousandfortyeight.view;

import java.util.Arrays;
import java.util.Scanner;
import twothousandfortyeight.model.Field;


public class View {

    public int inputSize;

    public int askForSize() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер поля:");
        inputSize = sc.nextInt();
        sc.close();
        System.out.println("Вы выбрали размер поля: " + inputSize + " x " + inputSize);
        return inputSize;
    }

    public void printBoard() {

        System.out.println();
        Field field = new Field(inputSize);
        field.createBoard();
//        for(int h = 0; h < field.digitArray.length; h++) {
//            for (int g = 0; g < field.digitArray[h].length; g++) {
//                field.digitArray[h][g] = 512;
//            }
//        }
        printSeparator(inputSize);
        System.out.println();
        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < field.digitArray[i].length; j++) {
                if (field.digitArray[i][j] <= 9) {
                    System.out.print("|  " + field.digitArray[i][j] + "   ");
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
    }

    void printSeparator(int boardSize) {
        for (int i = 0; i < boardSize; i++) {
            System.out.print("-------");
        } System.out.print("-");
    }
}