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

//        GameController gc = new GameController();
//        DirectionCalculatorController dcc = new DirectionCalculatorController();
//        WinController wc = new WinController();
//        LoseController lc = new LoseController();
//        View view = new View();
//        boolean w = false;
//        boolean l = false;
//
//        view.askForSize();
//        Field field = new Field(view.inputSize);
//        DigitGenerator dg = new DigitGenerator();
//        field.getBoard();
//        dg.generateDigit(field);
//        view.printBoard(field);
//
////        for (int i = 2_000_000_000; i > 0; i--)
//        while (wc.getWinner(field) == false && lc.getLooser(field) == false)
//        {
//
//            gc.generateAutoMove(dcc, field);
//            dg.generateDigit(field);
//            view.printBoard(field);
//            w = wc.getWinner(field);
//            l = lc.getLooser(field);
//            if (l == true) {
//                System.out.println("You lose!");
//                System.out.println("GAME OVER");
//                return;
//            }
//            if (w == true) {
//                System.out.println("You win!");
//                System.out.println("GAME OVER");
//                return;
//            }
//        }

        // ТЕСТИРУЕМ ГЕНЕРАТОР ЦИФРЫ

        View view = new View();
        LoseController lc = new LoseController();

        boolean l = false;

        view.askForSize();
        Field field = new Field(view.inputSize);
        DigitGenerator dg = new DigitGenerator();
        view.printBoard(field);

        for (int x = 0; x < 16; x++) {
            dg.generateDigit(field);
            view.printBoard(field);
            l = lc.getLooser(field);
            if (l == true) {
                System.out.println("You lose!");
                System.out.println("GAME OVER");
                return;
            }
        }
    }
}
