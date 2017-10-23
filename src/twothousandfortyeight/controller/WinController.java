package twothousandfortyeight.controller;

import twothousandfortyeight.model.Field;

public class WinController {

    public boolean getWinnner (Field field) {

        boolean value = false;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < field.digitArray[i].length; j++) {
                if (field.digitArray[i][j] == 2048) {
                    value = true;
                } else {
                    value = false;
                }
            }
        }
        return value;
    }
}
