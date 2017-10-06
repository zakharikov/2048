package twothousandfortyeight;


import twothousandfortyeight.model.Field;
import twothousandfortyeight.view.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        view.askForSize();

        Field field = new Field(view.inputSize);
        System.out.println(field);

        view.printBoard(field);

    }
}
