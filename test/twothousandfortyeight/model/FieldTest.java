package twothousandfortyeight.model;

import org.junit.Test;

import static org.junit.Assert.*;


public class FieldTest {
    @Test
    public void getSize() throws Exception {

        final int inputValue = 4;
        final int expectedValue = inputValue;
        final Field field = new Field (inputValue);
        final int actualValue = field.getSize();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void createBoard() throws Exception {

        final int inputValue = 4;
        final int [][] expectedValue = new int[4][4];
        final Field field = new Field (inputValue);
        final int [][] actualValue = field.getBoard();

        assertArrayEquals(expectedValue, actualValue);
//        System.out.println(inputValue);
//
//        for(int i = 0; i < expectedValue.length; i++) {
//            for (int j = 0; j < expectedValue[i].length; j++) {
//                System.out.print(expectedValue[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

}