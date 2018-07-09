package twothousandfortyeight.controller;


import twothousandfortyeight.model.Field;

public class LoseController {

    public boolean getLooser(Field field) {

        int counter = 0;

//        boolean ability = field.checkAllAbilities();

        boolean b = false;

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
            System.out.println("все ячейки заняты");
            if (!field.checkAllAbilities()) {
                System.out.println("ходить некуда!");
                b = true;
            } else {
                System.out.println("есть возможность походить!");
            }
        }

        return b;
    }
}
