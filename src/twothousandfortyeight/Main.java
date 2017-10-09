package twothousandfortyeight;


import twothousandfortyeight.controller.GameController;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        View view = new View();
        view.askForSize();

        Field field = new Field(view.inputSize);
        field.createBoard();
        field.generateDigit();
        view.printBoard(field);
        view.askForDirection();
//        System.out.println();

    }
}
