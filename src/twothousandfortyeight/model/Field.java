package twothousandfortyeight.model;


public class Field {

    public int size;

    public Field(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int[][] createBoard(int size) {
       int[][] i = new int[size][size];
       return i;
    }

}
