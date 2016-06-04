import java.util.Scanner;


public class MainClass {

    static Scanner input = new Scanner(System.in);
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    static int column;
    static int rown;

    public static void main(String args[]) {


        Board board = new Board();

        board.createMatrix();

        System.out.print(board.toString());

        System.out.println("\n");


        for (int i = 0; i <= 8; i++) {

            do {
                System.out.println("insert your col");
                column = input.nextInt();
                System.out.println("insert your row");
                rown = input.nextInt();
                System.out.print(board.board[column][rown].toString() + "\n");
            } while (board.board[column][rown].isOccupied());

            System.out.print("\n");

            for (int row = 0; row < board.board.length; row++) {
                for (int col = 0; col < board.board[row].length; col++) {


                    if (board.board[col][row].isOccupied() == false) {

                        if ((board.board[col][row].getCol() == column  || board.board[col][row].getRow() == rown) &&
                                !(board.board[col][row].getCol() == column && board.board[col][row].getRow() == rown)) {

                            board.board[col][row].setOccupied(true);
                            System.out.print(ANSI_RED + "(" + board.board[col][row].toString() + ")" + ANSI_WHITE);

                        }else if(board.board[col][row].getCol() == column  && board.board[col][row].getRow() == rown){
                                System.out.print(ANSI_GREEN + "(" + board.board[col][row].toString() + ")" + ANSI_WHITE);
                                board.board[col][row].setOccupied(true);
                                board.board[col][row].setHasQueen(true);

                        }else{
                            System.out.print("(  )");
                        }

                    } else if (board.board[col][row].isOccupied() == true && !board.board[col][row].isHasQueen()) {
                        System.out.print(ANSI_BLUE + "(" + "oc" + ")" + ANSI_WHITE);

                    } else if (board.board[col][row].isHasQueen()){
                        System.out.print(ANSI_GREEN + "(" + board.board[col][row].toString() + ")" + ANSI_WHITE);
                    }
                }
                System.out.println("");

            }
        }
    }
}