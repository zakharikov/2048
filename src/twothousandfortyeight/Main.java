package twothousandfortyeight;


import com.sun.org.apache.xpath.internal.SourceTree;
import twothousandfortyeight.controller.*;
import twothousandfortyeight.model.Digit;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        // АВТОИГРУЛЯ

        GameController gc = new GameController();
        DirectionCalculatorController dcc = new DirectionCalculatorController();
        WinController wc = new WinController();
        LoseController lc = new LoseController();
        View view = new View();
        view.askForSize();
        Field field = new Field(view.inputSize);
        DigitGenerator dg = new DigitGenerator();
        dg.generateDigit(field);
        view.printBoard(field);

        while (!wc.getWinner(field) && !lc.getLooser(field)) {

            if (field.moveIsAvailable()) {
                view.askForDirection(dcc, field, gc);
            }

            if (gc.ifMoveIsMade() && field.ifThereAnyFreeCells()) {
                dg.generateDigit(field);
                gc.moveIsMade = 0;
            }

            view.printBoard(field);
            dcc.showScore();
        }

        if (lc.getLooser(field)) {
            System.out.println("You lose!");
            System.out.println("GAME OVER");
            return;
        }
        if (wc.getWinner(field)) {
            System.out.println("You win!");
            System.out.println("GAME OVER");
            return;
        }

        // ТЕСТИРУЕМ ГЕНЕРАТОР ЦИФРЫ

//        View view = new View();
//        LoseController lc = new LoseController();
//
//        boolean l = false;
//
//        view.askForSize();
//        Field field = new Field(view.inputSize);
//        DigitGenerator dg = new DigitGenerator();
//        view.printBoard(field);
//
//        for (int x = 0; x < 16; x++) {
//            dg.generateDigit(field);
//            view.printBoard(field);
//            l = lc.getLooser(field);
//            if (l == true) {
//                System.out.println("You lose!");
//                System.out.println("GAME OVER");
//                return;
//            }
//        }

        // ТЕСТИРУЕМ ABILITY 2 MOVE

//        View view = new View();
//        view.askForSize();
//        Field field = new Field(view.inputSize);
//        DirectionCalculatorController dcc = new DirectionCalculatorController();
//        GameController gc = new GameController();
//
//        field.digitArray[0][0] = 2;
//        field.digitArray[0][1] = 4;
//        field.digitArray[0][2] = 2;
//        field.digitArray[0][3] = 4;
//
//        field.digitArray[1][0] = 4;
//        field.digitArray[1][1] = 8;
//        field.digitArray[1][2] = 32;
//        field.digitArray[1][3] = 2;
//
//        field.digitArray[2][0] = 2;
//        field.digitArray[2][1] = 4;
//        field.digitArray[2][2] = 8;
//        field.digitArray[2][3] = 4;
//
//        field.digitArray[3][0] = 0;
//        field.digitArray[3][1] = 2;
//        field.digitArray[3][2] = 4;
//        field.digitArray[3][3] = 2;
//
//        view.printBoard(field);
//        field.moveIsAvailable();
    }
}
