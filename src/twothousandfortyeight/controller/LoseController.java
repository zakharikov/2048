package twothousandfortyeight.controller;


import twothousandfortyeight.model.Field;

public class LoseController {

    public boolean getLooser (Field field) {

        int counter = 0;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < field.digitArray[i].length; j++) {
                if (field.digitArray[i][j] != 0 && field.digitArray[i][j] < 2048) {
                    counter++;
                }
            }
        }

        if (counter == field.digitArray.length * field.digitArray.length) {
            System.out.println();
            System.out.println("Ты проиграл, тупица!");
            System.out.println();
            return true;
        } else {
            return false;
        }


    }
}
