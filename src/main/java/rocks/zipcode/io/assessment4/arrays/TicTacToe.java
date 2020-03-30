package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;
    String[] row1;
    String[] row2;
    String[] row3;

    public TicTacToe(String[][] board) {
        this.board = board;
        this.row1 = board[0];
        this.row2 = board[1];
        this.row3 = board[2];
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {

        String[] column = new String[3];
        column[0] = board[0][value];
        column[1] = board[1][value];
        column[2] = board[2][value];
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        String[] row = getRow(rowIndex);

        String first = row[0];
        for(String element : row){
            if(!first.equals(element)){
                return false;
            }
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        String[] column = getColumn(columnIndex);

        String first = column[0];
        for(String element : column){
            if(!first.equals(element)){
                return false;
            }
        }
        return true;
    }

    public String getWinner() {

        for(int x = 0; x <= 2 ; x++){
            if(isRowHomogenous(x)){
                return getRow(x)[0];
            }
            if(isColumnHomogeneous(x)){
                return getColumn(x)[0];
            }
        }

        return getRow(1)[1];
    }

    public String[][] getBoard() {
        return this.board;
    }
}
