package twothousandfortyeight.view;

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
        Field field =
        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < field.digitArray[i].length; j++) {
                System.out.print(field.digitArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}