package twothousandfortyeight;


import twothousandfortyeight.controller.GameController;
import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;

public class Main {

    public static void main(String[] args) {

        View view = new View();
        view.askForSize();

        Field field = new Field(view.inputSize);
        field.createBoard();
        field.firstMove();
        view.printBoard(field);

//        GameController gc = new GameController();
//        gc.firstMove(field);
    }
}
