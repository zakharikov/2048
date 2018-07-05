package twothousandfortyeight.controller;

import twothousandfortyeight.model.Score;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;
import twothousandfortyeight.controller.DirectionCalculatorController;

import java.util.Random;
import java.awt.event.KeyEvent;


public class GameController {

    public int previousMove = 0;

    public Field generateAutoMove (DirectionCalculatorController dcc, Field field) {

        Random r = new Random();

        switch (r.nextInt(4) + 1) {

            case 1:
                if (dcc.leftAbility2Move(field)) {
                    dcc.leftCalculator(field);
                    System.out.println("left");
                    break;
                } else {
                    generateAutoMove(dcc, field);
                }
            case 2:
                if (dcc.upAbility2Move(field)) {
                    dcc.upCalculator(field);
                    System.out.println("up");
                    break;
                } else {
                    generateAutoMove(dcc, field);
                }
            case 3:
                if (dcc.rightAbility2Move(field)) {
                    dcc.rightCalculator(field);
                    System.out.println("right");
                    break;
                } else {
                    generateAutoMove(dcc, field);
                }
            case 4:
                if (dcc.downAbility2Move(field)) {
                    dcc.downCalculator(field);
                    System.out.println("down");
                    break;
                } else {
                    generateAutoMove(dcc, field);
                }
        }
        return field;
    }
    public void makeMove(DigitGenerator dg, GameController gc, DirectionCalculatorController dcc, Field field, View view) {

        gc.generateAutoMove(dcc, field);
        dg.generateDigit(field);
        view.printBoard(field);


    }
}
