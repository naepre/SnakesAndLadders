import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rook extends Figures{

    private char name;
    private char color;
    private int x;
    private int y;

    public Rook(char name, char color, int x, int y){
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;

    }

    public char getName(){
        return this.name;
    }

    public char getColor(){
        return this.color;
    }

    public ArrayList move (int x, int y, char[][][] board)
    {
        ArrayList possibleMoves = new ArrayList<>();
        for (int i = x+1; i <= 6; i++) {
            if (board[y][i].length != 0){
                int[] figPos = {y, i};
                Object[] cell = {board[y][i], figPos};
                possibleMoves.add(cell);
                break;
            }

        }
        for (int i = x-1; i >= 1; i--) {
            if (board[y][i].length != 0) {
                int[] figPos = {y, i};
                Object[] cell = {board[y][i], figPos};
                possibleMoves.add(cell);

                break;
            }
        }
        for (int i = y+1; i <= 6; i++) {
            if (board[i][x].length != 0) {
                int[] figPos = {i, x};
                Object[] cell = {board[i][x], figPos};
                possibleMoves.add(cell);

                break;
            }
        }
        for (int i = y-1; i >= 1; i--) {
            if (board[i][x].length != 0) {
                int[] figPos = {i, x};
                Object[] cell = {board[i][x], figPos};
                possibleMoves.add(cell);

                break;
            }
        }
        return possibleMoves;
    }
}