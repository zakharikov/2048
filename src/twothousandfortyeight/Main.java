package twothousandfortyeight;


import twothousandfortyeight.controller.GameController;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;
import twothousandfortyeight.controller.DirectionCalculatorController;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        DirectionCalculatorController dcc = new DirectionCalculatorController();
        View view = new View();
        view.askForSize();

        Field field = new Field(view.inputSize);

        field.createBoard();
//        field.generateDigit();
        view.printBoard(field);
        view.initializeBoard(field);
        view.printBoard(field);
        dcc.rightCalculator(field);
        view.printBoard(field);
        view.askForDirection();

    }
}
