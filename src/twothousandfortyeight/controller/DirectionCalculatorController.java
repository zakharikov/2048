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

        for (int x = 0; x < field.digitArray.length; x++) {
            rightMover(field);
        }

        return field;
    }

    private Field rightMover(Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = cellIndex; j >= 1; j--) {
                if (field.digitArray[i][j] == 0) {
                    field.digitArray[i][j] += field.digitArray[i][j - 1];
                    field.digitArray[i][j - 1] = 0;
                }
            }
        }

        return field;
    }

    public Field leftCalculator (Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < cellIndex; j++) {
                if (field.digitArray[i][j] == field.digitArray[i][j + 1]) {
                    field.digitArray[i][j] += field.digitArray[i][j + 1];
                    field.digitArray[i][j + 1] = 0;
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            leftMover(field);
        }

        return field;
    }

    private Field leftMover(Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < cellIndex; j++) {
                if (field.digitArray[i][j] == 0) {
                    field.digitArray[i][j] += field.digitArray[i][j + 1];
                    field.digitArray[i][j + 1] = 0;
                }
            }
        }

        return field;
    }

    public Field upCalculator (Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < cellIndex; j++) {
                if (field.digitArray[j][i] == field.digitArray[j + 1][i]) {
                    field.digitArray[j][i] += field.digitArray[j + 1][i];
                    field.digitArray[j + 1][i] = 0;
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            upMover(field);
        }

        return field;
    }

    private Field upMover(Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < cellIndex; j++) {
                if (field.digitArray[j][i] == 0) {
                    field.digitArray[j][i] += field.digitArray[j + 1][i];
                    field.digitArray[j + 1][i] = 0;
                }
            }
        }

        return field;
    }

    public Field downCalculator (Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = cellIndex; j >= 1; j--) {
                if (field.digitArray[j][i] == field.digitArray[j - 1][i]) {
                    field.digitArray[j][i] += field.digitArray[j - 1][i];
                    field.digitArray[j - 1][i] = 0;
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            downMover(field);
        }

        return field;
    }

    private Field downMover(Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = cellIndex; j >= 1; j--) {
                if (field.digitArray[j][i] == 0) {
                    field.digitArray[j][i] += field.digitArray[j - 1][i];
                    field.digitArray[j - 1][i] = 0;
                }
            }
        }

        return field;
    }

    public Field altLeftCalculator (Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < cellIndex; j++) {
                for (int k = 1; k <= cellIndex - j; k++) {
                    if (field.digitArray[i][j] == field.digitArray[i][j + k]) {
                        field.digitArray[i][j] += field.digitArray[i][j + k];
                        field.digitArray[i][j + k] = 0;
                        j++;
                    }
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            leftMover(field);
        }

        return field;
    }

    public Field altUpCalculator (Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < cellIndex; j++) {
                for (int k = 1; k <= cellIndex - j; k++) {
                    if (field.digitArray[j][i] == field.digitArray[j + k][i]) {
                        field.digitArray[j][i] += field.digitArray[j + k][i];
                        field.digitArray[j + k][i] = 0;
                        j++;
                    }
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            upMover(field);
        }

        return field;
    }

    public Field altRightCalculator (Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = cellIndex; j >= 1; j--) {
                for (int k = 1; k <= j; k++) {
//                    с этим надо что-то делать
//                    if (field.digitArray[i][j] != field.digitArray[i][j - k]) {
//                        j--;
//                    }
                    if (field.digitArray[i][j] == field.digitArray[i][j - k]) {
                        field.digitArray[i][j] += field.digitArray[i][j - k];
                        field.digitArray[i][j - k] = 0;
                        j--;
                    }
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            rightMover(field);
        }

        return field;
    }

    public Field altDownCalculator (Field field) {

        int cellIndex = field.digitArray.length - 1;

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = cellIndex; j >= 1; j--) {
                for (int k = 1; k <= j; k++) {
                    if (field.digitArray[j][i] == field.digitArray[j - k][i]) {
                        field.digitArray[j][i] += field.digitArray[j - k][i];
                        field.digitArray[j - k][i] = 0;
                        j--;
                    }
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            downMover(field);
        }

        return field;
    }

}


