
public class Tile {

    private int col;
    private int row;
    private boolean occupied;
    private boolean hasQueen;
    private String letter;


    public Tile(){

    }

    public Tile(int col,int row,boolean occupied,String letter){
        this.col = col;
        this.row = row;
        this.occupied = occupied;
        this.letter = letter;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
    public String toString(){

        return letter + row;
    }

    public boolean isHasQueen() {
        return hasQueen;
    }

    public void setHasQueen(boolean hasQueen) {
        this.hasQueen = hasQueen;
    }
}
