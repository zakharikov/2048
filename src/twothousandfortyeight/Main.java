package twothousandfortyeight;


import twothousandfortyeight.controller.GameController;
import twothousandfortyeight.controller.LoseController;
import twothousandfortyeight.controller.WinController;
import twothousandfortyeight.model.Digit;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;
import twothousandfortyeight.controller.DirectionCalculatorController;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        GameController gc = new GameController();
        DirectionCalculatorController dcc = new DirectionCalculatorController();
        WinController wc = new WinController();
        LoseController lc = new LoseController();
        View view = new View();

        view.askForSize();
        Field field = new Field(view.inputSize);
        field.createBoard();
//        view.initializeBoardB(field);
        field.generateDigit();
        view.printBoard(field);
        dcc.altLeftCalculator(field);
        field.generateDigit();
        view.printBoard(field);
        dcc.altUpCalculator(field);
        field.generateDigit();
        view.printBoard(field);
        dcc.altRightCalculator(field);
        field.generateDigit();
        view.printBoard(field);
        dcc.altDownCalculator(field);
        field.generateDigit();
        view.printBoard(field);
        dcc.altLeftCalculator(field);
        field.generateDigit();
        view.printBoard(field);
        dcc.altUpCalculator(field);
        field.generateDigit();
        view.printBoard(field);
        dcc.altRightCalculator(field);
        field.generateDigit();
        view.printBoard(field);
        dcc.altDownCalculator(field);
        field.generateDigit();
        view.printBoard(field);

//        view.initializeBoard(field);
//        view.printBoard(field);
//        dcc.rightCalculator(field);
//        view.printBoard(field);
//        while (wc.getWinnner(field) == false && lc.getLooser(field) == false) {
//            view.askForDirection(dcc, field);
//            field.generateDigit();
//            view.printBoard(field);
//        }

    }
}
