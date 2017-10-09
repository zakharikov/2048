package twothousandfortyeight.controller;

import twothousandfortyeight.model.Field;

public class WinController {
    public void getWinnner (Field field) {

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < field.digitArray[i].length; j++) {
                if (field.digitArray[i][j] == 2048) {
                    System.out.println();
                    System.out.println("You win! Great job!");
                    System.out.println();
                }
            }
        }
    }
}
