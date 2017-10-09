package twothousandfortyeight.controller;


import twothousandfortyeight.model.Field;

public class LoseController {

    public void getLooser (Field field) {

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
            System.out.println("You lose! How could anyone be so stupid?");
            System.out.println();
        }


    }
}
