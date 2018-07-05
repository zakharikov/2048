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

//        Scanner sc = new Scanner(System.in);
        GameController gc = new GameController();
        DirectionCalculatorController dcc = new DirectionCalculatorController();
        WinController wc = new WinController();
        LoseController lc = new LoseController();
        View view = new View();
        boolean w = false;
        boolean l = false;

        view.askForSize();
        Field field = new Field(view.inputSize);
        DigitGenerator dg = new DigitGenerator();
        field.getBoard();
//        view.initializeBoardB(field);
        dg.generateDigit(field);
        view.printBoard(field);

//        for (int i = 2_000_000_000; i > 0; i--)
        while (wc.getWinner(field) == false && lc.getLooser(field) == false)
        {
//            gc.makeMove(dg, gc, dcc, field, view);

            gc.generateAutoMove(dcc, field);
            dg.generateDigit(field);
            view.printBoard(field);
            w = wc.getWinner(field);
//            System.out.println("winner = "+w);
            l = lc.getLooser(field);
//            System.out.println("loser = "+l);
            if (l == true) {
                System.out.println("You lose!");
                System.out.println("GAME OVER");
                return;
            }
            if (w == true) {
                System.out.println("You win!");
                System.out.println("GAME OVER");
                return;
            }
        }








//        System.out.println(field.digitArray[0][0]);
//        System.out.println(field.digitArray[0][4]);
//        System.out.println(field.digitArray[4][0]);
//        System.out.println(field.digitArray[4][4]);

//        dcc.altLeftCalculator(field);
//        field.generateDigit();
//        view.printBoard(field);
//        dcc.altUpCalculator(field);
//        field.generateDigit();
//        view.printBoard(field);
//        dcc.altRightCalculator(field);
//        field.generateDigit();
//        view.printBoard(field);
//        dcc.altDownCalculator(field);
//        field.generateDigit();
//        view.printBoard(field);






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
