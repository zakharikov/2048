package twothousandfortyeight.controller;


import twothousandfortyeight.model.Field;

public class LoseController {

    public boolean getLooser(Field field) {
//
//        boolean bb = false;
//
//        if (field.ifThereAnyFreeCells()) {
//            if (!this.ability2MoveWhenAllCellsAreOccupied(field)) {
//                bb = true;
//            }
//        }
//        return bb;
//    }

        boolean b = false;

//        if (field.ifThereAnyFreeCells()) {
//            if (!field.ability2MoveWhenAllCellsAreOccupied()) {
//                b = true;
//            }
//        }
//
//
//
//        return b;
//    }

        int counter = 0;

        for (int i = 0; i < field.digitArray.length; i++) {
            for (int j = 0; j < field.digitArray[i].length; j++) {
                if (field.digitArray[i][j] != 0 && field.digitArray[i][j] < 2048) {
                    counter++;
                }
            }
        }

//        if (counter == field.digitArray.length * field.digitArray.length) {
//            System.out.println("все ячейки заняты, но возможно есть куда походить");
//            b = true;
//        }

        if (counter == field.digitArray.length * field.digitArray.length) {
            System.out.println("LoseController все ячейки заняты");
            if (!field.moveIsAvailable()) {
                b = true;
                System.out.println("LoseController вернул true");
            } else {
                b = false;
                System.out.println("LoseController вернул false");
            }
        }

        return b;
    }

}