package twothousandfortyeight.controller;


import twothousandfortyeight.model.Field;

public class DirectionCalculatorController {

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

    public Field leftCalculator (Field field) {

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j <= field.digitArray[i].length; j++) {
                for (int k = 1; k < field.digitArray.length - j; k++) {

                    if (field.digitArray[i][j] == 0) {
                        break;
                    }
                    if (field.digitArray[i][j] != field.digitArray[i][j + k]
                            && field.digitArray[i][j] > 0
                            && field.digitArray[i][j + k] > 0) {
                        break;
                    }
                    if (field.digitArray[i][j] == field.digitArray[i][j + k]
                            && field.digitArray[i][j] > 0
                            && field.digitArray[i][j + k] > 0) {
                        field.digitArray[i][j] += field.digitArray[i][j + k];
                        field.digitArray[i][j + k] = 0;
                        break;
                    }
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            leftMover(field);
        }

        return field;
    }

    public Field upCalculator (Field field) {

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j <= field.digitArray[i].length; j++) {
                for (int k = 1; k < field.digitArray.length - j; k++) {

                    if (field.digitArray[j][i] == 0) {
                        break;
                    }
                    if (field.digitArray[j][i] != field.digitArray[j + k][i]
                            && field.digitArray[j][i] > 0
                            && field.digitArray[j + k][i] > 0) {
                        break;
                    }
                    if (field.digitArray[j][i] == field.digitArray[j + k][i]
                            && field.digitArray[j][i] > 0
                            && field.digitArray[j + k][i] > 0) {
                        field.digitArray[j][i] += field.digitArray[j + k][i];
                        field.digitArray[j + k][i] = 0;
                        break;
                    }
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            upMover(field);
        }

        return field;
    }

    public Field rightCalculator (Field field) {

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = field.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (field.digitArray[i][j] == 0) {
                        break;
                    }
                    if (field.digitArray[i][j] != field.digitArray[i][j - k]
                            && field.digitArray[i][j] > 0
                            && field.digitArray[i][j - k] > 0) {
                        break;
                    }
                    if (field.digitArray[i][j] == field.digitArray[i][j - k]
                            && field.digitArray[i][j] > 0
                            && field.digitArray[i][j - k] > 0) {
                        field.digitArray[i][j] += field.digitArray[i][j - k];
                        field.digitArray[i][j - k] = 0;
                        break;
                    }
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            rightMover(field);
        }

        return field;
    }

    public Field downCalculator (Field field) {

        for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = field.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (field.digitArray[j][i] == 0) {
                        break;
                    }
                    if (field.digitArray[j][i] != field.digitArray[j - k][i]
                            && field.digitArray[j][i] > 0
                            && field.digitArray[j - k][i] > 0) {
                        break;
                    }
                    if (field.digitArray[j][i] == field.digitArray[j - k][i]
                            && field.digitArray[j][i] > 0
                            && field.digitArray[j - k][i] > 0) {
                        field.digitArray[j][i] += field.digitArray[j - k][i];
                        field.digitArray[j - k][i] = 0;
                        break;
                    }
                }
            }
        }

        for (int x = 0; x < field.digitArray.length; x++) {
            downMover(field);
        }

        return field;
    }

    public boolean leftAbility2Move (Field field) {

        boolean x = false;

        exitPoint: for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j <= field.digitArray[i].length; j++) {
                for (int k = 1; k < field.digitArray.length - j; k++) {

                    if (field.digitArray[i][j] == 0 && field.digitArray[i][j + k] != 0) {
                        x = true;
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j <= field.digitArray[i].length; j++) {
                for (int k = 1; k < field.digitArray.length - j; k++) {

                    if (field.digitArray[i][j] == field.digitArray[i][j + k]
                            && field.digitArray[i][j] != 0
                            && field.digitArray[i][j + k] != 0) {
                        x = true;
                        break exitPoint2;
                    }
                }
            }
        }
        return x;
    }

    public boolean upAbility2Move (Field field) {

        boolean x = false;

        exitPoint: for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j <= field.digitArray[i].length; j++) {
                for (int k = 1; k < field.digitArray.length - j; k++) {

                    if (field.digitArray[j][i] == 0 && field.digitArray[j + k][i] != 0) {
                        x = true;
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j <= field.digitArray[i].length; j++) {
                for (int k = 1; k < field.digitArray.length - j; k++) {

                    if (field.digitArray[j][i] == field.digitArray[j + k][i]
                            && field.digitArray[j][i] != 0
                            && field.digitArray[j + k][i] != 0) {
                        x = true;
                        break exitPoint2;
                    }
                }
            }
        }
        return x;
    }

    public boolean rightAbility2Move (Field field) {

        boolean x = false;

        exitPoint: for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = field.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (field.digitArray[i][j] == 0 && field.digitArray[i][j - k] != 0) {
                        x = true;
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = field.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (field.digitArray[i][j] == field.digitArray[i][j - k]
                            && field.digitArray[i][j] != 0
                            && field.digitArray[i][j - k] != 0) {
                        x = true;
                        break exitPoint2;
                    }
                }
            }
        }
        return x;
    }

    public boolean downAbility2Move (Field field) {

        boolean x = false;

        exitPoint: for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = field.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (field.digitArray[j][i] == 0 && field.digitArray[j - k][i] != 0) {
                        x = true;
                        break exitPoint;
                    }
                }
            }
        }
        exitPoint2: for(int i = 0; i < field.digitArray.length; i++) {
            for (int j = field.digitArray[i].length - 1; j >= 0; j--) {
                for (int k = 1; k < j + 1; k++) {

                    if (field.digitArray[j][i] == field.digitArray[j - k][i]
                            && field.digitArray[j][i] != 0
                            && field.digitArray[j - k][i] != 0) {
                        x = true;
                        break exitPoint2;
                    } else {
                        break;
                    }
                }
            }
        }
        return x;
    }

}


