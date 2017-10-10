package twothousandfortyeight.controller;


import twothousandfortyeight.model.Field;

public class DirectionCalculatorController {

    public Field rightCalculator (Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = cellIndex; j >= 1; j--) {
                if (field.digitArray[i][j] == field.digitArray[i][j - 1]) {
                    field.digitArray[i][j] += field.digitArray[i][j - 1];
                    field.digitArray[i][j - 1] = 0;
                }
            }
        }

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = cellIndex; j >= 1; j--) {
                while (field.digitArray[i][j] == 0) {
                    field.digitArray[i][j] += field.digitArray[i][j - 1];
                    field.digitArray[i][j - 1] = 0;
                }
            }
        }

        return field;
    }

//    public Field leftCalculator (Field field) {
//
//    }
//
//    public Field upCalculator (Field field) {
//
//    }
//
//    public Field downCalculator (Field field) {
//
//    }


}
