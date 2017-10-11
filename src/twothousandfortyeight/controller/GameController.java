package twothousandfortyeight.controller;

import twothousandfortyeight.model.Score;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;
import twothousandfortyeight.controller.DirectionCalculatorController;

import java.util.Random;
import java.awt.event.KeyEvent;


public class GameController {

//    public Field makeMove (Field field, Score score) {
//
//
//
//    }

    public void direction (View view, DirectionCalculatorController dcc, Field field) {
        switch (view.askForDirection()) {
            case "w": dcc.upCalculator(field);
            case "a": dcc.leftCalculator(field);
            case "s": dcc.downCalculator(field);
            case "d": dcc.rightCalculator(field);
        }
    }

}
