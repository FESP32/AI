public class Board {

    Tile[][] board;

    public void createMatrix() {

        board = new Tile[8][8];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                Tile auxTile = new Tile(col, row ,false,Character.toString((char)(65 + col)));

                board[col][row] = auxTile;
            }
        }
    }

   public String toString() {

       String boardString = "";

       for (int row = 0; row < board.length; row++) {
           for (int col = 0; col < board[row].length; col++) {
               boardString += "(" + board[col][row].toString() + ")";
           }
           boardString += "\n";
       }
       System.out.println("");

       return boardString;
   }
}
