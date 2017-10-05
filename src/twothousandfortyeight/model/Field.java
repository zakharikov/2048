package twothousandfortyeight.model;


public class Field {

    public int size;

    public int[][] digitArray;

    public Field(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int[][] createBoard(int size) {
       digitArray = new int[size][size];
       return digitArray;
    }

}
