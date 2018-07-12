package twothousandfortyeight.controller;

import twothousandfortyeight.model.Score;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;
import twothousandfortyeight.controller.DirectionCalculatorController;

import java.util.Random;
import java.awt.event.KeyEvent;


public class GameController {

    public int moveIsMade = 0;

    public Field generateAutoMove (DirectionCalculatorController dcc, Field field) {

        Random r = new Random();

        switch (r.nextInt(4) + 1) {

            case 1:
                if (field.checkLeftAbility2Move()) {
                    dcc.leftCalculator(field);
                    System.out.println("left");
                    moveIsMade++;
                    break;
                } else {
                    System.out.println("left - no move");
                    break;
                }
            case 2:
                if (field.checkUpAbility2Move()) {
                    dcc.upCalculator(field);
                    System.out.println("up");
                    moveIsMade++;
                    break;
                } else {
                    System.out.println("up - no move");
                    break;
                }
            case 3:
                if (field.checkRightAbility2Move()) {
                    dcc.rightCalculator(field);
                    System.out.println("right");
                    moveIsMade++;
                    break;
                } else {
                    System.out.println("right - no move");
                    break;
                }
            case 4:
                if (field.checkDownAbility2Move()) {
                    dcc.downCalculator(field);
                    System.out.println("down");
                    moveIsMade++;
                    break;
                } else {
                    System.out.println("down - no move");
                    break;
                }
        }
        return field;
    }

    public boolean ifMoveIsMade () {
        if (moveIsMade != 0) return true;
        else return false;
    }

}
