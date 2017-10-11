package twothousandfortyeight;


import twothousandfortyeight.controller.GameController;
import twothousandfortyeight.controller.LoseController;
import twothousandfortyeight.controller.WinController;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;
import twothousandfortyeight.controller.DirectionCalculatorController;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        DirectionCalculatorController dcc = new DirectionCalculatorController();
        View view = new View();
        Field field = new Field(view.inputSize);
        WinController wc = new WinController();
        LoseController lc = new LoseController();

        view.askForSize();
        field.createBoard();
        field.generateDigit();
        view.printBoard(field);
//        view.initializeBoard(field);
//        view.printBoard(field);
//        dcc.rightCalculator(field);
//        view.printBoard(field);
        view.askForDirection();

    }
}
