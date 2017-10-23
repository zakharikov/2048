package twothousandfortyeight.controller;

import twothousandfortyeight.model.Score;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;
import twothousandfortyeight.controller.DirectionCalculatorController;

import java.util.Random;
import java.awt.event.KeyEvent;


public class GameController {

    public int previousMove = 0;

    public Field generateAutoMove (DirectionCalculatorController dcc, Field field, View view) {

        Random r = new Random();

        switch (r.nextInt(4) + 1) {

            case 1:
                if (dcc.leftAbility2Move(field)) {
                    dcc.leftCalculator(field);
                    field.generateDigit();
                    view.printBoard(field);
                    break;
                } else {
                    generateAutoMove(dcc, field, view);
                }
            case 2:
                if (dcc.upAbility2Move(field)) {
                    dcc.upCalculator(field);
                    field.generateDigit();
                    view.printBoard(field);
                    break;
                } else {
                    generateAutoMove(dcc, field, view);
                }
            case 3:
                if (dcc.rightAbility2Move(field)) {
                    dcc.rightCalculator(field);
                    field.generateDigit();
                    view.printBoard(field);
                    break;
                } else {
                    generateAutoMove(dcc, field, view);
                }
            case 4:
                if (dcc.downAbility2Move(field)) {
                    dcc.downCalculator(field);
                    field.generateDigit();
                    view.printBoard(field);
                    break;
            } else {
                generateAutoMove(dcc, field, view);
            }
        }
        return field;
    }
    public void autoPlay(WinController wc, LoseController lc, DirectionCalculatorController field, Field dcc, View view) {


    }
}
